package methods_and_inheritance.Code02_02_1;

// Diferentes subclases con una superclase común pueden tener diferentes definiciones para métodos comunes 
// Una subclase puede heredar o redefinir methods de las superclases.
// Como resultado, diferentes subclases con una superclase común pueden tener diferentes definiciones para métodos comunes
// polimorfismo - polymorphism
// usualmente la sobreescritura del método tiene la misma header
// Java no permite una sobreescritura de un method con diferentes types de return 
// debe ser de un tipo compatible

import methods_and_inheritance.Code02_02_1.Main2;

public class Main {

// Este método "message", tiene la misma firma del Main2 pero diferentes types of returns
    Object message(){
        return "H3llo";
    }

    public static void main(String[] args) {

        Main m = new Main();
        System.out.println("m.message: " + m.message()); // m.message: H3llo

        Main m2 = new Main2();
        System.out.println("m2.message: " + m2.message()); // m2.message: World!
        
    }
    
}

class Main2 extends Main {

// extiende de Main y sobreescribe el método "message", tiene la misma firma pero diferentes types of returns
// Object de Main2 es un object de Main Class.
    String message(){
        return "World!";
    }

}
