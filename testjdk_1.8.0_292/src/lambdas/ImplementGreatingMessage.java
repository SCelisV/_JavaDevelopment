/*
Implementar la Functional Interface
At the moment the codes to implement my functional interface is quite long and messy 
considering all it does is provide one new line of functionality.
*/


package lambdas;

public class ImplementGreatingMessage {

    public static void main(String[] args){
        // Create an instance of GreatingMessage class
        GreatingMessage gm = new GreatingMessage(){
            // Because GreatingMessage has an abstract method with no implementation
            // add every time I create a new instance of GreatingMessage
            // or anonymous in a class 
            //
            // NetBeans automatic implementation
            // @Override
            // public void greet(String name){
            //     throw new UnsupportedOperationException("Not supported yet."); 
            // }

            // my own implementation
            // Functional interface allows us to pass code around as data
            @Override
            public void greet(String name){
                System.out.println("Hello: " + name);
            }
        };

    // I can call the method by writing gm.greet
    gm.greet("Sonia");

    }
}
