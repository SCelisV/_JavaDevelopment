public class String2{
// Los Strings no forman parte de los tipos nativos de Java, sino que existe una clase String(java.lang.String)
// un String declarado pero sin definir, NO apunta hacia ninguna estructura de datos, su valor es null.
// es diferente a una instancia del objeto String que apunta hacia un conjunto de caracteres vacio.
public static void main(String[]args){

                 //          1         2         3         4         5
                 // 123456789012345678901234567890123456789012345678901234
                 // 012345678901234567890123456789012345678901234567890123
    String Frase = "un String es una Palabra o frase entre comillas dobles";
    System.out.println("La longitud de la Frase es: " + Frase.length());

    
    System.out.println("La Frase en mayusculas es: " + Frase.toUpperCase());
    System.out.println("La Frase en minusculas es: " + Frase.toLowerCase());
    // Substring(empieza en 0 , final+1) 
    System.out.println("el Substring(3,9) de la frase es: " + Frase.substring(3,9));

    int NumPalabras = 0, Posicion =0;

    // IndexOf retorna -1 cuando no encuentra lo que esta buscando
    while(Posicion!=-1){
        //Busca un espacio desde la Posicion+1
        Posicion = Frase.indexOf(" ", Posicion+1);
        // Suma cuando encuentra el primer espacio
        NumPalabras++;
    }

    System.out.println ("NumPalabras: " + NumPalabras);

    }
}