public class Semaforo{

    // private NO es accesible directamente desde el exterior de la clase
    // para acceder a ella debemos utilizar los métodos
    // String Luz = SemaforoDeMiCalle.DimeColor();
    // Si fuera public podemos acceder a ella:
    // String Luz = SemaforoDeMiCalle.EstadoSemaforo; 
    private String EstadoSemaforo = "Rojo";

    // Los métodos me permiten acceder al estado de las propiedades
    // public son accesibles directamente desde el exterior de la clase
    public void PonColor (String Color){
        EstadoSemaforo = Color;
    }

    // Los métodos me permiten acceder al estado de las propiedades
    // public son accesibles directamente desde el exterior de la clase
    public String DimeColor(){
        return EstadoSemaforo;
    }
    
}
