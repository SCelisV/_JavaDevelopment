public class Logistica{
    // Comprar o alquilar en el centro de la ciudad resulta costoso
    // Cuanto más nos alejamos del centro más aumentan los gastos de distribución
    // Estrategia:
    // 1. Alquilar un almacén pequeño en el centro de la ciudad(Almacenar 200 unidades en promedio)
    // 2. Alquilar almacenes en anillos concéntricos de 5km a partir del centro de la ciudad,
    //    cada almacén podrá contener un stock del doble de electrodomésticos que el almacén anterior, 
    //    es decir, de 400 a 5km, de 800 a 10km, de 1600 15km
    //  A cuantos kilometros se encontrará el último almacén en una ciudad que requiere 
    //  una capacidad total de 100000 electrodomesticos en stock
    public static void main(String[]args){
        int CapacidadAlmacen = 200;
        int CapacidadTotal = 100000;
        // con un FOR
        for (int i=5; CapacidadAlmacen <= CapacidadTotal; i=i+5){
            CapacidadAlmacen = CapacidadAlmacen * 2;
            System.out.println("\nDistancia: " + i + " km " + "Capacidad Almacen: " + CapacidadAlmacen + " unidades");
        }

        /* con un WHILE
        int i = 5;
        while(CapacidadAlmacen <= CapacidadTotal){
            CapacidadAlmacen = CapacidadAlmacen * 2;
            System.out.println("\nDistancia: " + i + " km " + "Capacidad Almacen: " + CapacidadAlmacen + " unidades");
            i = i + 5;
        }*/
    }
}