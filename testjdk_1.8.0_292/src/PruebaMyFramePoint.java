/*
Prueba MyFramePoint
No hay ningún constructor de la clase que admita como parametro el tamaño de la ventana, 
por lo que podemos crear nuestro propio Frame que herede de Frame y ofrezca esta posibilidad
y que por defecto la haga visible
Posicionamiento de múltiples Ventanas, setLocation, heredado de Component.
Sobrecargado y admite dos tipos de parámetros de entrada: 
es necesario suministrar las coordenadas bidimensionales.

*/
public class PruebaMyFramePoint{
    public static void main(String[] args){

        MyFramePoint UnaVentana = new MyFramePoint();
        MyFramePoint VentanaPrincipal = new MyFramePoint("Aplicacion", 1200, 800, 100, 100);

    }
}
