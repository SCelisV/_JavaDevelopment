public class Switch5{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Switch anidados
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

        switch (MODELO) {
            case 'I':
                switch (COLOR) {
                    case 'Y':
                        ENABLED = true;        
                        break;
                    case 'W':
                        ENABLED = true;        
                        break;
                    case 'R':
                        ENABLED = true;        
                        break;
                    default:
                        break;
                } 
                break;
            case 'C':
                switch (COLOR) {
                    case 'Y':
                        //ENABLED = false;
                        break;
                    case 'W':
                        ENABLED = true;
                        break;
                    case 'R':
                        //ENABLED = false;
                        break;
                    default:
                        break;
                } 
                break;
            case 'T':
                switch (COLOR) {
                    case 'Y':
                        //ENABLED = false; 
                        break;
                    case 'W':
                        ENABLED = true; 
                        break;
                    case 'R':
                        ENABLED = true; 
                        break;
                    default:
                        break;
                } 
                break;
        
            default:
                break;
        }

        if (ENABLED)
            System.out.println ("Disponible: " + "Modelo: " +  MODELO + " " + "Color: " + COLOR);
        else
            System.out.println ("Opción NO DISPONIBLE: " + "Modelo: " + MODELO + " " + "Color: " + COLOR);
    }
}