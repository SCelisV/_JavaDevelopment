package SkillAssessments;
/*
LinkedIn - skill-assessments
revisar
https://www.adictosaltrabajo.com/2019/01/21/java-basico-parametros-finales/
*/

public class test_21{
    
    // 1.A Aunque no sean finales no cambian fuera de la función
    private static void changeNonFinalPrimitiveValue(int x){
        x = x + 5;
    }
    

    public static void main(String[] args){
        
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

        int x = 5;
        int y = 10; 



    }
}