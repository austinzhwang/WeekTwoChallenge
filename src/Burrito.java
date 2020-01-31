import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burrito {

    private String rice, meat, beans, salsa, veggies, cheese, guac, queso, sourCream;
    private final double BASE_PRICE;
    private double price;
    private DecimalFormat currencyFormat = new DecimalFormat("0.00");
    private double sum = 0;

    public Burrito(String rice, String meat, String beans, String salsa, String veggies, String cheese, String guac
    , String queso, String sourCream, double price) {
        this.rice = rice;
        this.meat = meat;
        this.beans = beans;
        this.salsa = salsa;
        this.veggies = veggies;
        this.cheese = cheese;
        this.guac = guac;
        this.queso = queso;
        this.sourCream = sourCream;
        this.price = price;
        BASE_PRICE = 3;
    }

    //Calculates the price of a burrito
    public void calcPrice() {
        if (!rice.equals("no rice")) {
            price += 0.50;
        }
        if (!meat.equals("no meat")) {
            price += 0.50;
        }
        if (!beans.equals("no beans")) {
            price += 0.50;
        }
        if (!salsa.equals("no salsa")) {
            price += 0.50;
        }
        if (!veggies.equals("no veggies")) {
            price += 0.50;
        }
        if (!cheese.equals("")) {
            price += 0.50;
        }
        if (!guac.equals("")) {
            price += 0.50;
        }
        if (!queso.equals("")) {
            price += 0.50;
        }
        if (!sourCream.equals("")) {
            price += 0.50;
        }
    }

    // Returns the price of a burrito
    public double getPrice() {
        price += BASE_PRICE;
        return price;
    }

    // Method to format double to two decimal places
    public String formatDollars(double d) {
        return currencyFormat.format(d);
    }

    // Creates a new burrito and adds to the ArrayList.
    public void addBurrito(ArrayList<Burrito> burritoList) {
        burritoList.add(new Burrito(rice, meat, beans, salsa, veggies, cheese, guac, queso, sourCream, price));
    }

    // Returns the total cost of all the burritos
    public double getSum(ArrayList<Burrito> burritoList) {
        for (Burrito b : burritoList) {
            sum += b.price + BASE_PRICE;
        }
        return sum;
    }

    // Returns the ArrayList of burrito objects in string format
    public String printBurritos(ArrayList<Burrito> burritoList) {
        return "Burrito " + (burritoList.size()) + ": " + rice + ", " + meat + ", " + beans + ", " + salsa + ", "
                + veggies + cheese + guac + queso + sourCream + " $" + formatDollars(getPrice()) + "\n";
    }

    // Returns a summary of items ordered and their quantities, as well as the total price.
    public String printOrderSummary(ArrayList<Burrito> burritoList) {
        int wr = 0, br = 0, chx = 0, steak = 0, carnitas = 0, chorizo = 0, sofritas = 0, vegAsMeat = 0
                ,bb = 0, pb = 0
                , mild = 0, med = 0, hot = 0
                , fajitas = 0, lettuce = 0
                ,chz = 0, guac = 0, queso = 0, sc = 0;
        String s = "";

        for (int i = 0; i < burritoList.size(); i++) {
            // counts total of each type of rice
            switch (burritoList.get(i).rice) {
                case "all" :
                    wr++;
                    br++;
                    break;
                case "white rice" :
                    wr++;
                    break;
                case "brown rice" :
                    br++;
                    break;
                default :
                    break;
            }
            // counts total of each type of meat
            switch (burritoList.get(i).meat) {
                case "all" :
                    chx++;
                    steak++;
                    carnitas++;
                    chorizo++;
                    sofritas++;
                    vegAsMeat++;
                    break;
                case "chicken" :
                    chx++;
                    break;
                case "steak" :
                    steak++;
                    break;
                case "carnitas" :
                    carnitas++;
                    break;
                case "chorizo" :
                    chorizo++;
                    break;
                case "sofritas" :
                    sofritas++;
                    break;
                case "veggies (as meat option)" :
                    vegAsMeat++;
                    break;
                default:
                    break;
            }
            // counts total of each type of bean
            switch (burritoList.get(i).beans) {
                case "all":
                    bb++;
                    pb++;
                    break;
                case "black beans":
                    bb++;
                    break;
                case "pinto beans":
                    pb++;
                    break;
                default:
                    break;
            }
            // counts total of each type of salsa
            switch (burritoList.get(i).salsa) {
                case "all":
                    mild++;
                    med++;
                    hot++;
                    break;
                case "mild salsa":
                    mild++;
                    break;
                case "medium salsa":
                    med++;
                    break;
                case "hot salsa":
                    hot++;
                    break;
                default:
                    break;
            }
            // counts total of each type of veggies
            switch (burritoList.get(i).veggies) {
                case "all":
                    lettuce++;
                    fajitas++;
                    break;
                case "lettuce":
                    lettuce++;
                    break;
                case "fajita veggies":
                    fajitas++;
                    break;
                default:
                    break;
            }
            // counts the total of cheese
            switch (burritoList.get(i).cheese) {
                case ", cheese":
                    chz++;
                    break;
                default:
                    break;
            }
            // counts the total of guac
            switch (burritoList.get(i).guac) {
                case ", guac":
                    guac++;
                    break;
                default:
                    break;
            }
            // counts the total of queso
            switch (burritoList.get(i).queso) {
                case ", queso":
                    queso++;
                    break;
                default:
                    break;
            }
            // counts the total of sour cream
            switch (burritoList.get(i).sourCream) {
                case ", sour cream":
                    sc++;
                    break;
                default:
                    break;
            }
        }
        s += "This order has " + wr + " white rice, " + br + " brown rice, "
                + chx + " chicken, " + steak + " steak, " + carnitas + " carnitas, " + chorizo + " chorizo, "
                + sofritas + " sofritas, " + vegAsMeat + " veggies(as meat option), " + bb + " black beans, "
                + pb + " pinto beans, " + mild + " mild salsa, " + med + " medium salsa, " + hot + " hot salsa, "
                + fajitas + " fajita veggies, " + lettuce + " lettuce, " + chz + " cheese, " + guac + " guac, "
                + queso + " queso, " + sc + " sour cream, and the sum is $" + formatDollars(getSum(burritoList));

        // prints out receipt; limits line to 50 characters and moves to next line if word exceeds 50 characters
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i + 50 < sb.length() && (i = sb.lastIndexOf(" ", i + 50)) != -1) {
            sb.replace(i, i + 1, "\n");
        }

        return sb.toString();
    }

}
