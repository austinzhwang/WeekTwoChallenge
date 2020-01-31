import java.util.Random;
import java.util.ArrayList;

public class ChipotleJR {

    private static Random rand;

    public static void main (String[] args) {

        String rice [] = {"white", "brown", "no rice", "all"};
        String meat [] = {"chicken", "steak", "carnitas", "chorizo", "sofritas", "veggies", "no meat", "all"};
        String beans []  = {"pinto", "black", "no beans"};
        String salsa  [] = {"mild", "medium", "hot", "no salsa", "all"};
        String veggies [] = {"lettuce", "fajita veggies", "no veggies", "all"};
        String cheese [] = {", cheese", ""};
        String guac [] = {", guac", ""};
        String queso [] = {", queso", ""};
        String sourCream [] = {", sour cream", ""};

        ArrayList<String> burritoList = new ArrayList<>();

        // Generates 25 random burritos
        for (int i = 0; i < 25; i++) {
            Burrito b = new Burrito(getRandomIngredient(rice), getRandomIngredient(meat), getRandomIngredient(beans),
                    getRandomIngredient(salsa), getRandomIngredient(veggies), getRandomIngredient(cheese),
                    getRandomIngredient(guac), getRandomIngredient(queso), getRandomIngredient(sourCream));
            b.calcPrice();
            b.addBurrito(burritoList);
        }

        // Prints out the ArrayList of burritos, their ingredients, and the price
        for (String s : burritoList) {
            System.out.println(s);
        }
    }

    // Private helper method to randomly get an ingredient
    private static String getRandomIngredient(String [] ary) {
        rand = new Random();
        int randIngredient = rand.nextInt(ary.length);
        return ary[randIngredient];
    }

}
