public class PruebaSemaforo{
    
    public static void main (String [] args){
        
        // Se declaran e instancian las variables 
        Semaforo MiSemaforo = new Semaforo();
        Semaforo SemaforoDeMiCalle = new Semaforo();
        Semaforo OtroSemaforo = new Semaforo();

        MiSemaforo.PonColor("Rojo");
        OtroSemaforo.PonColor("Verde");
        
        System.out.println( OtroSemaforo.DimeColor() );
        System.out.println( SemaforoDeMiCalle.DimeColor() );

        if( MiSemaforo.DimeColor().equals( "Rojo" ))
            System.out.println( "No Pasar");

    }
    
}