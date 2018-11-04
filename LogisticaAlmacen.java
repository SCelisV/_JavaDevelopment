// Permite la creación de una estructura de datos almacén y sus métodos de accesos.

public class LogisticaAlmacen{

    // El programa automáticamente le indica a los camioneros el almacén al que deben dirigirse minimizando los costos de combustible y tiempo.
    // m -- meter un contenedor
    // s -- sacar un contenedor

    // Utilizamos dos clases LogisticaAlmacen y LogisticaControl1Contenedor

    // Estado del almacén - byte, porque la capacidad máxima del almacén es de 256
    private byte Capacidad;
    private byte NumeroDeHuecos;

    // Constructor que permite definir la capacidad del almacén.
    LogisticaAlmacen (byte Capacidad){
        this.Capacidad = Capacidad; // Esta es la Capacidad de la clase
        NumeroDeHuecos = Capacidad; // Hay tantos huecos vacios como la Capacidad del almacén
    }
    
    // Devuelve los valores de la propiedad NumeroDeHuecos
    public byte DimeNumeroDeHuecos(){
        return ( NumeroDeHuecos );
    }
    
    // Devuelve los valores de la propiedad Capacidad
    public byte DimeCapacidad(){
        return( Capacidad );
    }

    // Nos indica si tenemos la posibilidad de meter un elemento en el almacén
    public boolean HayHueco(){
        return ( NumeroDeHuecos != 0 );
    }
    
    // Nos indica si existe al menos un elemento en el almacén, es decir, no hay tantos huecos como capacidad
    public boolean HayContenedor(){
        return ( NumeroDeHuecos != Capacidad );
    }

    // Actualiza el valor de la propiedad NumerodeHuecos
    public void MeteContenedor(){
        NumeroDeHuecos--;
    }
    // Actualiza el valor de la propiedad NumerodeHuecos
    public void SacaContenedor(){
        NumeroDeHuecos++;
    }
}