package generics;

// Los genéricos indican al compilador qué tipo de objeto es una colección

import java.util.List;
import java.util.ArrayList;

public class genericsExamples {

    public static void main(String[] args) {

        // Sin Generics, tendrías que convertir cada objeto en un String.
        List names = new ArrayList();
        names.add("Sonia");
        // cast the object
        String name = (String) names.get(0);
        System.out.println("First name: " + name); // First name: Sonia

        // añade un entero, el compilador no se queja
        // names.add(7);
        // names.add(true);

        // imprimir la lista
        // names.forEach( (n) -> { System.out.println(n); } );
        /*
         * Sonia
         * 7
         * true
         */

        // con Generics, el compilador comprueba que sólo se añaden cadenas a la lista
        // lo que hace que el código sea más seguro
        // sólo es necesario especificarlo una vez, cuando se crea
        List<String> names2 = new ArrayList();
        names2.add("Sonia");
        // no need to cast the object
        String name2 = names2.get(0);
        System.out.println("Position 0: " + name2); // Position 0: Sonia
        // si se descomment this line
        // añade un entero, el compilador se queja
        // The compiler say The method add(int, String) in the type List<String> is not
        // applicable for the arguments
        // names2.add(7);

        // names2.add("7");
        // names2.add("true");
        // imprimir la lista
        // names2.forEach( (n) -> { System.out.println(n); } );
        /*
         * Sonia
         * 7
         * true
         */
    }

}
