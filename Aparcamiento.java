public class Aparcamiento{
    // Recoge las peticiones de entrada / salida de los usuarios por cada una de las puertas.
    public static void main(String[] args) {

        char CPuerta, COperacion;
        Puerta PuertaRequerida = null;

        // Aparcamiento de Tipo Almacén
        Almacen Aparcamiento = new Almacen( ( short ) 5); 
        
        // Este Aparcamiento tiene dos puertas de acceso, a las cuales se les pasa como argumento el mismo Aparcamiento, 
        // Así las entradas y salidas de los vehiculos se contabilizan en la propiedad NumeroDeElementos de una sola clase Almacen
        Puerta Puerta1 = new Puerta ( Aparcamiento );
        Puerta Puerta2 = new Puerta ( Aparcamiento );


        do {

            CPuerta = IntroduceCaracter ( "Puerta de acceso: (1, 2): ");

            switch( CPuerta ){
                case '1':
                    PuertaRequerida = Puerta1;
                    break;
                case '2':
                    PuertaRequerida = Puerta2;
                    break;
                default:
                    System.out.println ("Puerta seleccionada no valida");
                    break;
            }

            COperacion = IntroduceCaracter( "Entrar / Salir vehiculo (e, s): ");

            switch( COperacion ){
                case 'e':
                    PuertaRequerida.EntraVehiculo();
                    break;
                case 's':
                    PuertaRequerida.SaleVehiculo();
                    break;
                default:
                    System.out.println ("Operación seleccionada no vaalida");
                    break;
            }

        } while( true );
    } // main

    // Introducir el número de puerta por donde desea entrar o salir un usuario
    static public char IntroduceCaracter ( String Mensaje ){
        String Entrada;
        System.out.println( Mensaje );
        Entrada = Teclado.Lee_String();
        System.out.println();
        Entrada = Entrada.toLowerCase();
        return Entrada.charAt (0);
    }
}