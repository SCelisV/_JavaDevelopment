package SkillAssessments;
/*
LinkedIn - skill-assessments
*/
import java.util.*;

public class test_04{

    public static void main(String[] args){

        //7.-------------------------
        // How do you write a foreach loop that will iterate over ArrayList<Pencil> pencilCase?


        ArrayList<Integer> Numbers = new ArrayList<Integer>();
  
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
  
        System.out.println(Numbers.size());
        // forEach method of ArrayList and
        Numbers.forEach((n) -> System.out.println(n));
        
        for(Integer number : Numbers){
            System.out.println(number);
        }

    }
}