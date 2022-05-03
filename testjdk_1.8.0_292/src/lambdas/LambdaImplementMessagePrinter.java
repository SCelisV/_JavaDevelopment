/*
Implementar la Functional Interface - MessagePrinter con Lambda
*/

package lambdas;

public class LambdaImplementMessagePrinter{

    public static void main(String[] args){

        // Inside the brackets put the variables (separadas por coma) that will be used in the greet method

        // I didn't need writ out whole body of the method again

        // especificando el type
        MessagePrinter mp = () -> { 
            System.out.println("This is a message");
        };


        // I can call the method y pasarle variables si tiene
        mp.printMessage();

    }
}
