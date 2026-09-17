package no.fremstad.mealplanner.model;

public class Ingredient {
    private String name;
    private IngredientCategory category;


    public Ingredient(String name, IngredientCategory category){
        if(name == null || name.isBlank() || category == null) 
            throw new IllegalArgumentException("Invalid ingredient arguments");
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public IngredientCategory getCategory(){
        return category;
    }
}
