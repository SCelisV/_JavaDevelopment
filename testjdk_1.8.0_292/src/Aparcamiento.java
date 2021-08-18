public class Aparcamiento{
    // Recoge las peticiones de entrada / salida de los usuarios por cada una de las puertas.
    public static void main(String[] args) {

        char CPuerta, COperacion;
        Puerta PuertaRequerida = null;

        // Aparcamiento sobre el que se realiza la prueba de funcionamiento
        Almacen Aparcamiento = new Almacen( ( short ) 5); 
        
        // Este Aparcamiento tiene dos puertas de acceso, a las cuales se les pasa como argumento el mismo Aparcamiento, 
        // Así las entradas y salidas de los vehiculos se contabilizan en la propiedad NumeroDeElementos de una sola clase Almacen
        Puerta Puerta1 = new Puerta ( Aparcamiento );
        Puerta Puerta2 = new Puerta ( Aparcamiento );

        // bucle sin fin, para que seleccione el número de la puerta del aparcamiento por donde entran o salen los vehiculos.
        do {

            // CPuerta = IntroduceCaracter ( "Puerta de acceso: (1, 2): "); - para usar con Teclado.Lee_String();
            CPuerta = '1';

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

            // COperacion = IntroduceCaracter( "Entrar / Salir vehiculo (e, s): "); - para usar con Teclado.Lee_String();
            COperacion = 'e';

            switch( COperacion ){
                case 'e':
                    PuertaRequerida.entraVehiculo();
                    break;
                case 's':
                    PuertaRequerida.saleVehiculo();
                    break;
                default:
                    System.out.println ("Operación seleccionada no valida");
                    break;
            }

        } while( true );
    } // main

    // Introducir el número de puerta por donde desea entrar o salir un usuario
    /*
    static public char IntroduceCaracter ( String Mensaje ){

        String Entrada;
        System.out.println( Mensaje );
        Entrada = Teclado.Lee_String();
        System.out.println();
        Entrada = Entrada.toLowerCase();
        return Entrada.charAt (0);
    }
    */
}