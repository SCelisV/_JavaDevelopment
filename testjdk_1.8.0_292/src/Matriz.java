public class Matriz{

    // tipo[] Variable; declara una matriz de variables del tipo indicado
    // float[] Notas;

    // tipo Variable[]; otra alternativa para declarar la misma matriz de variables
    // float Notas[];

    // declara y define una matriz de "Elementos" elementos y tipo "tipo"
    // empiza en el elemento 0
    // tipo[] Variable = new tipo [Elementos];
    // float[] Notas = new float[1000];

    // tipo[] [] [] .. Variable = 
    // new tipo[ElementsDim][ElementosDim2]...[ElementosDim3]...; Matriz multidimensional

    // Se define la matriz Temperaturas
    // float [] Temperaturas;
    // empiza en el elemento 0
    // Se inicializa la matriz de 12 elementos de tipo float.
    // Temperaturas  = new float [12]; 
    
    // Temperaturas de los 12 meses del año
    // float[] Temperaturas1 = new float [12]; 
    
    // Temperaturas de cada día en los 12 meses del año
    // float[] Temperaturas2 = new float [12][31]; 
    
    public static float[] TemperaturasMadrid = {3.4f, 5.6f, 17.5f, 19.2f, 21.0f, 25.6f, 35.3f, 39.5f, 25.2f, 10.0f, 5.7f, 4.6f};
    
    public static String[] Nombres = {"Pinta", "Niña", "Santamaria"};

//matriz unidimensional de String donde se colocan los posibles parámetros que deseamos pasar al invocar el programa
 
public static void main (String [] args) {
        // Temperatura de Febrero
        TemperaturasMadrid[1] = 7.5f;

        // Temperaturas de Enero y de Diciembre
        TemperaturasMadrid[0] = 5.3f;
        TemperaturasMadrid[11] = 6.5f;

        // Temperatura media de los meses de invierno        
        float MediaInvierno = ((TemperaturasMadrid[0]+TemperaturasMadrid[1]+TemperaturasMadrid[11])/3);

        System.out.println("MediaInvierno: " + MediaInvierno);
        
        for (int i=0; i < TemperaturasMadrid.length; i++){
            
            System.out.println("TemperaturasMadrid: " + i + ": " + TemperaturasMadrid[i]);

        }
    }
}