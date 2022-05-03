/*
method references are a shorthand way of writing a certain type of lambda expression.
*/
package methodreferences;



public class Square {

    // privete field 
    int sideLength;

    // contructor 
    public Square(int sideLength){

        this.sideLength = sideLength;

    }
    
    // public method to calculate area
    public int calculateArea(){

        return sideLength * sideLength;

    }
}
