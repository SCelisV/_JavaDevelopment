package SkillAssessments;
/*
LinkedIn - skill-assessments

You should use static methods whenever,

    The code in the method is not dependent on instance creation and is not using any instance variable.
    A particular piece of code is to be shared by all the instance methods.
    The definition of the method should not be changed or overridden.
    you are writing utility classes which should not be changed.

*/

public class test_17 {

    // propiedades
   private static int numInstances = 0;

   // constructor
   test_17() {
      // creando instancias
      test_17.addInstance();
   }

   protected static int getCount() {
      return numInstances;
   }

   private static void addInstance() {
      numInstances++;
   }


   public static void main(String[] arguments) {

        //19.------------------------
        /* When should you use a static method?
            // when your method is related to the object's characteristics
    creo    when you want your method to be available independently of class instances
            // when your method uses an object's instance variable 
            // When your method is dependent on the specific instance that calls it
        */
      System.out.println("Starting with: "+test_17.getCount()+" instances"); //  Starting with: 0 instances
      
      for (int i = 0; i < 500; ++i) {
          // creando instancias
            new test_17();
      }

      System.out.println("Created: " + test_17.getCount() + " instances");   //  Created: 500 instances

   }
}