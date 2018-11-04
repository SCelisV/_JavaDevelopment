public class Metodo2 {
    // This metodo no devuelve ningún valor, tiene como parámetro un String
    static void Imprimir(String Mensaje){
        System.out.println("** " + Mensaje);
    }

    public static void main (String[] args){
        Imprimir("Hola Sonia"); //Se invoca al método 
        System.out.println("Hola Sonia");
        Imprimir("12.6"); //Se invoca al método 
    }
}