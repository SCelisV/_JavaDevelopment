/*
 * Esta clase es una modificacion de ArrayCopyDemo
 * Utilizando el método copyOfRange (T[] original, int from, int to)
 * no necesitamos inicializar el array de destino
 * el segundo parámetro es el indice inicial del rango inclusive, 
 * mientras que el tercer parámetro es el índice final del rango a copiar, exclusive
 */
package JavaTutorials.LanguageBasics;

public class ArrayCopyOfDemo {

    public static void main(String[] args) {


        String [] copyDesde = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"};

        String [] copyA = java.util.Arrays.copyOfRange(copyDesde, 2, 5);

        for (String string : copyA) {
            System.out.println(string);
        }

        // Cappuccino
        // Corretto
        // Cortado
    }
}
