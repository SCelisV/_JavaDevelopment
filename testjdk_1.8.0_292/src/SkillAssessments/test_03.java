package SkillAssessments;
/*
LinkedIn - skill-assessments
A
D
Exception in thread "main" java.lang.Error
        at SkillAssessments.test_03.badMethod(test_03.java:23)
        at SkillAssessments.test_03.main(test_03.java:12)
*/
public class test_03{

    public static void main(String[] args){

        //5.-------------------------
        try{
            System.out.println("A");
            badMethod();
            System.out.println("B");
        } catch (Exception ex){
            System.out.println("C");
        } finally{
            System.out.println("D");
        }

    }

    public static void badMethod(){
        throw new Error();
    } 
}
