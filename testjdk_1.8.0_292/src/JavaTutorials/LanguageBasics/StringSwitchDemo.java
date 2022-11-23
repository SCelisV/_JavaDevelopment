/*
 * muestra el número del mes basado en el valor del String llamado nameMes
 */
package JavaTutorials.LanguageBasics;

public class StringSwitchDemo {

    public static int getMesNumber(String nameMes){

        int mesnumber = 0;

        if (nameMes == null) {
            return mesnumber;
        }

        switch (nameMes.toLowerCase()) {
            case "enero":
                mesnumber = 1;
                break;
            case "febrero":
                mesnumber = 2;
                break;
            case "marzo":
                mesnumber = 3;
                break;
            case "abril":
                mesnumber = 4;
                break;
            case "mayo":
                mesnumber = 5;
                break;
            case "junio":
                mesnumber = 6;
                break;
            case "julio":
                mesnumber = 7;
                break;
            case "agosto":
                mesnumber = 8;
                break;
            case "septiembre":
                mesnumber = 9;
                break;
            case "octubre":
                mesnumber = 10;
                break;
            case "noviembre":
                mesnumber = 11;
                break;
            case "diciembre":
                mesnumber = 12;
                break;
            default:
                mesnumber = 0;
                break;
        }

        return mesnumber;
    }



    public static void main(String[] args) {

        String mesString = "Noviembre";

        int numeroMes = getMesNumber(mesString);

        if ( numeroMes == 0 ){
            System.out.println("Mes INVALIDO");
        } else {
            System.out.println("El mes: " + mesString + " corresponde al mes numero: " + numeroMes);
            // El mes: Noviembre corresponde al mes numero: 11
        }
    }
    
}
