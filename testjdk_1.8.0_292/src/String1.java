public class String1{
// Los Strings no forman parte de los tipos nativos de Java, sino que existe una clase String(java.lang.String)
// un String declarado pero sin definir, NO apunta hacia ninguna estructura de datos, su valor es null.
// es diferente a una instancia del objeto String que apunta hacia un conjunto de caracteres vacio.
public static void main(String[]args){

    String StringDeclarado;
    String InstanciaDeString = "Palabra o frase entre comillas dobles";
    String OtroString = "Rojitas las orejas, se me ponen si me besas... ";
    String NoVacio = "";
    String Vacio = null;

    System.out.println ("InstanciaDeString: " + InstanciaDeString);
    System.out.println ("OtroString: " + OtroString);
    System.out.println ("NoVacio: " + NoVacio);
    System.out.println ("Vacio: " + Vacio);

    // Dos instancias de un String apuntando hacia contenidos idénticos, no significa que sean iguales.

    String UnaInstanciaDeString = "Palabra o frase entre comillas dobles";
    String OtraInstanciaDeString = "Palabra o frase entre comillas dobles";
    StringDeclarado = UnaInstanciaDeString;

    System.out.println ("UnaInstanciaDeString: " + UnaInstanciaDeString);
    System.out.println ("OtraInstanciaDeString: " + OtraInstanciaDeString);
    System.out.println ("StringDeclarado: " + StringDeclarado);

    if (UnaInstanciaDeString == OtraInstanciaDeString){
        System.out.println("Verdadero del if: Son iguales: " + UnaInstanciaDeString + " " + OtraInstanciaDeString);
    } else 
        System.out.println("Falso del if: NO son iguales: " + UnaInstanciaDeString + " " + OtraInstanciaDeString);

    // Para poder comparar dos Strings por su contenido ( y no por su referencia), equals (compara caracter a caracter.)
    boolean Iguales = false;
    Iguales = UnaInstanciaDeString.equals(OtraInstanciaDeString);
    if (Iguales)
        System.out.println ("UnaInstanciaDeString: " + UnaInstanciaDeString + " OtraInstanciaDeString: " + OtraInstanciaDeString + " Son Iguales: " + Iguales);

    Iguales = false;
    Iguales = UnaInstanciaDeString.equals(StringDeclarado);
    if (Iguales)
        System.out.println ("UnaInstanciaDeString: " + UnaInstanciaDeString + " StringDeclarado: " + StringDeclarado + " Son Iguales: " + Iguales);


    }
}