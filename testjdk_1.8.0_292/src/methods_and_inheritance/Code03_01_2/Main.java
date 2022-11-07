package methods_and_inheritance.Code03_01_2;

// Una interface puede tener métodos no abstractos, por ejemplo default methods
// que proporcionan implementación por defecto
// deben incluir un cuerpo
// la interface define un método llamado message()
interface MainInterface{
  default String message(){
    return "Hello!"; // Hello!
  };
}

// clase principal implementa una interface
class Main implements MainInterface{
  public static void main(String[] args) {
    System.out.println(new Main().message());
  }

}