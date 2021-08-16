public class GeneraPrimos{

// Definición de Número Primo:
// Es un Número entero que solamente es divisible por él mismo (positivo y negativo) y por la unidad (positiva y negativa).
// El 2 es un número primo porque solamente es divisible por 2, -2, 1 y -1
// Para saber Si un número es primo no es necesario dividirlo por todos los valores anteriores,
// basta con constatar que no es divisible por ningún número primo menor que su propio valor.

    public static void main (String [] args){

        final int NUM_PRIMOS = 65; //Cantidad de números primos a buscar
        int [] Primos = new int [NUM_PRIMOS]; //Define un array de los n posiciones
        Primos [0] = 2; //Primer Primo
        int PrimosHallados = 1;
        int PosiblePrimo = 3; //Siguiente número a analizar
        int Indice = 0;
        boolean Primo = true;

        do {//Se ejecutará hasta que se han hallado los NUM_PRIMOS buscados
            
            while(Primo && (Indice < PrimosHallados)){//Se ejecuta si PosiblePrimo es divisible por alguno de los numeros primos ya encontrados
                if (PosiblePrimo % Primos[Indice] == 0)//Si el modulo es 0, ya no es primo, por lo que ya no se buscará más  
                    Primo = false;
                else                //entonces tenemos que comprobar el siguiente número de la matriz
                    Indice ++;
            }

            if (Primo){
                Primos[PrimosHallados] = PosiblePrimo;
                PrimosHallados++;
            }

            // Inicializa las variables e Incrementa los números primos hallados
            Primo = true;
            PosiblePrimo++;
            Indice = 0;

        } while (PrimosHallados < NUM_PRIMOS); //Valida que el contador de PrimosHallados sea menor a los solicitados

        // Imprime el array de Primos
        for(int i=0; i < NUM_PRIMOS; i++){
            System.out.print(Primos[i] + " ");
            // Se imprimen grupos de 10
            if ( i % 10 == 0)
                System.out.println();
        }

        // System.out.println("PosiblePrimo: " + PosiblePrimo);
    }
}