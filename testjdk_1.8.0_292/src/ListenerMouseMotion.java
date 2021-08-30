/*
implementa el interfaz MouseMotionListener
*/

import java.awt.event.*;

public class ListenerMouseMotion implements MouseMotionListener{

    public void mouseDragged(MouseEvent e){
        System.out.println("Movimiento del ratón con un botón pulsado");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Movimiento del ratón");

    }
    
}
