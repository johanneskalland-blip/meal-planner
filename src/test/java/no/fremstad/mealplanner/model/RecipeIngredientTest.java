package no.fremstad.mealplanner.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecipeIngredientTest {

    @Test
    void testValidRecipeIngredient(){
        Ingredient kylling = new Ingredient("kylling", IngredientCategory.MEAT);
        RecipeIngredient kyllingstrimler = new RecipeIngredient(kylling, 200, Unit.GRAM);
        
        assertEquals(kylling, kyllingstrimler.getIngredient());
        assertEquals(200, kyllingstrimler.getAmount());
        assertEquals(Unit.GRAM, kyllingstrimler.getUnit());
    }

    @Test
    void testNullIngredientThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> 
        new RecipeIngredient(null, 200, Unit.GRAM));
    }

    @Test
    void testZeroAmountThrowsException(){
        Ingredient kylling = new Ingredient("kylling", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
        new RecipeIngredient(kylling, 0, Unit.GRAM));
    }

    @Test
    void testNegativeAmountThrowsException(){
        Ingredient kylling = new Ingredient("kylling", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
        new RecipeIngredient(kylling, -50, Unit.GRAM));
    }

    @Test
    void testNullUnitThrowsException(){
        Ingredient kylling = new Ingredient("kylling", IngredientCategory.MEAT);
        assertThrows(IllegalArgumentException.class, () -> 
        new RecipeIngredient(kylling, 200, null));
    }
    
}
