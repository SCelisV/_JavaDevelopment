//Realiza el control de acceso a los almacenes utilizando la clase LogisticaAlmacen
public class LogisticaControl1Contenedor{
    public static void main(String[] args) {
        
        // Creamos los Almacenes con capacidades instanciando la clase LogisticaAlmacen - con el Constructor definido
        LogisticaAlmacen Almacen1 = new LogisticaAlmacen( (byte) 2);
        LogisticaAlmacen Almacen2 = new LogisticaAlmacen( (byte) 4);
        LogisticaAlmacen Almacen3 = new LogisticaAlmacen( (byte) 8);

        String Accion;

        // Bucle infinito que se ejecutará mientras que no se pulse la tecla "Salir";
        do{
            Accion = "m";
            // meter contenedores - "m"
            if ( Accion.equals("m") ){

                if ( Almacen1.hayHueco() )
                    Almacen1.meteContenedor(); // Si hay hueco, se indica al camionero que se dirija al primer almacén y se actualiza el estado del almacen
                else // Si no hay hueco, se prueba con el Almacen2 y asi sucesivamente
                    if ( Almacen2.hayHueco() )
                        Almacen2.meteContenedor();
                    else
                        if ( Almacen3.hayHueco() )
                            Almacen3.meteContenedor();
                        else
                            System.out.println( "Hay que esperar a que vengan a quitar un contenedor" );
            } else { // sacar contenedores - "s"

                if ( Almacen1.hayCapacidad() )
                    Almacen1.sacaContenedor(); // Se hace el mismo tratamiendo para sacar un contenedor del almacén y se actualiza el estado del almanén
                else
                    if ( Almacen2.hayCapacidad() )
                        Almacen2.sacaContenedor();
                    else
                        if ( Almacen3.hayCapacidad() )
                            Almacen3.sacaContenedor();
                        else 
                            System.out.println( "Hay que esperar a que vengan a poner un contenedor" );
            }

        } while ( !Accion.equals( "Salir" )); // 
    }
}