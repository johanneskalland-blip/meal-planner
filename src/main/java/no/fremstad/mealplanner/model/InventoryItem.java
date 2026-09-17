package no.fremstad.mealplanner.model;

public class InventoryItem {
    private StorageLocation location;
    private Ingredient ingredient;
    private double amount;
    private Unit unit;

    public InventoryItem(Ingredient ingredient, double amount, Unit unit, StorageLocation location){
        if(amount < 0) throw new IllegalArgumentException("amount cannot be negative");
        if(ingredient == null || unit == null || location == null) throw new IllegalArgumentException("Invalid InventoryItem Arguments");
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
        this.location = location;
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

    public StorageLocation getLocation(){
        return location;
    }

    public String getFormattedAmount(){
        return amount + " " + unit;
    }
}
