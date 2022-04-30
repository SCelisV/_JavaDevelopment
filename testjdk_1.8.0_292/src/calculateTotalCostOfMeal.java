/*
Calcula el costo total de la comida: // casi siempre la comida que ordenas tiene precios diferentes

calculate Total Cost Of Meal including tip and tax
calculate Tip = tipRate * listedMealPrice; // sometime you might want to tip a different rate depending on what service you get
calculate Tax = taxRate * listedMealPrice; // also differ depending on what state or country you are in.
Result = tip + tax + listedMealPrice
listedMealPrice are different listed price

listedMealPrice, tipRate and taxRate input will be defined in the function's definition
the values of these inputs will be assigned when we call the function
this will allow us to have a custom listed meal price, tip rate, and tax rate every time we call the function

*/
public class calculateTotalCostOfMeal {

    public static void calculateTotalMealPrice(double listedMealPrice, 
                                               double tipRate, 
                                               double taxRate){
        double tip = tipRate * listedMealPrice; // sometime you might want to tip a different rate depending on what service you get
        double tax = taxRate * listedMealPrice; // also differ depending on what state or country you are in.
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is: " + result);

    }
    public static void main(String[] args){

        calculateTotalMealPrice(15, 0.2, 0.08);

        calculateTotalMealPrice(25, 0.18, 0.08);

        calculateTotalMealPrice(100, 0.2, 0.08);

    }
    
}
