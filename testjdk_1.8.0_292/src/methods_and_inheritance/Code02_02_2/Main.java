package methods_and_inheritance.Code02_02_2;

public class Main {

// El mismo método llamado en el mismo tipo de referencia de objeto puede tener un comportamiento diferente
// El static message método no puede ser sobreescrito
// El static message método pertenece a la clase
// Cuando se redefine un método estático en una subclase, la definición en la clase padre simplemente se oculta 
// El tipo de referencia del objeto determina la definición que se utilizará.

    static Object message(){
        return "Hello!";
    }
   
    public static void main(String[] args) {

        Main m = new Main();
        Main m2 = new Main2();
        System.out.println(m.message()); // Hello!
        System.out.println(m2.message()); // Hello!
        
    }
}

// The Main2 class extiende de Main class y redefine el metodo message
class Main2 extends Main {

  static String message(){
    return "World!";
  }

}

