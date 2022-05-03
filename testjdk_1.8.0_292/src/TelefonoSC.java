// Se implementa el contro que puede tener un teléfono 
// para mantener las últimas llamadas realizadas y 
// para poder acceder a las mismas
import java.lang.String;
public class TelefonoSC {

    // máximo número de llamadas
    private int numMaxLLamadas = 5;

    // almacena las llamadas 
    private int[] ultimasLLamadas;

    // almacena el número de teléfono al que ha llamado 
    private String numTel;

    // Constructor vacio -- O_O my godness algo falla en PruebaTelefonoSC.java
    TelefonoSC(){
        ultimasLLamadas = new int[numMaxLLamadas];

    }
    
    // Constructor para crear un teléfono
    // con la propiedad private int numMaxLLamadas;
    TelefonoSC(int numMaxLL){
        setMaxLLamadas(numMaxLL);
    }

    // Constructor para crear un teléfono
    // con la propiedad private int numMaxLLamadas;
    // con la propiedad private int[] ultLL;
    TelefonoSC(int numMaxLL, int[] ultLL){
        setMaxLLamadas(numMaxLL);
        setUltLLamadas(ultLL);
    }

    // Establece SET el valor de la propiedad de la clase 
    // private int numMaxLLamadas;
    public void setMaxLLamadas(int numMaxLL){
        numMaxLLamadas = numMaxLL;
    }

    // GET retorna el valor de la propiedad     
    // private int numMaxLLamadas;
    public int getMaxLLamadas(){
        return numMaxLLamadas;
    }

    // Establece SET el valor de la propiedad de la clase 
    // private int[] ultimasLLamadas;
    public void setUltLLamadas(int[] ultLL){
        for (int i=0; i<ultLL.length; i++){
            this.ultimasLLamadas[i] = ultLL[i];
        }
    }

    // GET retorna el valor da la propiedad 
    // private int[] ultimasLLamadas;
    public int[] getUltLLamadas(){
        return ultimasLLamadas;
    }

    // SET el valor de la propiedad de la clase 
    // private String numTel
    public int setHacerLLamada(String numTel){
        // private int numMaxLLamadas;
        int i; 
        for (i = 0; i < this.ultimasLLamadas.length; i++){
            if (this.ultimasLLamadas[i] == 0){

                System.out.println("i: " + i);
                break;
            }
        }
        return i;

    }
        

}