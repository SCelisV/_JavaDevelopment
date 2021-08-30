package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_15{

    public static void main(String[] args){

        //------------------------
        /* You have an ArrayList of names that you want to sort alphabetically.
        Which approach would not work
            // Collections.sort(names);
            names.sort(List.DESCENDING);
            // names.sort(Comparator.comparing(String::toString));
            // names = names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        */

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Sonia", "Paz", "Sol", "Olivia", "Marta", "Raquel", "Ana", "Mayte"));

        Collections.sort(names);
        // names.sort(List.DESCENDING);
        // names.sort(Comparator.comparing(String::toString));
        // names = names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

        System.out.println(names.size());    //  8
        for(String name: names){
            System.out.println(name);
        }

    }
}