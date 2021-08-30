package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import static java.lang.Math.*;
import static java.lang.System.out;

public class test_20{

    public static void main(String[] args){

            //------------------------
            /* Normally, to access a static member of a class such as Math.PI, you would need to specify the class "Math". What would be the best way to allow you to use simply "PI" in your code?
                // Declare local copies of the constants in your code.
                Add a static import
                // Put the static members in an interface and inherit from that interface.
                // This cannot be done. You must always qualify references to static members with the class from which they came.
        */
        out.println("Hello World!");
        out.println("Considering a circle with a diameter of 5 cm, it has");
        out.println("a circumference of " + (PI * 5) + " cm");
        out.println("and an area of " + (PI * pow(2.5, 2)) + " sq. cm");

    }
}