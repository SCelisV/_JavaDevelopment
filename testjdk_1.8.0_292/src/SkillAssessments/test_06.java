package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.HashMap;

public class test_06{

    public static void main(String[] args){

        //10.------------------------
        // What is displayed when this code is compiled and executed?

        HashMap<String, Integer> pantry =new HashMap<>();
  
        pantry.put("Apples", 3);
        pantry.put("Oranges", 2);

        int currentApples = pantry.get("Apples");
        pantry.put("Apples", currentApples + 4);


        System.out.println(pantry.size());  //  2
        System.out.println(pantry.get("Apples"));   //  7
    }
}