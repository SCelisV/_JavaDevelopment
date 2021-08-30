package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_08{


    public static void main(String[] args){

        Duck duck = new Duck("Waddles");

        // Duck duck = new Duck();     //  The constructor Duck()

        //14.------------------------
        // Add un Duck called Waddles to the ArrayList ducks

        ArrayList<Duck> ducks = new ArrayList<Duck>();

        ducks.add(new Duck("Waddles"));

        System.out.println(ducks.size());    //  1

        ducks.add(duck);

        System.out.println(ducks.size());    //  2

        for (int i=0; i<ducks.size(); i++){
            System.out.println(ducks.get(i));
        }
    }
}