public class Matriz2{
    // Clase mejorada de Matriz1.java 
    // Se crean los métodos Imprimir, ImprimirNombresyNotas y Entre Notas

    public static void Imprimir(String[] Nombres){
    // El método Imprimir que no devuelve ningún valor. 
    // Recibe como parametros una matriz de tipo String.

        for (int i = 0; i < Nombres.length ; i++){
            // visualiza por consola el contenido de los elementos de la Matriz 
            System.out.println(i + ". " + Nombres[i]);
        }
    }

    public static void ImprimirNombresyNotas(String[] Nombres, float[] Notas){
    // El método Imprimir que no devuelve ningún valor. 
    // Recibe como parametros las dos matrices y las imprime

        for (int i = 0; i < Nombres.length ; i++){
                // visualiza por consola el contenido de los elementos de cada una de las Matrices
                System.out.println(i + " " + Nombres[i] + " " + Notas[i]);
        }
    }

    public static byte EntreNotas(float Nota1, float Nota2, float[] Notas){
    // El método Entre Notas, devuelve la cantidad de Notas que se encuentra entre el rango Nota1 y Nota2.
    // Recibe como parámetro una matriz de Notas 
    // Recibe los valores Nota1 y Nota2 que me van a definir el rango de notas que se debe seleccionar

        byte Contador = 0;

        for(int i=0; i < Notas.length ; i++){
            if ( (Notas[i] >= Nota1) && (Notas[i] <= Nota2) )
                Contador++;
        }

        return Contador;
    }

    public static void main(String [] args){

        float [] Notas = {5.8f, 6.2f, 7.1f, 5.9f, 3.6f, 9.9f, 1.2f, 10.0f, 4.6f, 5.0f};
        
        String [] Nombres = new String[10];

        Nombres[0]="Pedro"; Nombres[1]="Ana"; Nombres[2]="Luis";
        Nombres[3]="Luis"; Nombres[4]="Juan"; Nombres[5]="Eva";
        Nombres[6]="Mari"; Nombres[7]="Fran"; Nombres[8]="Luz";
        Nombres[9]="Sol";

        // LLamo al método Imprimir, pasandole la matriz de Nombres
        Imprimir(Nombres);

        // LLamo al método Imprimir, pasandole la matriz de Nombres
        ImprimirNombresyNotas(Nombres, Notas);

        // Lama al método EntreNotas dandole los rangos que quiere seleccionar 
        System.out.println("Aprobados: " + (EntreNotas(5.0f, 10.0f, Notas)));

        System.out.println("Suspensos: " + (EntreNotas(0.0f, 4.9f, Notas)));

        System.out.println("Matriculas: " + (EntreNotas(10.0f, 10.0f, Notas)));
    }
}