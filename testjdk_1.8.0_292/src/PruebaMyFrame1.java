/*
Prueba MyFrame
No hay ningún constructor de la clase que admita como parametro el tamaño de la ventana, 
por lo que podemos crear nuestro propio Frame que herede de Frame y ofrezca esta posibilidad
y que por defecto la haga visible

*/
public class PruebaMyFrame1{
    public static void main(String[] args){

        MyFrame UnaVentana = new MyFrame();
        MyFrame VentanaPrincipal = new MyFrame("Aplicacion", 1200, 800);

    }

}
