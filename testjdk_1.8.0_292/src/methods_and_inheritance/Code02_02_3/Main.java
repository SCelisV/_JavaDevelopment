package methods_and_inheritance.Code02_02_3;

public class Main {

// resulta que tampoco se puede anular el método privado
// los métodos privados son sólo accesibles en la clase que son definidos

// se ha declarado el método como private 
  private String message(){
    return "Hello!";
  }

  // llama al método message
  void print(){
    System.out.println(message());
  }
   
    public static void main(String[] args) {

      new Main().print(); // Hello!
      // sólo puede ver la definición del método message de la línea 9 en la Main.class
      new Main2().print(); // Hello!
        
    }
}

// The Main2 class extiende de Main class y redefine el metodo message y lo define como private
class Main2 extends Main {

// se ha declarado el método como private 
  private String message(){
    return "World!";
  }

}
