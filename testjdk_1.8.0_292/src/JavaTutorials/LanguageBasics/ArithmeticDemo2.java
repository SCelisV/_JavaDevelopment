/*
 * + Operador de adición (también se utiliza para la concatenación de cadenas)
 * - Operador de sustracción
 * * Operador de multiplicación
 * / Operador de división
 * % Operador de resto
 */
package JavaTutorials.LanguageBasics;

public class ArithmeticDemo2 {
    
    public static void main(String[] args) {

        int result = 3;
        System.out.println(result); // 3

        // result = result - 1; // result is now 2
        result -= 1; // result is now 2
        System.out.println(result); // 2

        // result = result * 2; // result is now 4
        result *= 2; // result is now 4
        System.out.println(result); // 4

        // result = result / 2; // result is now 2
        result /= 2; // result is now 2
        System.out.println(result); // 2

        // result = result + 8; // result is now 10
        result += 8; // result is now 10
        System.out.println(result); // 10

        // result = result % 7; // result is now 3
        result %= 7; // result is now 3
        System.out.println(result); // 3

    }
}

