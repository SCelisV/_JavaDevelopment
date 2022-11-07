package methods_and_inheritance.Code03_01_3;

// la interface define un método llamado print(), definido como static que debe tener un cuerpo, y debe pertenecer a la interface igual que un metodo static class pertenece a su clase, 
// los métodos estáticos no se heredan
interface MainInterface {
    static void print() {
      System.out.println("Hello!");; // Hello!
    }
  }
  
  // clase principal implementa una interface
  class Main implements MainInterface {
    public static void main(String[] args) {
      // da un error de compilación:
      // Main.print();
      //por lo que tenemos que llamar a la interface
      MainInterface.print();
    }
  }