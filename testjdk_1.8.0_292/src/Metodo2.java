public class Metodo2 {
    // This metodo no devuelve ningún valor, tiene como parámetro un String
    // tipo de retorno void, no es necesario utilizar return, o 
    // se puede utilizarla sin un valor asociado.

    static void Imprimir(String Mensaje){ // Método
        // Imprime por consola el String que recibe como parámetro
        // precedido y seguido por dos **
        System.out.println("** " + Mensaje + " **");
    }

    public static void main (String[] args){ // Programa llamante
        // Se invoca al método pasandole "Hola Sonia", como argumento
        Imprimir("Hola Sonia"); 
        //Se invoca al método pasandole "12.6", como argumento
        Imprimir("12.6"); 
    }
}