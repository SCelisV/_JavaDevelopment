/*
    // How we can create triangleA with specific base, height, and side length values
    // triangleA base=15, height=8, sideLenOne=15, sideLenTwo=8, sideLenThree=17
    // new way to store a group of data
    // triangle triangleA = new triangle (15, 8, 15, 8, 17);
    // How we can create triangleB with different attribute values
    // triangleB base=3, height=2.598, sideLenOne=3, sideLenTwo=3, sideLenThree=3
    // new way to store a group of data
    // triangle triangleB = new triangle (3, 2.598, 3, 3, 3);
    
    
    */
    public class Triangle{

        // we access a static class variable using the class name 
        // A static variable's value belongs to the class - NO a una intancia en particular
        // is accessed with a .operator, using the class name.  Triangle.numOfSides
        static int numOfSides = 3;
        
        // attributes - propiedades - or instance variables
        // attributes are accessibles throughout the triangle class
        // triangle class defines base, height, sideLenOne, sideLenTwo, sideLenThree.   TriangleA.base
        double base;
        double height;
        double sideLenOne;
        double sideLenTwo;
        double sideLenThree;

        // constructores
    // How we create and initialize each triangle we want to use in our program
    // this helps our program make a distinction between the attribute variable and the parameter variable 
    // this because we are talking about an attribute of the triangle we are constructing
    // this + ('.' - dot operator) allows us to access the new Triangle's attribute variables (we can access the to-be-created instance's)
    // initializing the attributes of the new triangle with the values of the corresponding parameters.
    
    // constructor parameters are only accessible inside the constructor
    public Triangle (double base, double height, 
                     double sideLenOne, double sideLenTwo, double sideLenThree){
        // this + ('.') - attributes de la clase 
        // inicializar los atributos de la clase con los parametros del constructor
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
        
    }
    
    // método - de instancia - non static
    public double findArea(){
        return (this.base * this.height) / 2;
    }

    // equilateral triangle -> has equal side lengths. Sus tres lados son iguales. Por tanto, sus ángulos también son los tres iguales. 
    // isosceles triangle -> has two side lengths that are equal. Dos de sus lados son iguales y el otro desigual
    // scalene triangle -> has all unique side lengths. Todos los lados son diferentes. 
    // static si la función no utiliza los atributos de una clase, pero sigue estando relacionada con el tema o la idea general de la clase
    
    public String calculateTriangleType(){

        String typeTriangle = null;
        
        if (this.sideLenOne == this.sideLenTwo){
            if (this.sideLenOne == this.sideLenThree){
                typeTriangle = "equilateral - equilatero - sus tres lados son iguales"; 
            } else {
                typeTriangle = "isosceles - isosceles"; 
            }
        } else { if (this.sideLenOne == this.sideLenThree){
                    typeTriangle = "isosceles - isosceles - dos lados son iguales"; 
                } else {
                    typeTriangle = "escalene - escaleno todos los lados son diferentes"; 
                }
        }
        
        return typeTriangle;
        
    }

    public static String staticCalculateTriangleType(double sideLenOne, 
                                                     double sideLenTwo, 
                                                     double sideLenThree){

        String typeTriangle = null;
        
        if (sideLenOne == sideLenTwo){
            if (sideLenOne == sideLenThree){
                typeTriangle = "equilateral - equilatero - sus tres lados son iguales"; 
            } else {
                typeTriangle = "isosceles - isosceles"; 
            }
        } else { if (sideLenOne == sideLenThree){
                    typeTriangle = "isosceles - isosceles - dos lados son iguales"; 
                } else {
                    typeTriangle = "escalene - escaleno todos los lados son diferentes"; 
                }
        }
        
        return typeTriangle;
        
    }
    
}
