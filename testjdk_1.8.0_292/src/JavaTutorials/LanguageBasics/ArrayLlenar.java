/*
 * Llenar un array para colocar un valor específico en cada índice
 */
package JavaTutorials.LanguageBasics;

public class ArrayLlenar {

    public static void main(String[] args) {

        String [] array = new String[10];

        java.util.Arrays.fill(array, "true");

        for (String string : array) {
            System.out.println("string: " + string);
        }

// string: true
// string: true
// string: true
// string: true
// string: true
// string: true
// string: true
// string: true
// string: true
// string: true

    }

}
