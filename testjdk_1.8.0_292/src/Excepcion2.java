// Captura la excepción ArithmeticException, 
// Es una SubClase de RuntimeException; aunque no es obligatorio tratar las excepciones que derivan 
// de RuntimeException, en ciertos casos resulta cnoveniente.
// El bloque catch se ejecuta únicamente a excepciones de tipo ArithmeticException, imprimiendo el mensaje "Division por cero"

public class Excepcion2 {
    public static void main(String[] args){
        // 
        int Posicion = 5;
        System.out.println("Posicion: " + Posicion);
        int Valor = 2;
        System.out.println("Valor: " + Valor);

        do {

            try {

                // Se pueden generar al menos dos excepciones
                // (ArithmeticException e)
                // (IndexOutOfBoundsException e)

                float[] Valores = {0.0f, 1.0f, 2.0f, 3.0f, 4.0f};
                System.out.println("Valores: " + Valores[Posicion]);

                float Auxiliar = 8 / Valor;
                System.out.println("Auxiliar: " + Auxiliar);

                Valores[Posicion] = Auxiliar;
                System.out.println("Valores: " + Valores[Posicion]);
            } 
            
            catch (ArithmeticException e) { 
                System.out.println("ArithmeticException - Division por cero");
            }

            catch (IndexOutOfBoundsException e) { 
                System.out.println("IndexOutOfBoundsException - Indice fuera del array");
            }

            System.out.println("Después de los catch!!");

        } while (Posicion != 10);

    }
    
}
