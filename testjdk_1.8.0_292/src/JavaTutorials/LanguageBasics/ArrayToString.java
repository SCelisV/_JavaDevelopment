/*
 * Convertir un array en una cadena. El método toString convierte cada elemento de la matriz en una cadena, los separa con comas y los rodea con paréntesis. 
 */
package JavaTutorials.LanguageBasics;

public class ArrayToString {

    public static void main(String[] args) {
        
        String [] array = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };

        System.out.println("usando toString: " + java.util.Arrays.toString(array));
    }

    // usando toString: [Affogato, Americano, Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo, Lungo, Macchiato, Marocchino, Ristretto]
}
