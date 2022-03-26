/*
I can now use a method reference to make this code shorter and simple
I can do this because all I'm using the lambda for is calling a single method on the square object that I am passing in
The sintax for a method reference is
*/

package methodreferences;

public class MethodReference {

    public static void main(String[] args){


        // new square object with a side length of 4
        Square s = new Square(4);

        // Forma cuadrado
        // implement the shapes interface and overrides (anula), the getArea method using a lambda
        // The sintax for a method reference is
        /*
        Shapes shapes = (Square square) -> {

            return square.calculateArea();          // the result of callin the calculate area method on my square object

        };
        */

        // Esto es más corto y sencillo que el lambda 
        // begin with the name of the class followed by the name of the method
        Shapes shapes = Square::calculateArea;

        // calling getArea on my square
        System.out.println("Area: " + shapes.getArea(s));       //  Area: 16
    }
    
}
