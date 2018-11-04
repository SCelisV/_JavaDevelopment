import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class Teclado {

    public static String entradaString;

    public static float entradaFloat;

    public static String Lee_String(Scanner Cadena){
        return (entradaString=Cadena.nextLine());
    }

    public static float Lee_Float(Scanner Fnumber){
        return(entradaFloat=Fnumber.nextFloat());
    }
}