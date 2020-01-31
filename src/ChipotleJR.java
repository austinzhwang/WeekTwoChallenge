import java.util.Random;
import java.util.ArrayList;

public class ChipotleJR {

    public static void main (String[] args) {

        String rice [] = {"white rice", "brown rice", "no rice", "all"};
        String meat [] = {"chicken", "steak", "carnitas", "chorizo", "sofritas", "veggies (as meat option)", "no meat", "all"};
        String beans []  = {"pinto beans", "black beans", "no beans", "all"};
        String salsa  [] = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all"};
        String veggies [] = {"lettuce", "fajita veggies", "no veggies", "all"};
        String cheese [] = {", cheese", ""};
        String guac [] = {", guac", ""};
        String queso [] = {", queso", ""};
        String sourCream [] = {", sour cream", ""};

        ArrayList<Burrito> burritoList = new ArrayList<>();

        // Generates 25 random burritos
        for (int i = 0; i < 25; i++) {
            Burrito b = new Burrito(getRandomIngredient(rice), getRandomIngredient(meat), getRandomIngredient(beans),
                    getRandomIngredient(salsa), getRandomIngredient(veggies), getRandomIngredient(cheese),
                    getRandomIngredient(guac), getRandomIngredient(queso), getRandomIngredient(sourCream), 0);
            b.calcPrice();
            b.addBurrito(burritoList);
            System.out.println(b.printBurritos(burritoList));
            if (i == 24) {
                System.out.println(b.printOrderSummary(burritoList));
            }
        }
    }

    // Private helper method to randomly get an ingredient
    private static String getRandomIngredient(String [] ary) {
        Random rand = new Random();
        int randIngredient = rand.nextInt(ary.length);
        return ary[randIngredient];
    }

}
