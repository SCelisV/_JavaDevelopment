package SkillAssessments;
/*
LinkedIn - skill-assessments
*/
public class test_21a{


    public static int sumNonFinalPrimitiveTypes(int x, int y){
        return x + y;
    }
 
    public static int sumFinalPrimitiveTypes(final int x, final int y){
        return x + y;
    }
 
    public int sumNonFinalObjects(Integer x, Integer y){
        return x + y;
    }
 
    public int sumFinalObjects(final Integer x, final Integer y){
        return x + y;
    }

    public static void main(String[] args){

        int x = 5;
        int y = 10; 

        //16.------------------------
        /* What is the scope (alcance) of a method's argument or parameter?

        The scope for a parameter is simply the method body in which the parameter is located. 
        Parameter names only have to be unique in a parameter list. 
        For example, we can have two methods testRightTriangle and testScaleneTriangle, 
        both of which have parameter int hypoteneuse. 
        Since the scope is just the method body, 
        we know which hypoteneuse is being referred to.  


        // both inside and outside the method
        // outside the method
        // neither inside nor outside the method
        inside the method
        */

        System.out.println(sumNonFinalPrimitiveTypes(x, y));
        
        System.out.println(sumFinalPrimitiveTypes(x, y));


    }
}