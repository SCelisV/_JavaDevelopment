// declaración e inicialización
// int miMatriz [][] = {{2,5,3},{3,6,9},{0,8,9}};
// declaración
// int miMatriz [][] = new int[3][3];
// se inicializa
//llenar la primera fila
// miMatriz[0][0]=5;
// miMatriz[0][1]=8;
// miMatriz[0][2]=1;
//llenar la segunda fila
// miMatriz[1][0]=9;
// miMatriz[1][1]=7;
// miMatriz[1][2]=2;
//llenar la tercera fila
// miMatriz[2][0]=10;
// miMatriz[2][1]=15;
// miMatriz[2][2]=25;
// Acceder a los elementos de una matriz
// tipo_dato variable= nombre_matriz [pos_fila][pos_columna] ;
// int var=miMatriz[0][2];

import java.util.Scanner;

public class TestArrayList {
	public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        // // for para manejar las filas
		// for (int i = 0; i < miMatriz.length; i++) {
        //     // for para manejar las columnas
		// 	for (int j = 0; j < miMatriz.length; j++) {
		// 		System.out.print("Ingrese un elemento: ");
		// 		miMatriz[i][j]=entrada.nextInt();
		// 	}
        // }
        // //
        // for (int i = 0; i < miMatriz.length; i++) {
		// 	for (int j = 0; j < miMatriz.length; j++) {
		// 		System.out.print(String.format(" %d ",miMatriz[i][j]));
		// 	}
		// 	System.out.println();
		// }
        // //
        
        int matriz[][] = new int[3][3];
 
		Scanner entrada = new Scanner(System.in);
		float sumaFila = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Ingrese el número en la fila " + (i)
						+ " columna " + j + " :");
				matriz[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
				System.out.print(String.format(" %d ", matriz[i][j]));
			}
			System.out.print(String.format(
					" Suma fila: %f, promedio fila: %f ", sumaFila, sumaFila
							/ matriz.length));
			System.out.println();
        }
    }
}