/*
Implementar la Functional Interface - GreatingMessage con Lambda
*/

package lambdas;

public class LambdaImplementGreatingMessage {

    public static void main(String[] args){

        // I didn't need to create a new GreatingMessage
        // Inside the brackets put the variables (separadas por coma) that will be used in the greet method

        // No es necesario especificar el type
        // GreatingMessage gm =  name) -> {     
        //     System.out.println("Hello: " + name);
        // };

        // I didn't need writ out whole body of the method again

        // especificando el type
        GreatingMessage gm = (String name) -> { 
            System.out.println("Hello: " + name);
        };


        // I can call the method y pasarle variables
        gm.greet("Sonia");

    }
}
