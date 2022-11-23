/*
 * Ordenar un array de forma ascendente. 
 * Esto puede hacerse de forma secuencial, utilizando el método sort, 
 * o de forma concurrente, utilizando el método parallelSort introducido en Java SE 8. 
 * La ordenación paralela de matrices grandes en sistemas multiprocesadores es más rápida que la ordenación secuencial de matrices.
 * El algoritmo de ordenación es una ordenación-fusión paralela que divide la matriz en submatrices 
 * que a su vez se ordenan y luego se fusionan. 
 * Cuando la longitud de la submatriz alcanza una granularidad mínima, la submatriz se ordena utilizando el método Arrays.sort apropiado. 
 * Si la longitud de la matriz especificada es menor que la granularidad mínima, entonces se ordena utilizando el método Arrays.sort apropiado. 
 * El algoritmo requiere un espacio de trabajo no mayor que el tamaño del array original. 
 * El método common de la clase ForkJoinPool se utiliza para ejecutar cualquier tarea paralela.
 * https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinPool.html#commonPool--
 */
package JavaTutorials.LanguageBasics;

public class ArrayOrdenarParalela {
    public static void main(String[] args) {

        int [] array = {10, 9, 8, 7, 6, 5};

        java.util.Arrays.parallelSort(array);

        for (int i : array) {

            System.out.println(i);
        }

// 5
// 6
// 7
// 8
// 9
// 10
        
    }
}
