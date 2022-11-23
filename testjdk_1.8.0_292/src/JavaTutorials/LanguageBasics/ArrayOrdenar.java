/*
 * Ordena el array especificado en orden numérico ascendente. 
 */
package JavaTutorials.LanguageBasics;

public class ArrayOrdenar {
    public static void main(String[] args) {

        int [] array = {10, 9, 8, 7, 6, 5};

        java.util.Arrays.sort(array);
        
        for (int i : array) {
            System.out.println(i);
        }
// 5
// 6
// 7
// 8
// 9
// 10

    }

    
}
