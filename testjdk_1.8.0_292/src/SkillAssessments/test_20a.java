package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

public class test_20a{

    public static void main(String[] args){

            //------------------------
            /* Normally, to access a static member of a class such as Math.PI, you would need to specify the class "Math". What would be the best way to allow you to use simply "PI" in your code?
                // Declare local copies of the constants in your code.
                Add a static import
                // Put the static members in an interface and inherit from that interface.
                // This cannot be done. You must always qualify references to static members with the class from which they came.
        */
        System.out.println("Hello World!");
        System.out.println("Considering a circle with a diameter of 5 cm, it has");
        System.out.println("a circumference of " + (Math.PI * 5) + " cm");
        System.out.println("and an area of " + (Math.PI * Math.pow(2.5, 2)) + " sq. cm");

    }
}