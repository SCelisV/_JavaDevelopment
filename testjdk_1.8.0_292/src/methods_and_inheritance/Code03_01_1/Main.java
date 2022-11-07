package methods_and_inheritance.Code03_01_1;

// El diseño orientado a objetos nos permite construir una jerarquía de clases
// No es necesario que todas las clases de la jerarquía estén completamente definidas 
// Podemos diferir la implementación a las subclases y dejar algunas clases abstractas
// abstract significa que una clase no esta completamente definida

// clase principal con un método abstracto, esto da un error de compilación ya que
// el método no tiene cuerpo y contradice el modificador del método
/* 
abstract String message(){
    return "Hello!";
  }
*/
// Está sería la definición correcta del método abstracto
abstract class Example {
  abstract String message();
}

class Main extends Example{
  public static void main(String[] args) {
    System.out.println(new Main().message());
  }

  // sobreescribe el método abstracto
  String message(){
    return "World!";  // World!
  }
}