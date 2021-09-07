package SkillAssessments;

public class test_26 {


    public static void main(String[] args){

        /* 
        How do you force an object to be garbage collected?

            // Set the object to null and call Runtime.getRuntime().runFinalization()
            // There is no way to force an object to be garbage collected.
            // Set the object to null and call System.gc()
            Set the object to null and call Runtime.gc()

        */

        String t1 = new String();
        String t2 = new String();
          
        // Nullifying the reference variable
        t1 = null;
        t2 = null;
          
        // requesting JVM for running Garbage Collector
        System.gc();
          
        // requesting JVM for running Garbage Collector
        Runtime.getRuntime().gc();
        
    }
}
