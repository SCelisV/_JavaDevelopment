public class Semaforo{
    // private no es accesible directamente desde el exterior de la clase
    private String EstadoSemaforo = "Rojo";

    // public son accesibles directamente desde el exterior de la clase
    public void PonColor (String Color){
        EstadoSemaforo = Color;
    }

    public String DimeColor(){
        return EstadoSemaforo;
    }
    
}