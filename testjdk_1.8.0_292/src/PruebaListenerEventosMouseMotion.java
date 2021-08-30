/*
Si queremos evitar el constructor con parámetros unificar el GUI y el adaptador en un sólo fichero
*/

import java.awt.event.*;
import java.awt.*;
import java.lang.String;

public class PruebaListenerEventosMouseMotion {

    // Variables para la creación del Frame
    String titulo = new String("Ventana de Prueba de eventos de movimiento del ratón");
    int width = 600;
    int height = 300;

    MyFrame1 Frame = new MyFrame1(titulo, width, height);
    // FlowLayout(CENTER) por default
    Panel PnlPpal = new Panel(new FlowLayout(FlowLayout.LEFT));

    Label PosicionX = new Label("000");
    Label PosicionY = new Label("000");

    // Constructor
    PruebaListenerEventosMouseMotion(){
        Frame.add(PnlPpal);
        PnlPpal.add(PosicionX);
        PnlPpal.add(PosicionY);
        Frame.setSize(300, 200);
        PnlPpal.addMouseMotionListener (new ListenerEventosMouseMotion());
    }

    class ListenerEventosMouseMotion implements MouseMotionListener{

        private void setPosition(MouseEvent e){
            // obtiene la posición en pixels del puntero del ratón
    
            // usando getX de de la clase Mouse Event
            // los int se convierten a String y se asignan a las etiquetas
            String X = String.valueOf(e.getX());
            PosicionX.setText(X);
    
            // usando getY de de la clase Mouse Event
            // los int se convierten a String y se asignan a las etiquetas
            String Y = String.valueOf(e.getY());
            PosicionY.setText(Y);
    
        }
    
        public void mouseDragged(MouseEvent e){
    
            PosicionX.setBackground(Color.ORANGE);
            PosicionY.setBackground(Color.ORANGE);
            setPosition(e);
            System.out.println("Movimiento del ratón con un botón pulsado: " + PosicionX + ", " + PosicionY);
    
        }
        public void mouseMoved(MouseEvent e){
    
            PosicionX.setBackground(Color.LIGHT_GRAY);
            PosicionY.setBackground(Color.LIGHT_GRAY);
            setPosition(e);
            System.out.println("Movimiento del ratón: " + PosicionX + ", " + PosicionY);
    
        }
    }
}
