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
       
    String filename = "file.mov";
    String name = "";
    String extension = "";
    
    // IndexOf retorna -1 cuando no encuentra lo que esta buscando
    int Pos = 0;
    name = filename.substring(0,filename.indexOf(".", Pos+1));
    extension = filename.substring(filename.indexOf(".", Pos+1),filename.length());
 
    System.out.println("Pos: " + Pos);     
    
    System.out.println("name: " + name + "\n" + "extension: " + extension);
    
    if(filename.endsWith(".gif")) {
        System.out.println("El fichero: " + filename + " es una animación \"moving images\" Graphic Interchange Format - gif");
    } else 
        System.out.println("El fichero: " + filename + " es un formato comun de video, es almacenado por \"QuickTime File\" - mov");
    
    if(extension.equals(".gif"))
        System.out.println("El fichero: " + filename + " tiene extension: gif");
    else
        System.out.println("El fichero: " + filename + " NO tiene la extension: gif");

    if(".gif".equals(extension))
        System.out.println("La extensión del fichero: " + filename + " es: gif");
    else
        System.out.println("La extensión del fichero: " + filename + " es: " + extension);
    
    /*
    * substring, esta sobrecargado: ambas formas requieren un índice inicial.
    * La forma de un argumento devuelve desde startIndex hasta el final.
    * La forma de dos argumentos toma un índice final.
    * De tal forma que un índice pueda generarse mediante los métodos indexOf() ó lastIndexOf() de String
    * El indice final sobrepasa el último carácter
    */

             //          1         2         3         4         5
             // 123456789012345678901234567890123456789012345678901234
             // 012345678901234567890123456789012345678901234567890123
    String a = "Java is great and is beautiful.";
    System.out.println("a: " + a);          // a: Java is great and is beautiful.

    String b = a.substring(5);
    System.out.println("b: " + b);          // b: is great and is beautiful.

    String c = a.substring(5, 7);
    System.out.println("c: " + c);          // c: is

    String d = a.substring(5, a.length());
    System.out.println("d: " + d);          // d: is great and is beautiful.

    Integer e = a.lastIndexOf("is");
    System.out.println("e: " + e);          // e: 18

	}
	
}