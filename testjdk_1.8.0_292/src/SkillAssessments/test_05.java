package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_05{

    public static void main(String[] args){

        //8.-------------------------
        // Which approach cannot be used to iterate over a List named the list?

        List<Integer> theList=new ArrayList<Integer>();
  
        // Add Number to list
        theList.add(03);
        theList.add(13);
        theList.add(23);
        theList.add(33);
        theList.add(43);
  
        System.out.println(theList.size());

        theList.forEach(System.out::println);

        for (int i=0; i<theList.size(); i++){
            System.out.println(theList.get(i));
        }

        for (Object object : theList){
            System.out.println(object);
        }
    }
}