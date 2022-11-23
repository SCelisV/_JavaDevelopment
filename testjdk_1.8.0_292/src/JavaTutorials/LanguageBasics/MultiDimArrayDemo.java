/*
 * una matriz multidimensional es una matriz cuyos componentes son ellos mismos matrices. 
 * Esto es diferente a las matrices en C o Fortran. 
 * Una consecuencia de esto es que se permite que las filas varíen en longitud.
 */
package JavaTutorials.LanguageBasics;

public class MultiDimArrayDemo {

    public static void main(String[] args) {
        
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones", "Most"}
        };

        System.out.println(names[0][0]); //Mr.
        System.out.println(names[0][1]); // Mrs.
        System.out.println(names[0][2]); // Ms.

        System.out.println(names[1][0]); // Smith
        System.out.println(names[1][1]); // Jones
        System.out.println(names[1][2]); // Most

        System.out.println(names.length); // 2

    }
    
}
