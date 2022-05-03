/*
prueba la implementación de el interfaz MouseMotionListener
*/

import java.awt.*;

public class PruebaListenerMouseMotion2 {

   public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de eventos de movimiento del ratón");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout(FlowLayout.CENTER));

        Frame.add(PnlPpal);

        Label PosicionX = new Label("000");
        Label PosicionY = new Label("000");

        PnlPpal.add(PosicionX);
        PnlPpal.add(PosicionY);

        PnlPpal.addMouseMotionListener(new ListenerMouseMotion2(PosicionX, PosicionY));

   } 
}
