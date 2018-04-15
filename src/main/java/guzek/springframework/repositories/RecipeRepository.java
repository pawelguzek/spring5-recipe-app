package guzek.springframework.repositories;

import guzek.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pawel on 15.04.2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
