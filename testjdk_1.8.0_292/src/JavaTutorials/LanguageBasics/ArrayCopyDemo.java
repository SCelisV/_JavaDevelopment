/*
 La clase System tiene un método arraycopy que puedes utilizar para copiar datos de forma eficiente de un array a otro:

 arraycopy(Object, int, Object, int, int) in the type System is not applicable for the arguments (String[], int, int, int, String[], int)
 Los dos argumentos Object especifican el array del que se va a copiar y el array al que se va a copiar. 
 Los tres argumentos int especifican la posición inicial en el array de origen, la posición inicial en el array de destino y el número de elementos del array a copiar.
 */
package JavaTutorials.LanguageBasics;

public class ArrayCopyDemo {


    public static void main(String[] args) {
    
        String [] copiarDesde = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"};

        // System.out.println(copiarDesde.length);

        int sizeArray = 0;
        for (String elemento: copiarDesde) {
            System.out.println(elemento);
            sizeArray = sizeArray +1;
            // System.out.println(sizeArray);
        }

        String [] copiarA;
        copiarA = new String[sizeArray];
        // System.out.println(copiarA.length);

 // arraycopy(Object, int, Object, int, int) in the type System is not applicable for the arguments (String[], int, int, int, String[], int)
 // Los dos argumentos Object especifican el array del que se va a copiar y el array al que se va a copiar. 
 // Los tres argumentos int especifican la posición inicial en el array de origen, la posición inicial en el array de destino y el número de elementos del array a copiar.

        System.arraycopy(copiarDesde, 0, copiarA, 0, copiarDesde.length);

        for (String string : copiarA) {
            System.out.println(string);
        }
    }
}
