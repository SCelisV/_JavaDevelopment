/*
 * determinan si un operando es mayor que, menor que, igual o no igual a otro operando. 
 * debe utilizar "==", no "=", cuando compruebe si dos valores primitivos son iguales.
 * == igual a
 * != no igual a
 * > mayor que
 * >= mayor o igual que
 * < menor que
 * <= menor o igual que
 */
package JavaTutorials.LanguageBasics;

public class ComparisonDemo {

    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2" + " " + value1 + " != " + value2 ); // value1 != value2 1 != 2
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2" + " " + value1 + " < " + value2 ); // value1 < value2 1 < 2
        if(value1 <= value2)
            System.out.println("value1 <= value2" + " " + value1 + " <= " + value2 ); // value1 <= value2 1 <= 2
    }
    
}
