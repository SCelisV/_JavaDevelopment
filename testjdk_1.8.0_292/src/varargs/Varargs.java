/*
metodos que tengan un número de argumentos variable - variable-length-arguments - Varargs, 
*/
package varargs;

public class Varargs {

    // This method imprime la cabecera de la lista y dos items
    private static void printShoppingList(String string1, String string2){
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
        System.out.println("");
    }

    // Si necesito imprimir tres items
    // tengo que sobreescribir este método que tome tres arguments
    private static void printShoppingList(String string1, String string2, String string3){
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
        System.out.println("3. " + string3);
        System.out.println("");
    }

    // para no tener que sobreescribir el método para que tome diferente número de argumentos
    // recibe un array de items
    private static void printShoppingList(String[] items){
        System.out.println("SHOPPING LIST");
        for(int i=0; i < items.length; i++){
            System.out.println("[" + i + ". " + items[i] + "]");
        }
        System.out.println("");
    }

    // genera un warning informando que hay dos métodos que reciben un array en la
    // misma clase
    // porque los dos métodos funcionan igual
    // por lo tanto los demás métodos sobran... ver vararg2.java
    /*
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println("[" + i + ". " + items[i] + "]");
        }
        System.out.println("");
    }
     */

    public static void main(String[] args){


        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";

        String[] shopping = {"Bread","Milk", "Eggs", "Bananas"}; 
        
        // imprime los items con el método que recibe 3 argumentos de type String
        printShoppingList(item1, item2, item3);

        // imprime la lista de la compra con el método que recibe un array de items
        printShoppingList(shopping);

        /*
SHOPPING LIST
1. Apples
2. Oranges
3. Pears

SHOPPING LIST
[0. Bread]
[1. Milk]
[2. Eggs]
[3. Bananas]
         */
    }
}
