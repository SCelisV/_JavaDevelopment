package methods_and_inheritance.Code02_02_3;

public class Main {

// resulta que tampoco se puede anular el método privado
// los métodos privados son sólo accesibles en la clase que son definidos
// los métodos protected son visibles en las subclases

// se ha declarado el método como private 
// se ha modificado el método como protected 
  protected String message(){
    return "Hello!";
  }

  // llama al método message
  void print(){
    System.out.println(message());
  }
   
    public static void main(String[] args) {

      new Main().print(); // Hello!
      // puede ver y usar la nueva definición del método message en la Main2.class
      new Main2().print(); // World!
        
    }
}

// The Main2 class extiende de Main class y redefine el metodo message y lo define como private
class Main2 extends Main {

// se ha declarado el método como private 
// se ha modificado el método como protected 
  protected String message(){
    return "World!";
  }

}
