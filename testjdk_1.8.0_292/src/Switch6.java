public class Switch6{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Switch anidados - En la clase Switch5 se ve como se anidarían los switch, en esta clase lo hará con un par de preguntas
    // Un usuario puede escoger entre las siguientes opciones:
    // MODELO ('I'biza, 'C'ordoba, 'T'oledo)
    // COLOR ('Y'ellow, 'W'hite, 'Red')
    // -------------------------------
    //         | Yellow | White | Red |
    // -------------------------------
    // Ibiza   |   SI   |  SI   |  SI |
    // -------------------------------
    // Cordoba |   NO   |  SI   |  NO |
    // -------------------------------
    // Toledo  |   NO   |  SI   |  SI |
    // -------------------------------
    public static void main(String[]args){

            char MODELO=' ', COLOR=' ';
        /*
            Posibles datos para probar
            char MODELO=' ', COLOR=' ';
            char MODELO=' ', COLOR='Y';
            char MODELO='I', COLOR=' ';
            char MODELO='I', COLOR='Y';
            char MODELO='I', COLOR='W';
            char MODELO='I', COLOR='R';
            char MODELO='C', COLOR='Y';
            char MODELO='C', COLOR='W';
            char MODELO='C', COLOR='R';
            char MODELO='T', COLOR='Y';
            char MODELO='T', COLOR='W';
            char MODELO='T', COLOR='R';
        */

        boolean ENABLED = false;
        if (((MODELO == 'I' || MODELO == 'C' || MODELO == 'T')) &&
            ((COLOR == 'Y' || COLOR == 'W' || COLOR == 'R'))) {
            //         | Yellow | White | Red |
            // Cordoba |   NO   |  SI   |  NO |
            // Toledo  |   NO   |  SI   |  SI |
            if (((MODELO == 'C') && (COLOR == 'Y' || COLOR == 'R')) || 
                ((MODELO == 'T') && (COLOR == 'Y'))) {
                  ENABLED = false;
                } else 
                  ENABLED = true;
        }

        if (ENABLED)
            System.out.println ("Disponible: " + "Modelo: " +  MODELO + " " + "Color: " + COLOR);
        else
            System.out.println ("Opción NO DISPONIBLE: " + "Modelo: " + MODELO + " " + "Color: " + COLOR);
    }
}