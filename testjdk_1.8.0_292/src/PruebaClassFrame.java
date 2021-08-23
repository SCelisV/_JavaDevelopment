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
public class PruebaClassFrame{

    public static void main(String[] args){

        Frame UnFrame = new Frame();
        UnFrame.setSize(400, 200);
        UnFrame.setTitle("Titulo de mi instancia UnFrame de tipo Frame");
        UnFrame.setVisible(true);
    }



}