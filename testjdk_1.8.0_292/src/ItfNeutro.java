// La clase ItfNeutro implementa los dos interfaces, 
// consiguiendo herencia multiple (de métodos abstractos):
public class ItfNeutro implements ItfImpresion, ItfImpresion2{
    public void Imprimir(){
        System.out.print("Las olas del mar");
    }

    public void ImprimirBonito(){
        System.out.print("---- ");
        Imprimir();
        System.out.print("---- ");
    }
}
