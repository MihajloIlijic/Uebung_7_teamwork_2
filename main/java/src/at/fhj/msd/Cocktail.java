package at.fhj.iit;

import java.util.List;


public class Cocktail extends Drink {
    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

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

    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : ingredients) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    public List<Liquid> getIngredients() {
        return ingredients;
    }

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
