/*
 * + Operador de adición (también se utiliza para la concatenación de cadenas)
 * - Operador de sustracción
 * * Operador de multiplicación
 * / Operador de división
 * % Operador de resto
 */
package JavaTutorials.LanguageBasics;

public class ArithmeticDemo {
    
    public static void main(String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result); // 3 - 1 = 2
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result); // 2 * 2 = 4
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result); // 4 / 2 = 2
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result); // 2 + 8 = 10
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result); // 10 % 7 = 3
    }
}

