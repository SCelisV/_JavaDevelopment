/*
Otra forma de implementar 

*/

import java.util.Scanner;

public class Matriz3Scanner2 {

    // Permite pasar como parámetro una matriz bidimensional a los métodos Imprimir y EntreNotas.
    // final NUM_ALUMNOS para dimensionar el tamaño de la matriz bidimensional.

    // Método que retorna el String escrito en el teclado
    public static String Lee_String(Scanner scCadena){
        
        String entradaString = scCadena.nextLine();
        return (entradaString);
    }
    
    // Método que retorna el float escrito en el teclado
    public static float Lee_Float(Scanner scFloat){
        
        float entradaFloat = scFloat.nextFloat();
        return(entradaFloat);
    }    
    
    // Imprime la matriz Nombres[], Notas[]
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
    
    public static void main(String[] args){
        
        final byte NUM_ALUMNOS = 5;
        
        //Solo es obligatorio indicar el número de filas.
        //Matriz de Calificaciones = 2filas X 5columnas cada una;
        String [][] Calificaciones = new String[2][NUM_ALUMNOS];
   
        // Inicializa la Matriz de Calificaciones
        
        for (int i=0; i < NUM_ALUMNOS; i++){
            
            // Define el Scanner que leerá los nombres de los alumnos
            try {
                Scanner entradaNombres = new Scanner(System.in);
                System.out.println("Digite el Nombre del Alumno: ");
                // Almacena los nombre leidos por el Scanner fila 0 columna i
                Calificaciones[0][i] = Lee_String(entradaNombres);
                try {
                    // Define el Scanner que leerá las notas de los alumnos
                    Scanner entradaNota = new Scanner(System.in);
                    System.out.println("Digite la Nota del Alumno (Use . para los decimales): ");
                    // Almacena las notas leidas por el Scanner fila 1 columna i
                    Calificaciones[1][i] = Float.toString(Lee_Float(entradaNota));
                    
                } catch (Exception e) {
                    Calificaciones[1][i] = Float.toString(0.0f);
                }
            } catch (Exception e) {
                Calificaciones[0][i] = "";
            }
        }

        Imprimir (Calificaciones);
        System.out.println("\n");
        
        System.out.println("Total Aprobados: " + EntreNotas(5.0f,10.0f,Calificaciones));
        
        System.out.println("Total Suspensos: " + EntreNotas(0.0f,4.9f,Calificaciones));
        
        System.out.println("Total Matriculas: " + EntreNotas(10.0f,10.0f,Calificaciones));


    }
} 


