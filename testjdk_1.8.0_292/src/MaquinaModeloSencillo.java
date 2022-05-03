/*
Esta máquina expendedora tiene 
3 almacenes de bebidas y 
2 almacenes de monedas
Establecer precios personalizados, 
El precio varia dependiendo de donde se ubica la máquina
*/

public class MaquinaModeloSencillo{

    /*---------------------
    // Propiedades de Instancia
    // Esta forma es más adaptada a la programación orientada a objetos
    // Definidas como private e incorporar los métodos para 
    // obtener sus referencias
    // Algo como: --- pendiente de probar
    private MaquinaAlmacen DepositoAgua = new MaquinaAlmacen((short) 8);

    public MaquinaModeloSencillo getAlmacenAgua(){
    ó 
    public MaquinaModeloSencillo getAlmacen(String TipoAlmacen)

    */
    //---------------------
    // Propiedades de Instancia
    // Definidas como public para que puedan ser referenciados directamente 
    // por las clases que instancien a MaquinaModeloSencillo
    public MaquinaAlmacen Deposito1Euro = new MaquinaAlmacen((short) 8);
    public MaquinaAlmacen Deposito01Euro = new MaquinaAlmacen((short) 15);
    public MaquinaAlmacen DepositoCocaCola = new MaquinaAlmacen((short) 10);
    public MaquinaAlmacen DepositoNaranja = new MaquinaAlmacen((short) 5);
    public MaquinaAlmacen DepositoAgua = new MaquinaAlmacen((short) 8);
    // Precios recomendados
    private float PrecioCocaCola = 1.0f;
    private float PrecioNaranja = 1.3f;
    private float PrecioAgua = 0.6f;

    //---------------------
    // Métodos de instancia
    // setters
    public void serPrecios(float cocacola, float naranja, float agua){
        PrecioCocaCola = cocacola;
        PrecioNaranja = naranja;
        PrecioAgua = agua;
    }
    // getters
    public float getPrecioCocaCola(){
        return PrecioCocaCola;
    }
    public float getPrecioNaranja(){
        return PrecioNaranja;
    }
    public float getPrecioAgua(){
        return PrecioAgua;
    }
    public void MostrarEstadoMaquina(){
        System.out.println("CocaColas: " + DepositoCocaCola.getNumeroDeElementos());
        System.out.println("Naranja: " + DepositoNaranja.getNumeroDeElementos());
        System.out.println("Agua: " + DepositoAgua.getNumeroDeElementos());
        System.out.println("1Euro: " + Deposito1Euro.getNumeroDeElementos());
        System.out.println("01Euro: " + Deposito01Euro.getNumeroDeElementos());
    }
}