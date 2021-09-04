/*
    La clave buscada la definimos en la línea  return (Clave.equals("0123"));
    Existe un bucle por cada carácter que forma la clave
    dependiendo de la clave buscada, si eliminamos alguna de estas líneas: Car1++; Car2++; Car3++; 
    el programa dejará de funcionar.
*/

public class RevientaClaves{

    //Compara la Clave calculada con una clave prefijada
    static boolean Permiso(String Clave){
        return (Clave.equals("0123"));
        // return (Clave.equals("<01>"));
    }


    public static void main (String [] args){

        String Clave = "";
        char Car1 = '0', Car2 = '0', Car3 = '0', Car4 = '0'; //Inicializamos cuatro variables de los cuatro caracteres que consta la Clave
        boolean Encontrada = false; //finalizará las iteraciones cuando se encuentre la clave

        do{

            do{

                do{

                    do{
                        
                        Clave = "" + Car1 + Car2 + Car3 + Car4;
                        System.out.println("Evaluando clave: *" + Clave + "*");
                        if( Permiso(Clave) ){
                            System.out.println("Permiso concedido");
                            Encontrada = true;
                        }
                        Car4++; //cada caracter va aumentando en cada iteración

                    }while( Car4 != 'z' && !Encontrada );

                    Car4 = '0'; //inicializa el caracter del bucle inferior
                    Car3++; //cada caracter va aumentando en cada iteración

                }while( Car3 != 'z' && !Encontrada );

                Car3 = '0'; //inicializa el caracter del bucle inferior
                Car2++; //cada caracter va aumentando en cada iteración

            }while( Car2 != 'z' && !Encontrada );

            Car2 = '0'; //inicializa el caracter del bucle inferior
            Car1++; //cada caracter va aumentando en cada iteración

        }while ( Car1 != 'z' && !Encontrada ); //finalizará las iteraciones cuando se encuentre la clave

    }
}