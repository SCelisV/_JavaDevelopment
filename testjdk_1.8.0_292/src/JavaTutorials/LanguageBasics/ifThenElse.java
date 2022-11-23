/*
 * También puede mostrar el nombre del mes con sentencias if-then-else:
 */
package JavaTutorials.LanguageBasics;

public class ifThenElse {
    
    public static void main(String[] args) {
        
        int mes = 0;
        String nameMes = " ";

        if (mes == 1){
            nameMes = "Enero";
        } else if (mes == 2){
                    nameMes = "Febrero";
        } else if (mes == 3){
                    nameMes = "Marzo";
        }
        // etc.

        System.out.println("El mes es: " + mes + " " + nameMes); // El mes es: 0 
    }
}
