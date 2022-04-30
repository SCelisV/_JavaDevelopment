/*
Calculates the area of a triangle 
input base and height values
the program will calculate the area using the formula: area = (base * height) /2
Neither the base nor the height should be less than or equal to 0

*/
import java.util.Scanner;

public class calculateAreaTriangle{

    public static void main(String[] args){

        System.out.println("Let's calculate the area of a triangle");

        // Have the userAnswers
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in cm).");
        double dBase = sc.nextDouble();

        // Controla que no sea zero
        while (dBase <= 0){
            System.out.println("That's invalid. Please input the base of the triangle (in cm).");
            dBase = sc.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in cm).");
        double dHeight = sc.nextDouble();

        // Controla que no sea zero
        while (dHeight <= 0){
            System.out.println("That's invalid. Please input the height of the triangle (in cm).");
            dHeight = sc.nextDouble();
        }

        sc.close();
        double dArea = (dBase * dHeight) / 2;

        System.out.println("The area is: " + dArea);


    }
}
