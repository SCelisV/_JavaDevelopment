/*
prueba de la clase Frame
Uso y visualización de una ventana
1. Importar la clase Frame de awt
2. Crear una instancia de tipo Frame
3. Establecer sus caracteristicas

Doc: https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Frame.html
Constructores:
Frame()
Frame(GraphicsConfiguration gc)
Frame(String title)
Frame(String title, GraphicsConfiguration gc)

*/
import java.awt.Frame;
import java.awt.Point;

public class PruebaClassPoint{

    public static void main(String[] args){

        Frame UnFrame = new Frame();
        UnFrame.setSize(800, 200);
        UnFrame.setTitle("Titulo de mi instancia UnFrame de tipo Frame con setLocation");
        UnFrame.setVisible(true);
        // Point situa la ventana en la posición dada respecto al origen del GraphicsDevice, normalmente la pantalla del ordenador
        UnFrame.setLocation(new Point(100, 200));

    }



}