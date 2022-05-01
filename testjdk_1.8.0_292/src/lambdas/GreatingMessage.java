/*
@FunctionalInterface
*/
package lambdas;

// annotation funtional interface To show that it conforms to the rules of a functional interface
@FunctionalInterface
public interface GreatingMessage {

    // Functional interface is an Interface that has only one abstract method
    // has an abstract method with no implementation
    // Functional interface allows us to pass code around as data
    public abstract void greet(String name);



    // if try to add other method, then I get an Error: 
    // Illegal modifier for the interface field GreatingMessage.test; only public, static & final are permitted
    // public abstract void test;

    
}
