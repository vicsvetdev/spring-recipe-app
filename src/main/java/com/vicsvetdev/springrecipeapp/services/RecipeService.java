package com.vicsvetdev.springrecipeapp.services;

import com.vicsvetdev.springrecipeapp.commands.RecipeCommand;
import com.vicsvetdev.springrecipeapp.model.Recipe;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
