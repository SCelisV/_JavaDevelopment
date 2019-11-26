public class Matriz2{

    public static void Imprimir(String[] Nombres){

        for (int i = 0; i < Nombres.length ; i++){
            int j = i + 1;
            System.out.println(j + ". " + Nombres[i]);
        }

    }

    public static byte EntreNotas(float Nota1, float Nota2, float[] Notas){

        byte Contador = 0;

        for(int i=1; i < Notas.length ; i++){
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

        Imprimir(Nombres);

        System.out.println("Aprobados: " + (EntreNotas(5.0f, 10.0f, Notas)));

        System.out.println("Suspensos: " + (EntreNotas(0.0f, 4.9f, Notas)));

        System.out.println("Matriculas: " + (EntreNotas(10.0f, 10.0f, Notas)));

    }
}