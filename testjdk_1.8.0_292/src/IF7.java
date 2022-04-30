public class IF7{
    // Dados tres valores A, B, y C, podemos determinar cual es el menor realizando las preguntas anidadas pertinentes.
    // Basta con evaluar dos condiciones para obtener un resultado valido:
    //    ---------------------
    // 1. | A | < | B | < | C | => A es el menor
    //    ---------------------
    //    ---------------------
    // 2. | A | > | B | < | C | => B es el menor
    //    ---------------------
    //    ---------------------
    // 3. | A | < | B | > | C | => C es el menor
    //    ---------------------


    public static void main(String[]args) {

        int C = 1, B = 2, A = 3;
        /*
        int A = 1, B = 2, C = 3;
        int A = 1, C = 2, B = 3;
        int B = 1, A = 2, C = 3;
        int B = 1, C = 2, A = 3;
        int C = 1, A = 2, B = 3;
        */

        if  (A < B) 
            if (A < C)
                // 1. | A | < | B | < | C | => A es el menor
                System.out.println("A es el menor: " + A + " B: " + B + " C: " + C);
            else  
                // 3. | A | < | B | > | C | => C es el menor
                System.out.println("C es el menor: " + C + " B: " + B + " A: " + A);
        else  
            if (C < B)
                // 3. | A | > | B | > | C | => C es el menor
                System.out.println("C es el menor: " + C + " B: " + B + " A: " + A);
            else
                // 2. | A | > | B | < | C | => B es el menor
                System.out.println("B es el menor: B: " + B + " C: " + C + " A: " + A);
    }
}    