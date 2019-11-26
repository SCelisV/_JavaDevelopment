public class PorValor {
    // no se traspasan los propios datos, sino una copia de los mismos..
    // Los argumentos del tipo byte, short, int, long, char, float, double y boolean 
    // nunca se modifican en el programa llamante, (aunque sus copias varien en el método llamado).
    
    static int Incrementar(int Edad){
        System.out.println("Edad: " + Edad);
        Edad++;
    System.out.println("Edad: " + Edad);
        return Edad;
    }

    public static void main (String[] args){
        int EdadPedroIncrementada = Incrementar(23); //Se invoca al método pero no se modifica en el programa llamante
        System.out.println(EdadPedroIncrementada);
    }
}