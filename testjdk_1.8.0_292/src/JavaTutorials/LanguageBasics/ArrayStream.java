/*
 * Crear un flujo que utilice un array como fuente 
 */
package JavaTutorials.LanguageBasics;

public class ArrayStream {

    public static void main(String[] args) {

        String [] array = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };

        java.util.Arrays.stream(array).map(elemento -> elemento + " ").forEach(System.out::println);

// Affogato 
// Americano 
// Cappuccino 
// Corretto 
// Cortado 
// Doppio 
// Espresso 
// Frappucino 
// Freddo 
// Lungo 
// Macchiato 
// Marocchino 
// Ristretto 

    }
}