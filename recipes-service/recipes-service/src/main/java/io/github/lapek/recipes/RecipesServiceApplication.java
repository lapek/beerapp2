package io.github.lapek.recipes;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "recipes-service",
                version = "0.0"
        )
)
public class RecipesServiceApplication {

    public static void main(String[] args) {
        Micronaut.run(RecipesServiceApplication.class, args);
    }
}
