// Se dispone de 3 almacenes de contenedores
// primer almacen para 2 contenedores, cerca de una via principal
// segundo almacen para 4 contenedores, a 10km de la via principal
// tercer almacen para 8 contenedores, a 20km de la via principal
// Los camioneros pueden transportar solamente un contenedor
// m -> meter contenedor
// s --> sacar contenedor
// El programa debe Indicar cual es el almacen 1, 2, 3 más adecuado para cargar o descargar 
// y evitar desplazamientos INnecesarios

public class LogisticaAlmacen {

    // Estado del almacén - byte - el almacén más grande es: el tercer almacen para 8 contenedores
    private byte Capacidad;
    private byte NumeroDeHuecos;

    // --- Constructores --
    // Constructor vacio
    LogisticaAlmacen(){}

    // Constructor para inicializar los almacenes
    LogisticaAlmacen(byte capacidad){
        setCapacidad(capacidad);
    }

    // --- setters
    // Set establecer la capacidad inicial del almacen
    // y el número de huecos inicial para el almacen
    // Hay tantos huecos vacios como la Capacidad del almacén
    public void setCapacidad(byte capacidad){
        this.Capacidad = capacidad;
        NumeroDeHuecos = capacidad;
    }

    // --- getters
    // recupera la Capacidad del almacén
    public byte getCapacidad(){
        return (Capacidad);
    }
    // recupera el Numero De Huecos del almacén
    public byte getNumeroDeHuecos(){
        return (NumeroDeHuecos);
    }

    // -- Return true si Hay Capacidad
    public boolean hayCapacidad(){
        return (NumeroDeHuecos != Capacidad);
    }
    // -- Return true si Hay hueco (NumeroDeHuecos !=0)
    public boolean hayHueco(){
        return (NumeroDeHuecos != 0);
    }

    // -- Si se mete un contenedor disminuye la cantidad de huecos 
    public void meteContenedor(){
        NumeroDeHuecos--;
    }

    // -- Si se saca un contenedor aumenta la cantidad de huecos 
    public void sacaContenedor(){
        NumeroDeHuecos++;
    }

    
}
