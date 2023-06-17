package br.com.gamesporgamers;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mindrot.jbcrypt.BCrypt;

import br.com.gamesporgamers.entity.Platform;
import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.enumTypes.Role;
import br.com.gamesporgamers.service.PlatformService;
import br.com.gamesporgamers.service.CategoryService;
import br.com.gamesporgamers.service.UserService;
import io.quarkus.runtime.StartupEvent;

@Singleton
public class Startup {

    @Inject
    PlatformService platformService;

    @Inject
    CategoryService categoryService;

    @Inject
    UserService userService;

    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {

        Set<Role> rolesAdmin = new HashSet<>();
        rolesAdmin.add(Role.ADMIN);
        rolesAdmin.add(Role.USER);

        Set<Role> rolesUser = new HashSet<>();
        rolesUser.add(Role.USER);

        String passwordHashed = BCrypt.hashpw("password@2305", BCrypt.gensalt());

        userService.addUser(new User("admin", passwordHashed, rolesAdmin));
        userService.addUser(new User("user", passwordHashed, rolesUser));

    }

    @Transactional
    public void loadPlatformsAndCategories(@Observes StartupEvent evt) {

        // Primeiro cadastro das plataformas
        List<String> platformsName = new ArrayList<String>();

        platformsName.add("X-Box");
        platformsName.add("Playstation");
        platformsName.add("Switch");
        platformsName.add("PC");
        platformsName.add("Portátil");
        platformsName.add("Celular");

        for (String platformName : platformsName) {
            Platform platform = new Platform();
            platform.setName(platformName);
            platform.setVisible(true);
            platformService.addPlatform(platform);
        }

        // Gera todas as subcategorias
        List<String> categoriesName = new ArrayList<String>();
        categoriesName.add("Notícias");
        categoriesName.add("Análises");
        categoriesName.add("Vídeos");
        categoriesName.add("Artigos");
        categoriesName.add("Promoções");

        for (String categoryName : categoriesName) {
            Category category = new Category(categoryName, true);
            categoryService.addCategory(category);
        }


    }

}
