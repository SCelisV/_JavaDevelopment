import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java


public class Matriz3{

    //Nombres[], Notas[]
    public static void Imprimir(String [][] Alumnos){
        
        for (int i=0; i < Alumnos[0].length; i++){
            int j=i+1;
            System.out.println(j + ". " + Alumnos[0][i] + ": " + Alumnos[1][i]);
        }

    }

    public static byte EntreNotas(float Nota1, float Nota2, String [][] Alumnos){

        byte Contador = 0;

        for(int i=0; i<Alumnos[0].length; i++){
        
            if( (Float.parseFloat(Alumnos[1][i]) >= Nota1) && 
                (Float.parseFloat(Alumnos[1][i]) <= Nota2) ){
                 Contador++;
                 System.out.println(Alumnos[0][i] + ": " + Alumnos[1][i]); //Nombres[], Notas[]
            }
                
        }
        //Después de la ejecución del método se esta imprimiendo la variable Contador, pero no sé porque???
        return (Contador);
    }
        
    
    public static String Lee_String(Scanner Cadena){
        
        String entradaString = Cadena.nextLine();
        
        return (entradaString);
    }
    
    public static float Lee_Float(Scanner Fnumber){
        
        float entradaFloat = Fnumber.nextFloat();
        
        return(entradaFloat);
    }
    
    
    
    public static void main(String [] args){
        
        final byte NUM_ALUMNOS = 5;
        
        //Solo es obligatorio indicar el número de filas.
        //Matriz de Calificaciones = 2filas X 5columnas cada una;
        String [][] Calificaciones = new String[2][NUM_ALUMNOS];
        
        // Inicializa la Matriz de Calificaciones
        
        for (int i=0; i < NUM_ALUMNOS; i++){
            
            Scanner entradaNombres = new Scanner(System.in);
            System.out.println("Digite el Nombre del Alumno: ");
            Calificaciones[0][i] = Lee_String(entradaNombres);
            
            Scanner entradaNota = new Scanner(System.in);
            System.out.println("Digite la Nota del Alumno (Use , para los decimales): ");
            Calificaciones[1][i] = Float.toString(Lee_Float(entradaNota));
            
        }
        
        Imprimir (Calificaciones);
        System.out.println("\n");
        
        System.out.println("Aprobados: ");
        System.out.println(EntreNotas(5.0f,10.0f,Calificaciones));
        
        System.out.println("Suspensos: ");
        System.out.println(EntreNotas(0.0f,4.9f,Calificaciones));
        
        System.out.println("Matriculas: ");
        System.out.println(EntreNotas(10.0f,10.0f,Calificaciones));
    }
}