package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

public class test_22{
    

    public static void main(String[] args){
        
        // Fill in the blank to create a piece of code that will tell whether int0 is divisible by 5

        int int0 = 26;

        // boolean isDivisibleBy5 = Math.isDivisble(int0, 5);
        // boolean isDivisibleBy5 = int0 % 5 != 5;
        // boolean isDivisibleBy5 = (int0 / 5 ? true: false);
        boolean isDivisibleBy5 = int0 % 5 == 0;

        System.out.println("isDivisibleBy5: " + isDivisibleBy5);

    }
}