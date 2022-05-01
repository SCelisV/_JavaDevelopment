/*
   Queues are useful way of applying constraints in situatios like this where you want the first item in the queue to be the one that gets removed first.
*/

package linkedlist;

import java.util.LinkedList;
public class Store {


    // To serve a customer at my store
    // containing customers called queue as an argument
    static void serveCustomer(LinkedList<Customer> queue ){

        // when a customer has been served they should be removed from the queue
        // and it should always be the first person who joins that gets served first
        // poll (method queue interface), returns the first customer in the queue
        // also removes them from the queue.
        Customer c = queue.poll();
        c.serve();

    }

    public static void main(String[] args){

        // There are several classes in the JAVA API that implements the queue interface.
        // One of these classes is linked list. 
        LinkedList<Customer> queue = new LinkedList();

        // add new Customers to the queue
        // always add an elements to the end of the list
        // also known as the tail.
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));

        // print the list
        System.out.println(queue);  // [Sally, Ben, Emma, Fred]

        // serve customer method
        serveCustomer(queue);       // Sally has been serve

        // print the queue again

        System.out.println(queue);  // [Ben, Emma, Fred]
    }
    
}
