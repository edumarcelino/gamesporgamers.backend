package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.service.CategoryService;

@Path("/api/v1/categories")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoryResource {

    @Inject
    CategoryService categoryService;

    @GET
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GET
    @Path("/{id}")
    public Category getCategoryById(@PathParam("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @POST
    @Transactional
    public Response createCategory(Category category) {
        categoryService.addCategory(category);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateCategory(@PathParam("id") Long id, Category updatedCategory) {
        Category category = categoryService.getCategoryById(id);
        if (category == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        category.setName(updatedCategory.getName());
        // Atualize outros atributos, se necessário
        categoryService.updateCategory(category);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteCategory(@PathParam("id") Long id) {
        Category category = categoryService.getCategoryById(id);
        if (category == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        categoryService.deleteCategory(category);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}