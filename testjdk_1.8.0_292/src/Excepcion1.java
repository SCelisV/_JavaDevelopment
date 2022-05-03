// Captura la excepción ArithmeticException, 
// Es una SubClase de RuntimeException; aunque no es obligatorio tratar las excepciones que derivan 
// de RuntimeException, en ciertos casos resulta cnoveniente.
// El bloque catch se ejecuta únicamente a excepciones de tipo ArithmeticException, imprimiendo el mensaje "Division por cero"
public class Excepcion1 {
    public static void main(String[] args){
        do {

            try {
                // int Valor = 0; Se ejecuta la excepcion
                int Valor = 0;
                // int Valor = 10; No se ejecuta el catch int Valor = 10;
                System.out.println("Valor: " + Valor);
                float Auxiliar = 8 / Valor;
                System.out.println("Auxiliar: " + Auxiliar);
            } 
            
            catch (ArithmeticException e) { // NO es obligatorio tratar la excepcion
                System.out.println("Division por cero");
            }

            System.out.println("Después del catch");

        } while (true); // bucle sin fin
    }
    
}
