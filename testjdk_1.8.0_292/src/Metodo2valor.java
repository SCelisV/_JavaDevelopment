public class Metodo2valor{
    // Paso de argumentos por valor y por referencia
    // Los argumentos (primitivos) se pasan a los parámetros POR VALOR, 
    // esto quiere decir que NO SE TRASPASAN los propios datos, sino una COPIA de los mismos.
    // tipo byte, short, int, long, char, float, double y boolean
    // NUNCA se modifican en el programa llamante (aunque sus copias varian en el método llamado

    // This metodo devuelve un int, y tiene como parámetro un int 
    static int Incrementar(int Edad){ // Método
        // paso de parámetros primarios por valor
        System.out.println ("Parámetro de entrada en el método - Edad: " + Edad);
        Edad = (Edad + 1);
        System.out.println ("Edad MODIFICADA en el método - Edad: " + Edad);
        return Edad;
    }

    public static void main (String[] args){ // Programa llamante
        // Se invoca al método Incrementar 
        int Edad= 20;
        int EdadIncrementada = 0;
        System.out.println ("Argumento que se pasa en el programa llamante - Edad: " + Edad);
        //Se invoca al método pasandole la Edad como argumento
        EdadIncrementada = Incrementar(Edad); 
        System.out.println ("Edad en el programa llamante NO SE HA MODIFICADO - Edad: " + Edad);
        System.out.println ("EdadIncrementada en el programa llamante: " + EdadIncrementada);
    }
}