package com.vicsvetdev.springrecipeapp.repositories;

import com.vicsvetdev.springrecipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
