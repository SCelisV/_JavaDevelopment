// La clase ItfPrueba2 crea una instancia de la clase ItfNeutro
public class ItfPrueba2{
    public static void main (String[] args){
        // Crea una instancia de la clase ItfNeutro y otra de la clase ItfNegativoImpresion
        ItfNeutro Instancia = new ItfNeutro();
        ItfImpresion Negativo = new ItfNegativoImpresion();

        // Se usa Polimorfismo llamando al método imprimir definido en clases diferentes
        // y de la posibilidad de acceso a los métodos Imprimir e ImprimirBonito
        // diseñados en los interfaces ItfImpresion e ItfImpresion2.
        Instancia.Imprimir();
        Instancia.ImprimirBonito();
        Negativo.Imprimir();
    }
}
