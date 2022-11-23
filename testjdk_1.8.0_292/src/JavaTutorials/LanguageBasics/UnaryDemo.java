/*
 * Los operadores unarios requieren un solo operando; realizan varias operaciones como incrementar/decrementar un valor en uno, negar una expresión o invertir el valor de un booleano.
 * + Operador unario más; indica un valor positivo (los números son positivos sin esto, sin embargo)
 * - Operador unario menos; niega una expresión
 * ++ Operador de incremento; incrementa un valor en 1
 * -- Operador de disminución; disminuye un valor en 1
 * !	Operador de complemento lógico; invierte el valor de un booleano

 */
package JavaTutorials.LanguageBasics;

public class UnaryDemo {

    public static void main(String[] args) {
        
        int result = +1;
        // result is now 1
        System.out.println(result); // 1

        result--;
        // result is now 0
        System.out.println(result); // 0

        result++;
        // result is now 1
        System.out.println(result); // 1

        result = -result;
        // result is now -1
        System.out.println(result); // -1

        boolean success = false;
        // false
        System.out.println(success); // false
        // true
        System.out.println(!success); // true
    }
    
}
