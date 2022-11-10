/*
metodos que tengan un número de argumentos variable - variable-length-arguments - Varargs, 
replace [] with ...

*/
package varargs;

public class Varargs2 {

    // replace [] with ...
    // por lo tanto los demás métodos sobran ver Varargs.java
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println("[" + i + ". " + items[i] + "]");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";

        printShoppingList(item1, item2, item3);
        // puedo pasars directamente el array sin necesidad de crearlo, porque varargs
        // lo hace automaticamente
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");

        /*
SHOPPING LIST
[0. Apples]
[1. Oranges]
[2. Pears]

SHOPPING LIST
[0. Bread]
[1. Milk]
[2. Eggs]
[3. Bananas]
         */
    }
}
