public class PorReferencia {
    // Lo que se copia no es el valor del argumento sino su apuntador a la estructura de datos;
    // Se modifica el valor de la estructura de datos donde apunta el parámetro, que es el mismo lugar donde apunta el argumento
    // Si queremos asegurarnos que los parámetros no puedan modificarse se deben declarar con el attribute "final"
    
    static void Metodo (Objeto Parametro){
        System.out.println("Método: " + Parametro);
        return Objeto;
    }

    public static void main (String[] args){
        System.out.println();
    }
}