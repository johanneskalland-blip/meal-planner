package no.fremstad.mealplanner.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventoryItemTest {
    
    @Test
    void testValidInventoryItem(){
        Ingredient kylling = new Ingredient("Kyllingfilet", IngredientCategory.MEAT);
        InventoryItem item = new InventoryItem(kylling, 500, Unit.GRAM, StorageLocation.FRIDGE);

        assertEquals(kylling, item.getIngredient());
        assertEquals(IngredientCategory.MEAT, kylling.getCategory());
        assertEquals("Kyllingfilet", kylling.getName());
        assertEquals(500.0, item.getAmount());
        assertEquals(Unit.GRAM, item.getUnit());
        assertEquals(StorageLocation.FRIDGE, item.getLocation());
    }
    
    @Test
    void testNegativeAmountThrowsException(){
        Ingredient kylling = new Ingredient("Kyllingfilet", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
        new InventoryItem(kylling, -100, Unit.GRAM, StorageLocation.FRIDGE));
    }

    @Test
    void testNullIngredientsThrowsException(){
         assertThrows(IllegalArgumentException.class, () -> 
         new InventoryItem(null,500, Unit.GRAM, StorageLocation.FRIDGE));
    }

    @Test
    void testNullUnitThrowsException(){
        Ingredient kylling = new Ingredient("Kyllingfilet", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
         new InventoryItem(kylling,500, null, StorageLocation.FRIDGE));
    }

    @Test
    void testNullLocationThrowsException(){
        Ingredient kylling = new Ingredient("Kyllingfilet", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
         new InventoryItem(kylling,500, Unit.GRAM, null));
    }
}
