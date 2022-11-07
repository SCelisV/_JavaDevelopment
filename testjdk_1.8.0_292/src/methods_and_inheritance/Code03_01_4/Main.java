package methods_and_inheritance.Code03_01_4;

// la interface define un método abstract llamado print(), 
// Todos los métodos de la interface son publicos por definicion
interface MainInterface {
  // abstract void print();
  public abstract void print();
}

// clase principal implementa una interface
class Main implements MainInterface {
  public static void main(String[] args) {
    new Main().print();
  }

  // Implementa el método de la interface
  // Genera un error
  // Todos los métodos de la interface son publicos por definicion y deben ser
  // implementados como public en este caso esta definido como private
  // void print() {
  public void print() {
    System.out.println("Hello!");   // Hello!
  }
}
