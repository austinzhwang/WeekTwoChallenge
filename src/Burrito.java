import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burrito {

    private String rice, meat, beans, salsa, veggies, cheese, guac, queso, sourCream;
    private final double BASE_PRICE;
    private double price;
    private DecimalFormat currencyFormat = new DecimalFormat("0.00");

    public Burrito(String rice, String meat, String beans, String salsa, String veggies, String cheese, String guac
    , String queso, String sourCream) {
        this.rice = rice;
        this.meat = meat;
        this.beans = beans;
        this.salsa = salsa;
        this.veggies = veggies;
        this.cheese = cheese;
        this.guac = guac;
        this.queso = queso;
        this.sourCream = sourCream;
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
    public String getPrice() {
        price += BASE_PRICE;
        return currencyFormat.format(price);
    }

    //Creates a new burrito and adds to the ArrayList.
    public void addBurrito(ArrayList<String> burritoList) {
        burritoList.add("Burrito " + (burritoList.size()+1) + ": " + rice + ", " + meat + ", " + beans + ", " + salsa + ", "
                + veggies + cheese + guac + queso + sourCream + " $" + getPrice() + "\n");

    }

}
