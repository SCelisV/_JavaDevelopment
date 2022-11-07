package methods_and_inheritance.Code03_02_1;

// los objetos que se crean en Java son almacenados en memoria y se accede a ellos por sus referencias
// estas referencias a menudo son almacenadas como valores en variables; y como variables tienen sus propios tipos que no tienen por que coindir con el tipo del objeto al que hacen referencia.
// Un objeto de una clase hija es también un objeto de la clase padre
// Siempre podemos utilizar una referencia del tipo de la clase padre para referirnos a un objeto de la clase hija

class Example {
    public void print() {
      System.out.println("Hello");
    }
  }
  
  // la clase Main extends de Example y sobreescribe el metodo print
  
  public class Main extends Example {
    public void print() {
      System.out.println("World");
    }
  
    public static void main(String[] args) {
      // define dos referencias de diferentes tipos
      // referencia de tipo Main
      Main m = new Main();
      // referencia de tipo Example
      Example e;
  
      // esto se puede porque una referencia de tipo Example puede referenciar un
      // objeto de tipo Main, Un objeto de la clase Main es un objeto que extiende de
      // la clase Example.
      e = m;
  
      // Esto genera un error porque m no puede ser convertido a e (Example cannot be
      // converted to Main)
      // m = e;
      // hacer un cast lo soluciona
      // sabemos el tipo de objeto que es e pero AUNQUE no lo podemos cambiar pero lo hacemos para que el compilador funcione
      m = (Main)e; 
      m.print(); // World
    }
  }