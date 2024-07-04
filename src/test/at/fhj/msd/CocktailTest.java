package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class CocktailTest {

    private Cocktail cocktail;
    private Liquid vodka;
    private Liquid orangeJuice;

    @BeforeEach
    void setUp() {
        vodka = new Liquid("Vodka", 0.1, 40);
        orangeJuice = new Liquid("Orange Juice", 0.15, 0);
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(vodka);
        ingredients.add(orangeJuice);
        cocktail = new Cocktail("Screwdriver", ingredients);
    }

    @Test
    void testGetVolume() {
        assertEquals(0.25, cocktail.getVolume(), 0.0001);
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(16, cocktail.getAlcoholPercent(), 0.0001);
    }

    @Test
    void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());

        List<Liquid> nonAlcoholicIngredients = new ArrayList<>();
        nonAlcoholicIngredients.add(new Liquid("Water", 0.2, 0));
        nonAlcoholicIngredients.add(new Liquid("Juice", 0.3, 0));
        Cocktail nonAlcoholicCocktail = new Cocktail("Non Alcoholic", nonAlcoholicIngredients);
        assertFalse(nonAlcoholicCocktail.isAlcoholic());
    }

    @Test
    void testGetIngredients() {
        List<Liquid> ingredients = cocktail.getIngredients();
        assertEquals(2, ingredients.size());
        assertTrue(ingredients.contains(vodka));
        assertTrue(ingredients.contains(orangeJuice));
    }

    @Test
    void testToString() {
        String expected = "Cocktail: Screwdriver\nIngredients:\n- Vodka, 0.1L, 40.0%\n- Orange Juice, 0.15L, 0.0%\n";
        assertEquals(expected, cocktail.toString());
    }
}
