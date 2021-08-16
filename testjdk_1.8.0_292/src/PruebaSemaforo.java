public class PruebaSemaforo{
    
    public static void main (String [] args){
        
        // Se declaran e instancian las variables 
        // Por defecto toma los valores definidos en la clase
        // En este caso todas serán "Rojo"
        Semaforo MiSemaforo = new Semaforo();
        Semaforo SemaforoDeMiCalle = new Semaforo();
        Semaforo OtroSemaforo = new Semaforo();

        System.out.println( "MiSemaforo: " + MiSemaforo.DimeColor() );
        System.out.println( "SemaforoDeMiCalle: " + SemaforoDeMiCalle.DimeColor() );
        System.out.println( "OtroSemaforo: " + OtroSemaforo.DimeColor() );

        // Modifico la propiedad EstadoSemaforo de mis Instancias MiSemaforo y OtroSemaforo (por medio de los métodos por ser private)
        // Invoco el método PonColor de la clase Semaforo con el argumento de tipo String "Rojo" y "Verde" respectivamente
        // Estos argumentos pasan como parámetros al método de la Clase Semaforo y de ahí a la propiedad de la Clase Semaforo
        MiSemaforo.PonColor("Rojo");
        OtroSemaforo.PonColor("Verde");
        
        // Invoco el método DimeColor de la clase Semaforo
        // El valor de la propiedad de la Clase se devuelve a la instrucción Llamante (return) de la Clase Semaforo
        System.out.println( "OtroSemaforo: " + OtroSemaforo.DimeColor() );
        System.out.println( "SemaforoDeMiCalle: " + SemaforoDeMiCalle.DimeColor() );

        // Hago una validación del color de uno de los semaforos
        if( MiSemaforo.DimeColor().equals( "Rojo" ))
            System.out.println( "No Pasar");

    }
    
}