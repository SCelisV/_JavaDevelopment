/*
 * La sentencia while evalúa la expresión, que debe devolver un valor booleano. 
 * Si la expresión es verdadera, la sentencia while ejecuta la(s) sentencia(s) del bloque while.  
 * La sentencia while continúa probando la expresión y ejecutando su bloque hasta que la expresión sea falsa. 
 */
package JavaTutorials.LanguageBasics;

public class WhileDemo {

    public static void main(String[] args) {

        int contador = 1;
        
        while (contador <= 10) {
            System.out.println("\ncontador: " + contador);
            contador +=1;
        }
    }

}
