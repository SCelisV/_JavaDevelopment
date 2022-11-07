package methods_and_inheritance.Code02_01_1;

import methods_and_inheritance.Code02_01_1.package1.ClassA;
import methods_and_inheritance.Code02_01_1.package2.ClassB;

public class Main {

    private String message = "hello ";

    // el método es llamado en la definición de la clase
    private void print(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        
        // llama al método private print de la clase Main
        new Main().print(); // hello
        // llama al método print de la ClaseA que no tiene modificador por lo tanto da error
        new ClassA().print(); // World!
        // llama al método print de la ClaseB que es definido en el package2 y extends de la ClassC
        new ClassB().print(); // World!

    }
    
}
