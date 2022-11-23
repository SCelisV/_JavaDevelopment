/*
 * Busca el valor especificado en la matriz de bytes mediante el algoritmo de búsqueda binaria.
 */
package JavaTutorials.LanguageBasics;

public class ArrayBuscar {

    public static void main(String[] args) {
        
        String [] array = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"};

        for (String string : array) {
            System.out.println(string);
        }

        // Busca el valor especificado en la matriz de bytes mediante el algoritmo de búsqueda binaria.
        int indice = java.util.Arrays.binarySearch(array, "Frappucino");

        System.out.println("Americano esta en el indice: " + indice + ": " + array[indice]);
    }
    
}
