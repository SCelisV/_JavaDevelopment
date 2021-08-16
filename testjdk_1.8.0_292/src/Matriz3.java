public class Matriz3{
    // Permite pasar como parámetro una matriz bidimensional a los métodos Imprimir y EntreNotas.
    // final NUM_ALUMNOS para dimensionar el tamaño de la matriz bidimensional.

    //Nombres[], Notas[]
    public static void Imprimir(String [][] Alumnos){
        // Recibe una matriz Bidimensional de tipo String
        
        for (int i=0; i < Alumnos[0].length; i++){
            // Imprime los Alumnos y las Notas
            System.out.println(i + ". " + Alumnos[0][i] + ": " + Alumnos[1][i]);
        }
    }

    public static byte EntreNotas(float Nota1, float Nota2, String [][] Alumnos){
        // Recibe una matriz Bidimensional de tipo String
        // devuelve la cantidad de Alumnos que se encuentra entre el rango Nota1 y Nota2.
        // Recibe como parámetros la matriz bidimensional de Alumnos,
        // Recibe los valores Nota1 y Nota2 que me van a definir el rango de notas que se debe seleccionar

        byte Contador = 0;

        for(int i=0; i<Alumnos[0].length; i++){
        
            if( (Float.parseFloat(Alumnos[1][i]) >= Nota1) && 
                (Float.parseFloat(Alumnos[1][i]) <= Nota2) ){
                 Contador++;
                 System.out.println(Alumnos[0][i] + ": " + Alumnos[1][i]); //Nombres[], Notas[]
            }
        }
        return (Contador);
    }
        
    
    public static void main(String [] args){
        
        // para dimensionar el tamaño de la matriz bidimensional
        final byte NUM_ALUMNOS = 10;
        
        // Se define la matriz bidimensional de tipo String para almacenar tanto los Nombres como las Notas
        // --O-J-O-- se tiene que hacer parseFloat y toString para las Notas
        // Solo es obligatorio indicar el número de filas.
        // Matriz de Calificaciones = 2filas X 5columnas cada una;
        String [][] Calificaciones = new String[2][NUM_ALUMNOS];
        
        // Inicializa la Matriz de Calificaciones
            
        float [] Notas = {5.8f, 6.2f, 7.1f, 5.9f, 3.6f, 9.9f, 1.2f, 10.0f, 4.6f, 5.0f};
        
        String [] Nombres = new String[10];

        Nombres[0]="Pedro"; Nombres[1]="Ana"; Nombres[2]="Luis";
        Nombres[3]="Luis"; Nombres[4]="Juan"; Nombres[5]="Eva";
        Nombres[6]="Mari"; Nombres[7]="Fran"; Nombres[8]="Luz";
        Nombres[9]="Sol";

        // Inicializa la Matriz de Calificaciones
        for (int i=0; i < NUM_ALUMNOS; i++){
            Calificaciones[0][i] = Nombres[i];
            Calificaciones[1][i] = Float.toString(Notas[i]);
        }
        
        Imprimir (Calificaciones);
        System.out.println("\n");
        
        System.out.println("Total Aprobados: " + EntreNotas(5.0f,10.0f,Calificaciones));
        
        System.out.println("Total Suspensos: " + EntreNotas(0.0f,4.9f,Calificaciones));
        
        System.out.println("Total Matriculas: " + EntreNotas(10.0f,10.0f,Calificaciones));
    }
}