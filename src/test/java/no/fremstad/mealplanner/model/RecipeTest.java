package no.fremstad.mealplanner.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RecipeTest {

    @Test
    void testValidRecipe(){
        Ingredient kylling = new Ingredient("Kylling", IngredientCategory.MEAT);
        RecipeIngredient kyllingIngredient = new RecipeIngredient(kylling, 300, Unit.GRAM);
        List<RecipeIngredient> ingredients = List.of(kyllingIngredient);
        Recipe chickenWok = new Recipe("Chicken Wok", ingredients);

        assertEquals("Chicken Wok", chickenWok.getName());
        assertEquals(ingredients, chickenWok.getIngredients());
    }
    
}
