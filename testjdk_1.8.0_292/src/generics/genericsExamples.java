package generics;

import java.util.List;
import java.util.ArrayList;

public class genericsExamples {

    public static void main(String[] args){

        // without Generics, you would to cast every single object to a String.
        List names = new ArrayList();
        names.add("Sonia");
        // cast the object
        String name = (String) names.get(0);        
        System.out.println("First name: " + name);
        // if uncomment this line that code that does not generics
        // add an integer, the comopiler does not complain
        // names.add(7);
        // names.add(true);

        // imprimir la lista
        // names.forEach( (n) -> { System.out.println(n); } );



        // with Generics, the compiler checks that only strings are added to the list which makes the code safer
        // you only need specified once.
        List <String> names2 = new ArrayList();
        names2.add("Sonia");
        // no need to cast the object
        String name2 = names2.get(0);        
        System.out.println("First name: " + name2);
        // if uncomment this line 
        // add an integer, the comopiler complain
        // The compiler say The method add(int, String) in the type List<String> is not applicable for the arguments 
        // names2.add(7);

        // names2.add("7");
        // names2.add("true");
        // imprimir la lista
        // names2.forEach( (n) -> { System.out.println(n); } );

    }
    
}
