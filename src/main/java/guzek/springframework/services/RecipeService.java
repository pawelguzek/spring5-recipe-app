package guzek.springframework.services;

import guzek.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Pawel on 21.04.2018.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();

}
