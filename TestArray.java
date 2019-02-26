// declaración e inicialización
// int[] miArreglo= new int[6];
// declaración
// tipo_dato[] nombre_variable;
// se inicializa
// nombre_variable = new tipo_dato[dimension];
// asignar en la posición 1 del vector, el elemento 7
// mi miArreglo[1]=7;
// obteniendo el elemento de la posición 3 y almacenarlo en una variable de tipo entero
// int valor = miArreglo[3];

import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float promedio = 0;
		float suma = 0;
		int mayor = 0;
		int menor = 0;

		int[] miArreglo = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número en la posición " + (i) + " :");
			miArreglo[i] = entrada.nextInt();
		}
		// realizar la suma, promedio y el mayor
		for (int i = 0; i < miArreglo.length; i++) {
			suma += miArreglo[i];			
			if (mayor < miArreglo[i]) {
				mayor = miArreglo[i];
			}
			System.out.println(String.format("Posición [%d] Elemento: %d", i,
					miArreglo[i]));
		}
		menor = mayor;
		// buscar el menor
		for (int i = 0; i < miArreglo.length; i++) {
			if (menor > miArreglo[i]) {
				menor = miArreglo[i];
			}
		}
                //promedio
                promedio = suma / miArreglo.length;
		System.out.println("***Salida***");
		// contar las veces que se repite cada número
		int cont;
		for (int i = 0; i < miArreglo.length; i++) {
			cont = 0;
			for (int j = i; j < miArreglo.length; j++) {
				if (miArreglo[i] == miArreglo[j]) {
					cont++;
				}
			}
			System.out.println(String.format("El número %d se repite %d veces",
					miArreglo[i], cont));
		}
		System.out
				.println(String
						.format("La suma es %.2f, el promedio es %.2f, el mayor es %d, el menor es %d",
								suma, promedio, mayor, menor));
	}

}