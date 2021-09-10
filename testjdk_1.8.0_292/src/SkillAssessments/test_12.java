package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_12{

    public static void main(String[] args){

        //------------------------
        // What is the output of this code?

        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        // imprimir las listas
        // list1.forEach( (n) -> { System.out.println(n); } );

        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        // imprimir las listas
        // list2.forEach( (n) -> { System.out.println(n); } );

        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        // imprimir las listas
        // list3.forEach( (n) -> { System.out.println(n); } );

        System.out.println(list1.equals(list2));    // true
        System.out.println(list1.equals(list3));    // true

    }
}