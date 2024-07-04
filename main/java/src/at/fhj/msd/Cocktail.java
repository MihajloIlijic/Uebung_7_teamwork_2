package at.fhj.iit;

import java.util.List;

/**
 * Cocktail class which extends the abstract class drink
 */
public class Cocktail extends Drink {
    private List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with the given name and list
     *
     * @param name the name of the cocktail
     * @param ingredients the list of liquid ingredients in the cocktail
     */

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }
    /**
     * Calculates and returns total volume of the cocktail.
     *
     * @return the total volume of the cocktail in liters
     */

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    /**
     * Calculates and returns alcohol percentage of the cocktail.
     *
     * @return the alcohol volume percentage of the cocktail
     */

    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0.0;

        double totalAlcoholVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalAlcoholVolume += liquid.getVolume() * (liquid.getAlcoholPercent() / 100);
        }
        return (totalAlcoholVolume / totalVolume) * 100;
    }


    /**
     * Determines if the cocktail is alcoholic.
     *
     * @return true if the cocktail contains alcoholic ingredients, otherwise false
     */

    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : ingredients) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the list of liquid ingredients in the cocktail.
     *
     * @return the list of liquid ingredients
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Returns a string representation of cocktail, including its name and ingredients.
     *
     * @return a string representation of the cocktail
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cocktail: ").append(name).append("\nIngredients:\n");
        for (Liquid liquid : ingredients) {
            sb.append("- ").append(liquid).append("\n");
        }
        return sb.toString();
    }

}
