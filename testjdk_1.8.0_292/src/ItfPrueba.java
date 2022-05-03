// La clase ItfPrueba prueba el funcionamiento de las clases
public class ItfPrueba{
    public static void main (String[] args){
        // Estas declaraciones son iguales que cuando 
        // se declara una variable de tipo SuperClase abstracta y 
        // la instanciamos como clase derivada

        // Se declara Negativo de tipo ItfImpresion que es una interface y
        // Se instancia como ItfNegativoImpresion que es una clase.
        ItfImpresion Negativo = new ItfNegativoImpresion();

        // Se declara Positivo de tipo ItfImpresion que es una interface y
        // Se instancia como ItfPositivoImpresion que es una clase.
        ItfImpresion Positivo = new ItfPositivoImpresion();

        // Se explota el Polimorfismo haciendo llamadas al mismo método Imprimir 
        // definido de manera diferente en cada una de las clases 
        // que implementan el interfaz ItfImpresion.

        // Se espera que imprima primero: ": !Que buen tiempo hace! y luego "!Odio los lunes!".
        Positivo.Imprimir();
        Negativo.Imprimir();
    }
}
