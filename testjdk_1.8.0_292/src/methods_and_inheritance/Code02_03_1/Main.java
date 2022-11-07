package methods_and_inheritance.Code02_03_1;

// This y Super
// This se refiere a la instancia de la clase actual y 
// Super proporciona acceso a los miembros
// Un constructor de cualquier clase debe invocar uno de los constructores de la clase padre inmediata 
// utilizando la palabra clave super. si no se hace explícitamente, el compilador java 
// insertará una llamada al constructor por defecto de la clase padre inmediata si una clase no define
// ningún constructor, el compilador de java insertará un constructor por defecto que llame al constructor 
// por defecto de la clase padre inmediata 
// cambiar los constructores de esta manera garantiza que los objetos se construyan correctamente

class Example {

  protected String message;

  // constructor sobrecargado
  public Example(String message){
    this.message = message;
  }
}

class Main extends Example{

  // constructor por default
  public Main(){
    // initialize the inherited directly usando super, el compilador da error
    // y no adiciona un constructor por default
    // ni llamará al constructor por defecto para nosotros 
    // super.message = "Hello";

    // para solucionarlo debemos llamar al constructor de forma explicita el único constructor en la immediate parent class

    super("Hello");
  }

  public static void main(String[] args) {
    System.out.println(new Main().message);      
  }
    
}
