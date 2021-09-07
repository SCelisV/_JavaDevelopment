/*

Split the bill 
listedMealPrice = 100, tipRate = 0.20, taxRate = .08
calculateTotalMealPrice(100, 0.2, 0.08) -> 128
But how much does each person owe
returns some value or nothing

*/

public class splittingtheBill {

    public static double calculateTotalMealPrice(double listedMealPrice, 
                                               double tipRate, 
                                               double taxRate){
        double tip = tipRate * listedMealPrice; // sometime you might want to tip a different rate depending on what service you get
        double tax = taxRate * listedMealPrice; // also differ depending on what state or country you are in.
        double result = listedMealPrice + tip + tax;
        // System.out.println("Your total meal price is: " + result);
        return result;

    }

    public static void main(String[] args){

        double groupTotalMealPrice =  calculateTotalMealPrice(100, 0.2, 0.08);

        System.out.println("Your group total meal price is: " + groupTotalMealPrice);

        double individualTotalMealPrice = groupTotalMealPrice / 5;

        System.out.println("Your individual  meal price is: " + individualTotalMealPrice);
    }
    
}
