package methods_and_inheritance.Code01_03_1;

class Main {

    // Por ejemplo, un miembro estático se ejecuta siempre en un contexto estático y, por tanto, no tiene acceso a ningún miembro de instancia de la clase
    static void print(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Main m = new Main();

    // llamar el método estatico en diferentes formas

    // llamar al método por medio de una instancia 
        m.print(); // Hello World!

    // Un método static puede ser llamado directamente en un static context
    // llamar al método de forma directa in the static main method
        print(); // Hello World!
        m = null;
    
    // Un método static is associated with its class, not an instance of the class. Por lo tanto no necesitamos un objeto concreto para llamar a un método static
        m.print(); // Hello World!
        
    }
    
}
