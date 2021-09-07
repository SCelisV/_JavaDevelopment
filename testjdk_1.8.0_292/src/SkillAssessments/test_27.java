/*

Functional Interfaces In Java

A functional interface is an interface that contains only one abstract method. 

They can have only one functionality to exhibit. 
From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. 
Runnable, ActionListener, Comparable are some of the examples of functional interfaces. 

Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

https://www.geeksforgeeks.org/functional-interfaces-java/

    A functional interface has only one abstract method but it can have multiple default methods.
    @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. 
    The use of this annotation is optional.
    The java.util.function package contains many builtin functional interfaces in Java 8.

*/

package SkillAssessments;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class test_27 {


    public static void main(String[] args){

        //27.------------------------
        /* Which functional interfaces does Java provide to serve as data types for lambda expressions?

        // Observer, Observable
        Consumer, Predicate, Supplier
        // Filter, Map, Reduce
        // Collector, Builder


        */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        // Consumer
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        // create a list of strings
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
 
        // Predicate
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s)-> s.startsWith("G");
 
        // Iterate through the list
        for (String st:names)
        {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }

        // Supplier
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}