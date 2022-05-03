

import java.util.Scanner;

public class PruebaClassScanner{

    private static int i;

    public static void main(String[] args){

        // cada prueba funciona por separado
    	
    	/*
    	 * Una prueba 
    	 */
        /*
         * 
    	 */

    	/*

         */
        final String YES = "YES";
        final String NOT = "NOT";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yes or not");
        /*
         * next() 	
         * Finds and returns the next complete token from this scanner.
         * devuelve un entero String
         */
        String answ = input.next();
        //if (answ.equalsIgnoreCase(YES)){

        //    System.out.println("por true");
            int sum = 0;
            int i = 0;
            while (answ.equalsIgnoreCase(YES)) {
                try {
                    System.out.println("digita un número entero: ");
                    /*
                     * nextInt() 	
                     * Scans the next token of the input as an int.
                     * devuelve un entero int 	
                    */
                    i = input.nextInt();
                    sum = sum + i;
                    System.out.println("Acumulaldo: " + sum);
                } catch (Exception e) {
                    System.out.println("debe ser un número entero: ");
                    break;
                }
            }
        //} else
        //    System.out.println("por else");

        input.close(); 
        /*
         * ejecución
pulsa yes or not
yes
digita un número entero: 
1
Acumulaldo: 1
digita un número entero: 
2
Acumulaldo: 3
digita un número entero: 
3
Acumulaldo: 6
digita un número entero: 
4
Acumulaldo: 10
digita un número entero: 
5
Acumulaldo: 15
digita un número entero: 
6   
Acumulaldo: 21
digita un número entero: 
7
Acumulaldo: 28
digita un número entero: 
8
Acumulaldo: 36
digita un número entero: 
10
Acumulaldo: 46
digita un número entero: 
a
debe ser un número entero: 
         */
    	/*
    	 * Otra prueba 
         */
        /*
         * System.in 	The "standard" input stream. return static InputStream 
         * 
         * Constructor de Scanner:
         * Scanner​(InputStream source) 	
         * Constructs a new Scanner that produces values scanned from the specified input stream.
         * 
         */
    	/*

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        // Avanza este escáner más allá de la línea actual y devuelve la entrada que se ha saltado.
        String userName = myObj.nextLine(); 
        System.out.println("Username is: " + userName);     //  Username is: lo que escriban por el teclado

        try {
            System.out.println("Enter un número entero");
            int i = myObj.nextInt();
            System.out.println("i is: " + i);     //  i is: lo que escriban por el teclado
        } catch (Exception e) {
            System.out.println("Debe ser un número entero");
        }

        myObj.close();

         */
    }
}