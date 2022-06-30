package com.elfn.recipe.repositories;

import com.elfn.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @PROJECT recipe
 * @Author Elimane on 30/06/2022
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
