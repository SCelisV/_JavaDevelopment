/*
Controlar el funcionamiento de una máquina expendedora sencilla.
Suministra botellas de agua, naranja y coca-cola
Establecer los precios de cada producto
Admite monedas de 1€, y de 10centimos(0.1€).
Definir una máquina con cualquier numero de productos
- Cuantas botellas de agua nos quedan (en el deposito de botellas de agua)
- Cuantas botellas de naranja nos quedan (en el deposito de botellas de naranja)
- Cuantas botellas de coca-cola nos quedan (en el deposito de botellas de coca-cola)
- Cuantas monedas de Euro nos quedan (en el deposito de monedas de Euro)
- Cuantas monedas de 10centimos de Euro nos quedan (en el deposito de monedas de 10centimos de Euro)
Esta clase gestionará un Almacén de elementos - 
*/
public class MaquinaAlmacen {
    private short Capacidad;
    private short NumeroDeElementos = 0;

    // Definimos el constructor de la clase, nos permitirá definir la capacidad máxima de un Almacén
    
    // ----- Constructores
    MaquinaAlmacen( short capacidad ){
        this.Capacidad = capacidad;
    }

    // -- getters 
    public short getNumeroDeElementos(){
        return ( NumeroDeElementos );
    }

    public short getCapacidad(){
        return ( Capacidad );
    }

    // Controlar que puedan entrar vehiculos
    public boolean hayElemento(){
        return ( NumeroDeElementos != 0 );
    }

    // Hay plazas disponibles para los vehiculos
    public boolean hayHueco(){
        return( NumeroDeElementos != Capacidad );
    }

    // -- actualiza la cantidad de elementos
    // -- Si se mete un elemento -- disminuye la cantidad de huecos 
    public void meteElemento(){
        NumeroDeElementos ++;
    }

    // -- actualiza la cantidad de elementos - 
    // -- Si se saca un elemento -- aumenta la cantidad de huecos 
    public void sacaElemento(){
        NumeroDeElementos --;
    }
    
    public void rellenAlmacen(){
        NumeroDeElementos = Capacidad;
    }
    
}
