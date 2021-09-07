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
        //24.------------------------
        /*
        Which access modifier makes variable and methods visible only in the class where they are declared 

        // protected
        // public
        private
        //
        */
        //25.------------------------
        /*
        How does the keyword volatile affect how a variable is handled?
        La palabra clave Volatile se utiliza para modificar el valor de una variable por diferentes hilos. 
        Esto significa que múltiples hilos pueden usar un método e instancia de las clases al mismo tiempo sin ningún problema.
        puede ser usada tanto con tipos primitivos como con objetos
        No almacena en caché el valor de la variable y 
        siempre lee la variable desde la memoria principal. 
        No se puede utilizar con clases o métodos. Sin embargo, se utiliza con variables. 
        Garantiza la visibilidad y el orden. 
        Evita que el compilador reordene el código.

        cache: an auxiliary memory from which high-speed retrieval is possible. cache sizes range from 64K to 256K
        store (data) in a cache memory, the operating system tries to cache every disk operation

        // It will be stored on the hard drive.
        It will never be cached by the CPU(Central Processing Unit)).
        // It will be preferencially garbage collected.
        // It will be read by only one thread at a time
        */

        //26.------------------------
        /*
        Which are valid keywords in a Java module descriptor (module-info.java)?
        
        // imports, exports
        // provides, employs
        requires, exports
        // consumes, supplies

        testjdk_1.8.0_292/src/modules/HelloModularWorld.java
        testjdk_1.8.0_292/src/module-info.java

        */

        //27.------------------------
        /*
        Which choise is a disadvantage of inheritance?

            Responsibilities are not evenly distributed berween parent and child classes.
            Overridden methods of the parent class cannot be reused.
            Classes related by inheritance are tighly coupled to each other
            The internal state of the parent class is accessible to its children


        */

        //28.------------------------
        /*
        Java programmers commonly use design patterns.
        Some examples are the _______________________, which helps create instances of a class; 
        the __________; which ensures that only one instance of a class can be created; and 
        the __________, which allows for a group of algorithms to be interchangeable.

            // singleton, strategy pattern, static factory method
            static factory method, singleton, strategy pattern
            // strategy pattern, static factory method, singleton
            // creation pattern, singleton, prototype pattern

            https://www.javatpoint.com/design-patterns-in-java
            https://www.javatpoint.com/factory-method-design-pattern            
            https://www.javatpoint.com/singleton-design-pattern-in-java
            https://www.javatpoint.com/strategy-pattern

            Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
            Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
            In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
            A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

        */

        //29.------------------------
        /*
        The ____________ access modifier allows access to subclasses and classes within the same package,
        While the __________ modifier allows access within the package only.

            // protected; package
            default; protected
            // protected; default
            // default; package

        */

    }

}