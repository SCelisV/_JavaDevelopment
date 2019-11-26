public class Telefono{
    // Entero que guarda el número de llamadas que el teléfono almacena
    private int Max_Llamadas;
    // Matriz líneal que guarda los teléfonos marcados
    private String[] LlamadasHechas;

    private int NumLlamadaHecha = -1;

    // Constructor que permite definir el número de llamadas que almacena el teléfono
    Telefono(int Max_Llamadas){
        // this.Propiedad de la clase (this) = Max_llamadas del constructor 
        this.Max_Llamadas = Max_Llamadas;
        // Instancia e Inicializa la Matriz lineal.
        LlamadasHechas = new String[ Max_Llamadas ];
    }
    // Realiza una llamada y guarda el número marcado en la matriz LlamadasHechas
    public void Llamar(String Numero){
        NumLlamadaHecha = (NumLlamadaHecha+1) % Max_Llamadas;
        LlamadasHechas[ NumLlamadaHecha] = Numero;
    }
    // Devuelve el último número de teléfono llamado
    public String UltimaLlamada(){
        return Llamada(0);
    }
    // Devuelve el número de teléfono al que llamamos en último lugar, (n=0), penúltimo lugar, (n=1), etc
    public String Llamada( int n){
        if( n <= NumLlamadaHecha )
            return LlamadasHechas[ NumLlamadaHecha - n ];
        else
            return LlamadasHechas[ Max_Llamadas - ( n - NumLlamadaHecha) ];
    }

}