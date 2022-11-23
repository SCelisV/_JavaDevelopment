/*
 * calcula el número de días de un mes determinado:
 */
package JavaTutorials.LanguageBasics;

public class SwitchDemo2 {
    
    public static void main(String[] args) {

        int mes = 2;
        int anyo = 2024;
        int numDias = 0;

        switch (mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDias = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDias = 30;
                break;
            case 2:
                // bisiesto - leap year
                if (((anyo% 4 == 0) && !(anyo % 100 == 0)) || (anyo % 400 == 0))
                    numDias = 29;
                else
                    numDias = 28;
                break;
            default:
                System.out.println("mes Invalido.");
                break;
        }

        System.out.println("El año es: " + anyo); // El año es: 2024
        System.out.println("El mes es: " + mes); // El mes es: 2
        System.out.println("El mes tiene : " + numDias + " días"); // El mes tiene : 29 días


    }
}
