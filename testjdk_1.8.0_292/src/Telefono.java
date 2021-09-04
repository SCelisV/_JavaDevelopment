public class Telefono{
    // Entero que guarda el número de llamadas que el teléfono almacena
    private int Max_Llamadas;

    // Matriz líneal verctor que guarda los teléfonos marcados
    private String[] LlamadasHechas;

    private int NumLlamadaHecha = -1;

    // Constructor que permite definir el número de llamadas que almacena el teléfono
    Telefono(int Max_Llamadas){

        // this.Propiedad ser refiere a la Propiedad de la clase (this)
        // hace referencia a la propiedad private int Max_Llamadas de la clase Telefono
        // Max_Llamadas hace referencia al parámetro del constructor.
        this.Max_Llamadas = Max_Llamadas;

        // Instancia e Inicializa la Matriz lineal.
        LlamadasHechas = new String[ Max_Llamadas ];
    }

    // Realiza una llamada y guarda el número marcado en la matriz LlamadasHechas
    // se rellena la matriz en forma de buffer circular (se consigue con %), 
    // esto es, si por ejemplo Max_Llamadas = 4
    // almacenamos: 
    // LlamadasHechas[0],LlamadasHechas[1],LlamadasHechas[2],LlamadasHechas[3], LlamadasHechas[0],..,
    // LlamadasHechas[1],LlamadasHechas[2],LlamadasHechas[3],
    public void Llamar(String Numero){
        // NumLLamadaHecha, es un apuntador a la posición de la matriz que contiene 
        // el número de teléfono correspondiente a la última llamada realizada.
        NumLlamadaHecha = (NumLlamadaHecha+1) % Max_Llamadas;
        LlamadasHechas[ NumLlamadaHecha ] = Numero;
    }
    // Devuelve el último número de teléfono llamado
    // podemos prescindir de este método sin disminuir las pasibilidades que ofrece la clase
    public String UltimaLlamada(){
        return Llamada(0);
    }
    // Devuelve el número de teléfono al que llamamos en último lugar, (n=0), penúltimo , (n=1), etc
    public String Llamada( int n ){
        if( n <= NumLlamadaHecha )
            return LlamadasHechas[ NumLlamadaHecha - n ];
        else
            return LlamadasHechas[ Max_Llamadas - ( n - NumLlamadaHecha) ];
    }

}