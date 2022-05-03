/*
Java program to demonstrate working some methods of java.lang.Math
There are a lot of different mathematical functions that we can call 
Math standard library which contains all of the different built-in functions
Math is one component containing a serios of built-in functions
that you don't have to define the function yourself, you can just call it
All you have to know is the function's inputs and output as well as the gist of what the function does
and what the expected output is

*/
  
import java.lang.Math;

public class PruebaClassMath {
  
  
    public static void main(String args[]) {

        double a = 30;
        double b = 2;
        System.out.println(Math.pow(a, b));
  
        a = 3;
        b = 4;
        System.out.println(Math.pow(a, b));
  
        a = 2;
        b = 6;
        System.out.println(Math.pow(a, b));

        // We did not need to create an instance of Math to use the pow methods
        // pow() is a static method (class methods), we call them using the class name
        // no necesita una instancia de la clase para ser usado
        double result = Math.pow(2,5);
        System.out.println(result);

        System.out.println(Math.addExact(10, 15));
    }
}