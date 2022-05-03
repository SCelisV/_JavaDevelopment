/*
generic methods are methods that allow you to create a new type parameter just for that method
it is useful if you are writing a method but want to be flexible about the type of objects you can pass in

this approach (enfoque), significa que pierdes la seguridad de tipos, el compilador no genera error
Si intercambio el tipo de la lista Integer a String, el compilador no da error
pero si intento imprimir, se genera un java.lang.ClassCastException - Cast exception
para solucionarlo, el method debe ser un generic method
1. create a new type local scope variable: <T> 
   (only use it in this method = in the method signature and inside the body)
   specify that the return type of the method es a list del nuevo type T
*/
package generics;

import java.util.List;
import java.util.ArrayList;

public class generics2methods {


    // Arrays de diferentes tipos
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    static String[] stringArray = {"Hola", "Sonia", "Celis"};

    // Devuelve una List de objetos del tipo de Array pasado como parámetro
    // Object is a parent type of ALL other object types
    // 1. create a new type local scope variable: <T> 
    //    (only use it in this method = in the method signature and inside the body)
    //    specify that the return type of the method es a list del nuevo type T (generic type)
    //    no importa que tipo se use.
    //    el tipo del arraylist puede tambien ser un super tipo del tipo del elemento del array

    public static <T> List<T> arrayToList(T[] array, List<T> list){

        for(T object : array){
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

        // this approach (enfoque), significa que pierdes la seguridad de tipos
        // Si intercambio el tipo de esta lista a String en lugar de Integer
        // el compilador aquí no da error 
        // List<String> intList = arrayToList(intArray, new ArrayList<>());
        // se genera un java.lang.ClassCastException
        // intList.forEach( (n) -> { System.out.println(n); } );

        // ahora el compilador da un error y debo cambiar el tipo
        // List<String> intList = arrayToList(intArray, new ArrayList<>());

        // De esta manera nos aseguramos que se mantiene la seguridad de tipos
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        intList.forEach( (n) -> { System.out.println(n); } );
    }
}
