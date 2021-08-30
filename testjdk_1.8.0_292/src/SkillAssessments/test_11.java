package SkillAssessments;
/*
LinkedIn - skill-assessments

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception

        at SkillAssessments.test_11.main(test_11.java:19)
*/
public class test_11{

    public static void main(String[] args){

        //5.-------------------------
        try{
            System.out.println("Hello World");
        } catch (Exception e){
            System.out.println("e");
        } catch (ArithmeticException e){
            System.out.println("e");
        } finally{
            System.out.println("!");
        }

    }

    public static void badMethod(){
        throw new Error();
    } 
}
