//- https://replit.com/@lubaochuan/CylindricalFlakyTechnology#Main.java

package methods_and_inheritance.Code01_01_1;

public class Main {
    
  static void print(String label, int... data){
    // imprimir el label
    System.out.print(label+":");
    // imprimir todos los enteros que obtenemos en la entrada
    for(int item: data){
      System.out.print(item);
    }
    System.out.println();
  }

  public static void main(String[] args1) {
    // definimos un argumento de enteros
    int[] args = {1, 2, 3, 4};

    // llamamos al método print pasandole un String y int de datos

    print("test 1", 1, 2, 3, 4); // test 1:1234
    // array declarado e inicializado a la vez
    print("test 2", new int[]{1, 2, 3, 4}); // test 2:1234
    // array es definido en otro lugar
    print("test 3", args); // test 3:1234

  }
}