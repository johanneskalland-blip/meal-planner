package no.fremstad.mealplanner.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IngredientTest {

    @Test
    void testValidIngredient(){
        Ingredient kylling = new Ingredient("Kyllingfilet", IngredientCategory.MEAT);
        assertEquals("Kyllingfilet", kylling.getName());
        assertEquals(IngredientCategory.MEAT, kylling.getCategory());
    }

   @Test
    void testBlankNameThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> 
        new Ingredient(" ", IngredientCategory.MEAT));
    }

    @Test
    void testNullNameThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> 
        new Ingredient(null, IngredientCategory.MEAT));
    }

    @Test
    void testNullIngredientCategoryThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> 
        new Ingredient("kylling", null));
    }
    
    
}
