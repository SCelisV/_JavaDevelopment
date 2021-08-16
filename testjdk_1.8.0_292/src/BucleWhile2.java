public class BucleWhile2{
    // Imprimir los números 1, 2, 3, 4 con While
    // Errores frecuentes:
    // Olvidar incrementar el contador, 
    public static void main (String[]args){
        int i=1;
        // Se ejecuta por lo menos una vez
        do {
            System.out.println("Número: " + i);
            i++;
        } while ( i<=4 );
    }
}