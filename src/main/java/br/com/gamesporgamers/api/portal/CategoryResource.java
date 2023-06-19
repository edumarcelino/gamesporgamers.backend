package br.com.gamesporgamers.api.portal;

import java.util.List;

import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.service.CategoryService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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

}
