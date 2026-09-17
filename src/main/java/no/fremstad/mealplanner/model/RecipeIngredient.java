package no.fremstad.mealplanner.model;

public class RecipeIngredient {
    private Ingredient ingredient;
    private double amount;
    private Unit unit;

    public RecipeIngredient(Ingredient ingredient, double amount, Unit unit){
        if(ingredient == null || amount <= 0 || unit == null)
            throw new IllegalArgumentException("Invalid RecipeIngredient parameters");
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
    }

    public Ingredient getIngredient(){
        return ingredient;
    }

    public double getAmount(){
        return amount;
    }

    public Unit getUnit(){
        return unit;
    }
}
