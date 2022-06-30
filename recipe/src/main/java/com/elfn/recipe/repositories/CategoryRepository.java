package com.elfn.recipe.repositories;

import com.elfn.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @PROJECT recipe
 * @Author Elimane on 30/06/2022
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
