public class String2.0 {
    
    // existe una clase String(java.lang.String);

    public static void main (String[] args){

        // String Frase = Teclado.Lee_String();
        String Frase = "El sentido aracnido de Louise";
        System.out.println("Frase.length: " + Frase.length());

        String FraseMayusculas = Frase.toUpperCase();
        System.out.println("FraseMayusculas: " + FraseMayusculas);

        String FraseMinusculas = Frase.toLowerCase();
        System.out.println("FraseMinusculas: " + FraseMinusculas);

        String Caracteres3A18 = Frase.substring(3,8);
        System.out.println("Caracteres3A18: " + Caracteres3A18);

        int NumPalabras=0, Posicion=0;

        while(Posicion!=-1){ //el resultado de indexOf vale -1 cuando no hay más caracteres en blanco
            // Busca los espacios en la frase y recupera la Posicion
            Posicion = Frase.indexOf(" ", Posicion + 1);
            // System.out.println("Posicion: " +  Posicion);
            NumPalabras++;
            // System.out.println("NumPalabras: " +  NumPalabras);
        }
        // System.out.println("Posicion: " +  Posicion);
        System.out.println("NumPalabras: " + NumPalabras);
    }
}