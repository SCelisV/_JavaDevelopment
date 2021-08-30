/*
prueba la implementación de el interfaz MouseMotionListener
*/

import java.awt.*;

public class PruebaListenerMouseMotion {

   public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TODOS los eventos de movimiento del ratón");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout(FlowLayout.CENTER));

        Frame.add(PnlPpal);

        PnlPpal.addMouseMotionListener(new ListenerMouseMotion());
   } 
}
