

import java.util.Scanner;

public class PruebaClassScanner{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("pulsa yes or not: ");
            String userInput = input.next();
            if (userInput.equals("yes")){
                isOnRepeat = false;
                //input.close();
            }
        System.out.println("digita un número entero: ");
        int i = input.nextInt();
        System.out.println(i);
        input.close();
        }


    }
}