public class BucleWhile1{
    // Imprimir los números 1, 2, 3, 4 con While
    // Errores frecuentes: 
    // Olvidar incrementar el contador, 
    // Olvidar las llaves delimitadoras del ámbito del bucle
    public static void main (String[]args){
        int i=1;
        while ( i<=4 ){
            System.out.println("Número: " + i);
            i++;
        }
    }
}