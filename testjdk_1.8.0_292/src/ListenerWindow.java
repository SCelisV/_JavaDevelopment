/*
Uso de la interfaz WindowListener
*/
import java.awt.event.*;

public class ListenerWindow implements WindowListener{

    public void windowActivated(WindowEvent e){
        System.out.println("windowActivated - ventana activa " + e.getWindow().getName());
    }
    public void windowClosed(WindowEvent e){
        System.out.println("windowClosed - ventana cerrada " + e.getWindow().getName());
    }
    public void windowClosing(WindowEvent e){
        System.out.println("windowClosing - si pulsas se cierra " + e.getWindow().getName());
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("windowDeactivated - ventana desactivada " + e.getWindow().getName());
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("windowDeiconified - ventana restaurada " + e.getWindow().getName());
    }
    public void windowIconified(WindowEvent e){
        System.out.println("windowIconified - ventana minimizada " + e.getWindow().getName());
    }
    public void windowOpened(WindowEvent e){
        System.out.println("windowOpened - ventana abierta " + e.getWindow().getName());
    }
}
