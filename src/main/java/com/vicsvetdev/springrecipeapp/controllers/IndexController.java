package com.vicsvetdev.springrecipeapp.controllers;

import com.vicsvetdev.springrecipeapp.model.Category;
import com.vicsvetdev.springrecipeapp.model.UnitOfMeasure;
import com.vicsvetdev.springrecipeapp.repositories.CategoryRepository;
import com.vicsvetdev.springrecipeapp.repositories.UnitOfMeasureRepository;
import com.vicsvetdev.springrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
