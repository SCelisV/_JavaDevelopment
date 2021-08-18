public class Puerta{
    // Puesto que cada aparcamiento que gestiona la empresa puede tener un número diferente de accesos,
    // esta clase además del constructor, tiene unicamente dos métodos  Entra y Sale vehiculo
    // Esta clase tiene que poder actuar sobre cada uno de los diferentes "aparcamientos", (Almacenes de vehiculos).
    // Por eso le pasamos la clase "Almacen" como parámetro a la Clase Puerta

    Almacen Parking = null;

    // ----- Constructores
    // La referencia del almacén suministrado como argumento se copia en la propiedad Parking de la clase Puerta (this.Parking)
    Puerta( Almacen Parking ){
        this.Parking = Parking;
    }

    // Se apoya en las facilidades que provee la clase Almacen para implementar la lógica de tratamiento de la peticiones de I/O
    public void entraVehiculo(){
        // evalua la clase "almacen pasada como parámetro en el constructor
        if ( Parking.hayHueco() ){
            System.out.println("Puede entrar ");
            // Abre la barrera
            // actua sobre la clase "almacen pasada como parámetro en el constructor
            Parking.meteElemento();
        } else
            System.out.println("Aparcamiento completo");
    }
    
    // Se apoya en las facilidades que provee la clase Almacen para implementar la lógica de tratamiento de la peticiones de I/O
    public void saleVehiculo(){
        // Comprobar el pago
        System.out.println(" Puede Salir");
        // Abrir la barrera
        // actua sobre la clase "almacen pasada como parámetro en el constructor
        Parking.sacaElemento();
    }
}