/*
A queue is a status structure, queues are userful if you are controlling access to shared resources.
For example CPU scheduling or doing something like simulating planes waiting for landing instructions.
*/

package linkedlist;

public class Customer {

    // 
    private boolean hasBeenServed; 
    private String name;

    // Constructor - El cliente "name", no ha sido servido
    public Customer (String name){
        hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        hasBeenServed = true;
        // when I add customers to a queue
        // then print the queue it wil show me the customers name rather than the objects reference.
        System.out.println(name + " has been served");
    }

    // Overridden the String method and set it to return the name field
    // when I add customers to a queue and then print the queue it will show me the customers name rather than the objects reference
    @Override
    public String toString(){
        return name;
    }
}
