/*
los métodos genéricos son métodos que permiten crear un nuevo tipo de parámetro sólo para ese método
es útil si estás escribiendo un método pero quieres ser flexible sobre el tipo de objetos que puedes pasar
*/
package generics;

import java.util.List;
import java.util.ArrayList;

public class genericsmethods {


    // Arrays de diferentes tipos
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Boolean[] boolArray = {true, false, true};
    static Integer[] intArray = {1, 2, 3, 4, 5};

    // Devuelve una List "de tipo Object" que es el mismo tipo de array, "en este caso Object" pasado como parámetro
    // Object es el tipo padre de TODOS los demás tipos de objetos
    public static List arrayToList(Object[] array, List<Object> list){

        for(Object object : array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args){

        // Creación de la nueva lista
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        charList.forEach( (n) -> { System.out.println(n); } );

        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        boolList.forEach( (n) -> { System.out.println(n); } );

        // Si descomentamos estas líneas
        // este enfoque, significa que pierdes la seguridad de tipos, el compilador no genera error
        // Genera un "warning" Note: genericsmethods.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.
        // Si intercambio el tipo de esta lista a String en lugar de Integer
        // List<String> intList = arrayToList(intArray, new ArrayList<>());
        // pero si intento imprimir, se genera un java.lang.ClassCastException - Cast exception    
        // Obtenemos una exception en ejecución
        // System.out.println(intList.get(0));
        /*
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        at generics.genericsmethods.main(genericsmethods.java:45)
         */
        List<Integer> intList2 = arrayToList(intArray, new ArrayList<>());
        intList2.forEach( (n) -> { System.out.println(n); } );
/*
h
e
l
l
o
1
2
3
4
5
true
false
true
         */
    }
}

