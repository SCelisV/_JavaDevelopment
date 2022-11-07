package methods_and_inheritance.Code02_03_2;

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
  private String message;

  // constructor sobrecargado
  public Example(String message){
    this.message = message;
  }

  // escritura del método toString
  public String toString(){
    return message;
  }
}

class Main extends Example{

  public Main(String message){
    super(message);
  }

  // sobreescrite el método toString definido en la clase padre
  // intenta adicionar una exclamación al final del mensaje
  public String toString(){
    // El super es usado para referirse a la versión del método toString de la clase padre 
    // java no podrá invocar el método toString on Super
    // return super+"!";

    // para solucionarlo debemos llamar a la versión del padre
    return super.toString()+"!";
  }

  public static void main(String[] args) {
    System.out.println(new Main("Hello")); // Hello
  }
    
}
