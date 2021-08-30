package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.util.*;

public class test_14{

    public static void main(String[] args){

        //------------------------
        /* What is the output of this code?
            A runtime exception is thrown because the index 12 is out of range
        */

        String message = "Hello World!";
        String newMessage = message.substring(6, 12)
                          + message.substring(12, 6);   //  Exception in thread "main" java.lang.
                                                        //  StringIndexOutOfBoundsException: begin 12, end 6, length 12
        System.out.println("message: " + message);
        System.out.println("newMessage: " + newMessage);




    }
}