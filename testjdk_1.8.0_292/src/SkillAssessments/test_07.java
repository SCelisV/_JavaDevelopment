package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_07{

    public static void main(String[] args){

        //11.------------------------
        // What is displayed when this code is compiled and executed?

        String[] array = {"abc", "2", "10", "0"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list);

        System.out.println(list.size());    //  4
        System.out.println(Arrays.toString(array)); // [0, 10, 2, abc]
    }
}