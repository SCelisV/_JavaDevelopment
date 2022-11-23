package JavaTutorials.LanguageBasics;

public class ArrayComparar {

    public static void main(String[] args) {

        String [] array = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };
        String [] array2 = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };
        
        // Devuelve verdadero si las dos matrices de booleanos especificadas son iguales entre sí.
        boolean iguales = java.util.Arrays.equals(array, array2);

        System.out.println("iguales: " + iguales); // iguales: true
    }
}