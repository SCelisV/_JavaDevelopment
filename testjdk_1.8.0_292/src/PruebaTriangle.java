/*
Triangle triangleA = new triangle (15, 8, 15, 8, 17);
Triangle triangleB = new triangle (3, 2.598, 3, 3, 3);
 
equilateral triangle -> has equal side lengths. Sus tres lados son iguales. Por tanto, sus ángulos también son los tres iguales. 
isosceles triangle -> has two side lengths that are equal. siendo dos iguales y el otro desigual
scalene triangle -> has all unique side lengths. Todos los lados son diferentes. 
*/
public class PruebaTriangle{
    
    public static void main(String[] args){

        // Crear las instancias - new way to store a group of data
        // How we can create triangleA and triangleB with specific base, height, and side length values

        // triangleA base=15, height=8, sideLenOne=15, sideLenTwo=8, sideLenThree=17
        Triangle TriangleA = new Triangle (15, 8, 15, 8, 17);
    
        // triangleB base=3, height=2.598, sideLenOne=3, sideLenTwo=3, sideLenThree=3
        Triangle TriangleB = new Triangle (3, 2.598, 3, 3, 3);
            
        // triangleC base=6, height=6, sideLenOne=3, sideLenTwo=2, sideLenThree=3
        Triangle TriangleC = new Triangle (6, 6, 3, 2, 3);

        // non-static instance variables, variables de instancia - their values change depending on the triangle instance
        System.out.println(TriangleA.base);
        System.out.println(TriangleA.height);
        System.out.println(TriangleA.sideLenOne);
        System.out.println(TriangleA.sideLenTwo);
        System.out.println(TriangleA.sideLenThree);
    
        // findArea() non-static method - método de instancia
        double dAreaTriangleA = TriangleA.findArea();
        System.out.println("El area del TriangleA es: " + dAreaTriangleA);

        // calculateTriangleType() non-static method - método de instancia
        System.out.println("El triangulo A es: " + TriangleA.calculateTriangleType());
        
        // non-static instance variables, variables de instancia - their values change depending on the triangle instance
        System.out.println(TriangleB.base);
        System.out.println(TriangleB.height);
        System.out.println(TriangleB.sideLenOne);
        System.out.println(TriangleB.sideLenTwo);
        System.out.println(TriangleB.sideLenThree);
    
        // findArea() non-static method - método de instancia
        double dAreaTriangleB = TriangleB.findArea();
        System.out.println("El area del TriangleB es: " + dAreaTriangleB);

        // calculateTriangleType() non-static method - método de instancia
        System.out.println("El triangulo B es: " + TriangleB.calculateTriangleType());

        // non-static instance variables, variables de instancia - their values change depending on the triangle instance
        System.out.println(TriangleC.base);
        System.out.println(TriangleC.height);
        System.out.println(TriangleC.sideLenOne);
        System.out.println(TriangleC.sideLenTwo);
        System.out.println(TriangleC.sideLenThree);
    
        // findArea() non-static method - método de instancia
        double dAreaTriangleC = TriangleC.findArea();
        System.out.println("El area del TriangleC es: " + dAreaTriangleC);

        // calculateTriangleType() non-static method - método de instancia
        System.out.println("El triangulo C es: " + TriangleC.calculateTriangleType());
    
        // A static variable's value belongs to the class - NO a una intancia en particular
        // is accessed with a .operator, using the class name.  Triangle.numOfSides
        int static_variable = Triangle.numOfSides;
        System.out.println("static variable: " + static_variable);

        // A static methods
        String static_methods = Triangle.staticCalculateTriangleType(15, 8, 17);
        System.out.println("static_methods: " + static_methods);

        static_methods = Triangle.staticCalculateTriangleType(3, 3, 3);
        System.out.println("static_methods: " + static_methods);

        static_methods = Triangle.staticCalculateTriangleType(3, 2, 3);
        System.out.println("static_methods: " + static_methods);
    }
}
