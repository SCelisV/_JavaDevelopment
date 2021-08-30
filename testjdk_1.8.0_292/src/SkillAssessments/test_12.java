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
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
    }
}