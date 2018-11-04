public class Almacen{
    // Se pide ralizar el diseño de un software orientado a objetos que controle los aparcamientos
    // No consideraremos peticiones de entrada-salida simultáneas (concurrentes)

    private short Capacidad;
    private short NumeroDeElementos = 0;

    // Cada aparcamiento dispone de un número fijado de plazas y también de puertas de entrada / salida de vehículos
    // Definimos el constructor de la clase, nos permitirá definir la capacidad máxima de un Almacén
    Almacen( short Capadidad ){
        this.Capacidad = Capacidad;
    }

    public short DimeNumeroDeElementos(){
        return ( NumeroDeElementos );
    }

    public short DimeCapacidad(){
        return ( Capacidad );
    }

    public boolean HayElemento(){
        return ( NumeroDeElementos != 0 );
    }

    public boolean HayHueco(){
        return( NumeroDeElementos != Capacidad );
    }

    public void MeteElemento(){
        NumeroDeElementos ++;
    }

    public void SacaElemento(){
        NumeroDeElementos --;
    }
    
    public void RellenAlmacen(){
        NumeroDeElementos = Capacidad;
    }
}