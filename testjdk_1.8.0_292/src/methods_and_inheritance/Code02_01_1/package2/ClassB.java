package methods_and_inheritance.Code02_01_1.package2;

import methods_and_inheritance.Code02_01_1.package1.ClassC;

public class ClassB extends ClassC{

    public void print(){
        // los protected, pueden ser accedidos en subclases definidas en cualquier package a traves del super
        // llama a la variable protegida de la ClassC a traves del super
        super.message = "World!";
        // llama al método protegidos de la ClassC a traves del super
        super.print();
    }
    
}
