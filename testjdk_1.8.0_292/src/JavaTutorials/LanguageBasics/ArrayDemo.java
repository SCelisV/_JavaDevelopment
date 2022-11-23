/*
 * crea un array de enteros, pone algunos valores en el array, e imprime cada valor en la salida estándar.
 */
package JavaTutorials.LanguageBasics;

class ArrayDemo{

    public static void main(String[] args) {

        // declara un array de enteros
        int[] array;

        // define el tamaño del array de enteros
        // Si falta esta instrucción, el compilador imprime un error como el siguiente y la compilación falla:
        // ArrayDemo.java:16: Es posible que la variable array no se haya inicializado.
        array = new int[10];

        // inicializa el array
        // Las siguientes líneas asignan valores a cada elemento de la matriz:
        array[0] = 1;
        array[1] = 10;
        array[2] = 100;
        array[3] = 1000;
        array[4] = 10000;
        array[5] = 100000;
        array[6] = 1000000;
        array[7] = 10000000;
        array[8] = 100000000;
        array[9] = 1000000000;

        // imprime cada elemento del array 
        // Se accede a cada elemento de la matriz por su índice numérico:

        System.out.println("\nElemento " + " Indice [0]: " + array[0]);
        System.out.println("\nElemento " + " Indice [1]: " + array[1]);
        System.out.println("\nElemento " + " Indice [2]: " + array[2]);
        System.out.println("\nElemento " + " Indice [3]: " + array[3]);
        System.out.println("\nElemento " + " Indice [4]: " + array[4]);
        System.out.println("\nElemento " + " Indice [5]: " + array[5]);
        System.out.println("\nElemento " + " Indice [6]: " + array[6]);
        System.out.println("\nElemento " + " Indice [7]: " + array[7]);
        System.out.println("\nElemento " + " Indice [8]: " + array[8]);
        System.out.println("\nElemento " + " Indice [9]: " + array[9]);
    
    }
}

