/*
A Linked List is a doubly linked collection of elements.
Each entry in the list also holds a reference to the address of the next and the previous item in the list.
The main advantage of using a linked list is that they are very quick for inserting and removing elements in the middle of a list.
Esto no se podría hacer con ArrayList, 
Aunque LinkedList y ArrayList implement List interface y tengan métodos en común 
To add or remove lost elements en la mitad (middle) de la lista es rápido usar linkedlist.
To get lost elements de la lista es rápido usar Arraylist.
Linkedlist take up more memory than an ArrayList because in a linked list each entry contains a reference to elements in the list and also to the next and previous elements.
*/
package linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> list = new LinkedList();

        // add new elements
        list.add("A");
        list.add("B");
        // add an elements "C" between "A" and "B"        
        list.add(1, "C");     
        System.out.println("");
        System.out.println(list);   //  [A, C, B]
        System.out.println("");
        for (String string : list) {
            System.out.println(string.toString());  // imprime un String en cada línea:   A    C   B   
        }
        System.out.println("");
        list.forEach( (n) -> { System.out.println(n); } ); // imprime un String en cada línea:   A    C   B   
        list.remove("B");
        System.out.println("");
        System.out.println(list);   //  [A, C]
    }
    
}
