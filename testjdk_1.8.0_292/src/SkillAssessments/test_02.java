package SkillAssessments;
/*
LinkedIn - skill-assessments

El método hashCode() dar una identidad única (número de código Hash) al objeto. 

*/

public class test_02{

    public static void main(String[] args){


        //1.-------------------------
        /* what method signature will work with this code?

        boolean healthyOrNot = isHealthy("avocato");
        public boolean isHealthy(String string){

        }
        */

        //2.-------------------------
        // What is the output of this code?

        int[] sampleNumbers = {8, 5, 3, 1};
        System.out.print(sampleNumbers[2]);     //  3

        //3.-------------------------
        // What is the output of this code?

        String fruit = "strawberries";
        System.out.println(fruit.substring(2,5));   // raw
        
        //4.-------------------------
        // What statement return true if "nifty" is of type String?

        String nifty = "nifty";
        // "nifty".getType().equals("String"); //  The method getType() is undefined for the type String
        if( nifty instanceof String) {
            System.out.println(nifty instanceof String);    //  true
        }
        // "nifty".getClass().getSimpleName() == "String"   // Syntax error, insert ")" to complete 
                                                            // MethodInvocationJava(1610612976)
        //  "nifty".getType() == String;    //  The left-hand side of an assignment must be a variable

        //6.-------------------------
        /* What frase indicates that a function receives a copy of each argument passed to it rather than (en logar de) a reference to the objects themselves?

        Los tipos primitivos en Java (int, double, char, boolean…) se caracterizan por no ser objetos y, 
        por tanto, no tienen una dirección de memoria que les apunte (entre otras características). 
        Por ello en memoria se guarda directamente el valor concreto de la variable. 
        Cuando llamamos a un método metemos en la pila de llamada una copia de la variable original.

        Por otro lado tenemos los objetos, que vienen representados por una dirección de memoria. 
        Al pasar un objeto por parámetro se guardará en la pila la dirección de memoria de la variable externa apuntada. 
        Lo importante es ver que no es la propia referencia original la que se manda, 
        por lo que el objeto al que apunta es el original pero no lo es el espacio de memoria donde se almacena la dirección. 
        Es decir, si cambiamos la dirección de memoria de la pila no cambiará en la variable original.

            // API call 
            // pass by reference
            // pass by occurrence
            pass by value
        */
        //8.-------------------------
        /* What is a valid use of the hashCode() method
            // moving objects from a List to a HashMap
            // enabling HashMap to find matches faster
            // encypting user passwords
            deciding if two instances of a class are equal
        */
        //9.-------------------------
        /* what type of variable can be assigned to only once
            // non-static
            // private
            final
            // static
        */
        //12.------------------------
        int a = 1;
        int b = 0;
        int c = a/b;

        System.out.println(c);  //  Exception in thread "main" java.lang.ArithmeticException: / by zero

        //13.------------------------
        /* What language construct serves as a blueprint containing an object's properties and functionality?
        Que construccion del lenguage sirve como un plano que contiene las propiedades y la funcionalidad de un objeto
            // instance
            // constructor
            class        A blueprint for a software object is called a class.
            // method
        */
        //15.------------------------
        /*  You get NullPointerException what is the most likely cause?
        NullPointerException are exceptions that occur when you try to use a reference that points to no location in memory (null) as though it were referencing an object. Calling a method on a null reference or trying to access a field of a null reference will trigger a NullPointerException .

            Your code has used up all available memory
            //  A file that needs to be opened cannot be found
            //  A network connection has been  lost in the middle of communications
            // The object you are using has not been instanced
        */

        //17.------------------------
        /* What method can be used to create a new instance of an object?
            // another instance
            // private method
            constructor
            // field
        */

        //18.------------------------
        /* Which is the most reliable expression for testing whether the values of two string variables are the same
            //  string1 = string2;
            //  string1 == string2;
                string1.equals(string2);
            //  string1.matches(string2);
        */

        //20.------------------------
        /* By implementing encapsulation, you cannot directly access the class's ____
            properties unless you are writing code inside the class itself
            // package-private(no explicit modifier)
            // protected
            // public
            private

            Cómo implementar la encapsulación en java: 
            1) Haz que las variables de instancia sean privadas para que no se pueda acceder a ellas directamente desde fuera de la clase. 
            Sólo se pueden establecer y obtener valores de estas variables a través de los métodos de la clase. 
            2) Tener métodos getter y setter en la clase para establecer y obtener los valores de los campos.
        */

    }

}