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

los métodos genéricos son métodos que permiten crear un nuevo tipo de parámetro sólo para ese método
es útil si estás escribiendo un método pero quieres ser flexible en cuanto al tipo de objetos que puedes pasar


para solucionarlo, el método debe ser un método genérico
1. crear una nueva variable de ámbito local de tipo <T> 
   (sólo utilízala en este método = en la firma del método y dentro del cuerpo)
   2. especificar que el tipo de retorno del método es una lista del nuevo tipo T
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

    // Devuelve una Lista de objetos del tipo de Array pasado como parámetro
    // El objeto es un tipo padre de TODOS los demás tipos de objetos

    // 1. crear una nueva variable de ámbito local del tipo <T>
    // (sólo úsarla en este método = en la firma del método y dentro del cuerpo)
    // 2. especificar que el tipo de retorno del método es una lista del nuevo tipo T
    // (tipo genérico)
    // no importa que tipo se use.
    // el tipo del arraylist puede también ser un super tipo del tipo del elemento
    // del array

    // public static List arrayToList(Object[] array, List<Object> list){
    public static <T> List<T> arrayToList(T[] array, List<T> list){

        // for(Object object : array){
        for(T object : array){
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

        // ahora el compilador da un error y debo cambiar el tipo 
        // Type mismatch: cannot convert from List<Integer> to List<String>Java(16777233)
        // List<String> intList2 = arrayToList(intArray, new ArrayList<>());

        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        boolList.forEach( (n) -> { System.out.println(n); } );

        List<String> stringList = arrayToList(stringArray, new ArrayList<>());
        stringList.forEach( (n) -> { System.out.println(n); } );

        /*
h
e
l
l
o
true
false
true
1
2
3
4
5
Hola
Sonia
Celis
         */
    }
}
