public class Puerta{
    // Puesto que cada aparcamiento que gestiona la empresa puesde tener un número diferente de accesos,
    // esta clase además del constructor, tiene unicamente dos métodos  Entra y Sale vehiculo
    Almacen Parking = null;

    Puerta( Almacen Parking ){
        this.Parking = Parking;
    }

    public void EntraVehiculo(){
        if ( Parking.HayHueco() ){
            System.out.println("Puede entrar ");
            // Abre la barrera
            Parking.MeteElemento();
        } else
            System.out.println("Aparcamiento completo");
    }
    
    public void SaleVehiculo(){
        // Comprobar el pago
        System.out.println(" Puede Salir");
        // Abrir la barrera
        Parking.SacaElemento();
    }
}