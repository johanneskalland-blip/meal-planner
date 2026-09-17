package no.fremstad.mealplanner.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<RecipeIngredient> ingredients;

    public Recipe(String name, List<RecipeIngredient> ingredients){
        if(name == null || name.isBlank() || ingredients == null|| ingredients.isEmpty())
            throw new IllegalArgumentException("Invalid Recipe parameters");
        for (RecipeIngredient ingredient : ingredients){
            if(ingredient == null){
                throw new IllegalArgumentException("Ingredients cannot contain null");
            }
        }
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);

    }

    public String getName(){
        return name;
    }

    public List<RecipeIngredient> getIngredients(){
        return new ArrayList<>(ingredients);
    }
    
}
