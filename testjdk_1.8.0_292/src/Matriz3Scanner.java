import java.util.Scanner;

public class Matriz3Scanner{
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
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("De cuantos alumnos vas a procesar Notas?: ");
            final byte NUM_ALUMNOS = sc.nextByte();

            // Se define la matriz bidimensional de tipo String para almacenar tanto los Nombres como las Notas
            // --O-J-O-- se tiene que hacer parseFloat y toString para las Notas
            // Solo es obligatorio indicar el número de filas.
            // Matriz de Calificaciones = 2filas X 5columnas
            // 1 fila String Nombres[]
            /*
            Nombres[0]="Pedro"; Nombres[1]="Ana"; Nombres[2]="Luis"; Nombres[3]="Luis"; Nombres[4]="Juan"; Nombres[5]="Eva";
            Nombres[6]="Mari"; Nombres[7]="Fran"; Nombres[8]="Luz"; Nombres[9]="Sol";
            */   
            // 2 fila float Notas[]
            // 5.8f, 6.2f, 7.1f, 5.9f, 3.6f, 9.9f, 1.2f, 10.0f, 4.6f, 5.0f;
            String[][] Calificaciones = new String[2][NUM_ALUMNOS];
            // Inicializa la lista de Nombres
            String [] Nombres = new String[NUM_ALUMNOS];
            // Inicializa la Matriz de Notas
            float [] Notas = new float[NUM_ALUMNOS]; 
            int i=0;
            for(i=0; i<NUM_ALUMNOS; i++){

                try {
                    System.out.println("Nombre alumno: ");
                    Nombres[i] = sc.next();
                    try {
                        System.out.println("Nota alumno: ");
                        Notas[i] = sc.nextFloat();
                    } catch (Exception e) {
                        Nombres[i] = null;
                    }
                } catch (Exception e) {
                        Notas[i] = 0.0f;
                }
            }
            sc.close();

             // Inicializa la Matriz de Calificaciones
             for (int j=0; j < NUM_ALUMNOS; j++){
                Calificaciones[0][j] = Nombres[j];
                Calificaciones[1][j] = Float.toString(Notas[j]);
            }
            
            Imprimir (Calificaciones);
            System.out.println("\n");
            
            System.out.println("Total Aprobados: " + EntreNotas(5.0f,10.0f,Calificaciones));
            
            System.out.println("Total Suspensos: " + EntreNotas(0.0f,4.9f,Calificaciones));
            
            System.out.println("Total Matriculas: " + EntreNotas(10.0f,10.0f,Calificaciones));
        } catch (Exception e) {
            System.out.println("catch alumnos");
        }

    }
}