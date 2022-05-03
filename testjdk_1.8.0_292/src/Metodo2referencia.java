public class Metodo2referencia{
    // Paso de argumentos por valor y por referencia
    // Lo que se copia no es el valor del argumento, sino su APUNTADOR(dirección), 
    // a la estructura de datos, es decir, 
    // se modifica el valor de la estructura de datos donde apunta el parámetro, 
    // que es el mismo lugar donde apunta el argumento

    // This metodo devuelve un int, y tiene como parámetro un int 
    static String metodo(String string){ // Método
        // paso de parámetros por referencia
        System.out.println ("Parámetro de entrada en el método - String string: " + string);
        string = string + ", modificada en el objeto String string en el método";
        System.out.println ("string: " + string);
        return string;
    }

    public static void main (String[] args){ // Programa llamante
        // Se invoca al método
        String cadena;
        cadena = "objeto de tipo String cadena";
        System.out.println ("Argumento que se pasa en el programa llamante - cadena: " + cadena);
        //Se invoca al método pasandole un objeto String de argumento
        String cadenaRetornada = metodo(cadena);
        System.out.println ("en el programa llamante cadena: " + cadena);
        System.out.println ("en el programa llamante cadenaRetornada: " + cadenaRetornada);
    }
}