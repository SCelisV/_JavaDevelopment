/*
 * Es un grupo de cero(0) o más sentencias entre llaves {} equilibradas 
 * y puede usarse en cualquier lugar donde se permita una sola sentencia. 
 */
package JavaTutorials.LanguageBasics;

public class BlockDemo {
    
    public static void main(String[] args) {
        
          boolean condition = true;

          if (condition) { // comienza el bloque 1
               System.out.println("La condición es verdadera");
          } // finaliza el bloque 1

          else { // comienza el bloque 2
               System.out.println("La condición es falsa");
          } // finaliza el bloque 2

    }
}
