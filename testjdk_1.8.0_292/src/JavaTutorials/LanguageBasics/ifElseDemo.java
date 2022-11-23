/*
 * asigna una calificación basada en el valor de la puntuación de un examen: 
 * una A para una puntuación del 90% o superior, 
 * una B para una puntuación del 80% o superior, 
 * y así sucesivamente.
 */
package JavaTutorials.LanguageBasics;

public class ifElseDemo {


    public static void main(String[] args) {
    
        int puntuacion = 76;
        char Nota;

        // una A para una puntuación del 90% o superior, 
        if (puntuacion >= 90) {
            Nota = 'A';

        // una B para una puntuación del 80% o superior, 
        } else if (puntuacion >= 80) {
                   Nota = 'B';
        } else if (puntuacion >= 70) {
                   Nota = 'C';
        } else if (puntuacion >= 60) {
                   Nota = 'D';
        } else {
                 Nota = 'F';
        }
        
        System.out.println("Calificación = " + Nota); // Calificación = C
    } 
}
