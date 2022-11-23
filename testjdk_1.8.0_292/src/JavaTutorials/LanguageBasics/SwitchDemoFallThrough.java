/*
 * muestra el mes correspondiente al mes entero y los meses que le siguen en el año
 * Técnicamente, el break final no es necesario porque el flujo se sale de la sentencia switch. 
 * Se recomienda utilizar un break para que la modificación del código sea más fácil y menos propensa a errores. 
 * La sección default maneja todos los valores que no son manejados explícitamente por una de las secciones case.
 */
package JavaTutorials.LanguageBasics;

public class SwitchDemoFallThrough {
    
    public static void main(String[] args) {

        java.util.ArrayList<String> mesesFuturos = new java.util.ArrayList<String>();

        int mes = 8;

        switch (mes) {
            case 1:  mesesFuturos.add("January");
            case 2:  mesesFuturos.add("February");
            case 3:  mesesFuturos.add("March");
            case 4:  mesesFuturos.add("April");
            case 5:  mesesFuturos.add("May");
            case 6:  mesesFuturos.add("June");
            case 7:  mesesFuturos.add("July");
            case 8:  mesesFuturos.add("August");
            case 9:  mesesFuturos.add("September");
            case 10: mesesFuturos.add("October");
            case 11: mesesFuturos.add("November");
            case 12: mesesFuturos.add("December");
                     break;
            default: break;

        }

        if (mesesFuturos.isEmpty()){
            System.out.println("número de mes Invalido");
        } else {
            System.out.println("El mes es: " + mes + "\n y los meses futuros son: "); // El mes es: 8 
                                                                                //  y los meses futuros son: 
            for (String nameMes: mesesFuturos) {
                 System.out.println(nameMes);
// August
// September
// October
// November
// December
                }
        }
    }
}
