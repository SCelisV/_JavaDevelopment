public class Almacen{
    // Se pide realizar el diseño de un software orientado a objetos que controle los aparcamientos
    // Entrada y Salida de vehiculoa en diferentes aparcamientos.
    // No consideraremos peticiones de entrada-salida simultáneas (concurrentes)
    // La clase Puerta.java utilizará dos métodos que se apoyan en las facilidades de esta clase (Almacen) para el tratamiento de I/O
    // No nos interesa tener que implementar una clase Puerta.java para cada aparcamiento.
    // La clase Aparcamiento.java recoge las peticiones de entrada / salida de los usuarios por cada una de las puertas.

    private short Capacidad;
    private short NumeroDeElementos = 0;

    // Cada aparcamiento dispone de un número fijado de plazas y también de puertas de entrada / salida de vehículos
    // Definimos el constructor de la clase, nos permitirá definir la capacidad máxima de un Almacén
    
    // ----- Constructores
    Almacen( short capacidad ){
        this.Capacidad = capacidad;
    }

    // -- getters 
    public short getNumeroDeElementos(){
        return ( NumeroDeElementos );
    }

    public short getCapacidad(){
        return ( Capacidad );
    }

    // Controlar que puedan entrar vehiculos
    public boolean hayElemento(){
        return ( NumeroDeElementos != 0 );
    }

    // Hay plazas disponibles para los vehiculos
    public boolean hayHueco(){
        return( NumeroDeElementos != Capacidad );
    }

    // -- actualiza la cantidad de elementos
    // -- Si se mete un elemento -- disminuye la cantidad de huecos 
    public void meteElemento(){
        NumeroDeElementos ++;
    }

    // -- actualiza la cantidad de elementos - 
    // -- Si se saca un elemento -- aumenta la cantidad de huecos 
    public void sacaElemento(){
        NumeroDeElementos --;
    }
    
    public void rellenAlmacen(){
        NumeroDeElementos = Capacidad;
    }
}