public class IF8{
    // Dados tres valores A, B, y C, podemos determinar cual es el menor realizando las preguntas anidadas pertinentes.
    // Más fácil de entender pero mucho más costosa en ejecución
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

        int A = 1, B = 2, C = 3;
        /*
        int A = 1, C = 2, B = 3;
        int B = 1, A = 2, C = 3;
        int B = 1, C = 2, A = 3;
        int C = 1, A = 2, B = 3;
        int C = 1, B = 2, A = 3;
        */

        if  ((A <= B) && (A <= C))
            // 1. | A | < | B | < | C | => A es el menor
            System.out.println("A es el menor: " + A + " B: " + B + " C: " + C);
        if  ((B <= A) && (B <= C))
            // 2. | A | > | B | < | C | => B es el menor
            System.out.println("B es el menor: " + B + " A: " + A + " C: " + C);
        if  ((C <= A) && (C <= B))
            // 3. | A | < | B | > | C | => C es el menor
            System.out.println("C es el menor: " + C + " A: " + A + " B: " + B);
    }
}    