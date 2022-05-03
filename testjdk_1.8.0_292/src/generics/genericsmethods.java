/*
generic methods are methods that allow you to create a new type parameter just for that method
it is useful if you are writing a method but want to be flexible about the type of objects you can pass in
*/
package generics;

import java.util.List;
import java.util.ArrayList;

public class genericsmethods {


    // Arrays de diferentes tipos
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    // Devuelve una List de objetos del tipo de Array pasado como parámetro
    // Object is a parent type of ALL other object types
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

        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        intList.forEach( (n) -> { System.out.println(n); } );

        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        boolList.forEach( (n) -> { System.out.println(n); } );

    }
}
