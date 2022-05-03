import java.util.Scanner;

/*
    implementa un método y lo ejecutaremos en el main

    most straight forward:
    make our program pause until the user types a random word and presses Enter on their keyboard
    once the user types the random word and presses Enter


*/
import java.util.Scanner;

public class functionsAndMethods {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        // local variable sc created within the function and cannot be accessed outside the functions of limitation
        // its scope (alcance) is limited to this function
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("It's developer tea time!");
        // sc.close(); // al comentar el close no se genera Exception en: at functionsAndMethods.main(functionsAndMethods.java:43)
    }
    public static void main(String[] args){

        System.out.println("Welcome to your new job");

        // call function or method
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");
        /*
        Exception in thread "main" java.util.NoSuchElementException
        at java.base/java.util.Scanner.throwFor(Scanner.java:937)
        at java.base/java.util.Scanner.next(Scanner.java:1478)
        at functionsAndMethods.announceDeveloperTeaTime(functionsAndMethods.java:22)
        at functionsAndMethods.main(functionsAndMethods.java:43)
        */

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");
    }
    
}
