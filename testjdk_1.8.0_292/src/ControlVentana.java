/*
método windowClosing para permitir la finalización de la aplicación

*/
import java.awt.event.*;

public class ControlVentana implements WindowListener{

    public void windowClosing(WindowEvent e){
        // System.out.println("windowClosing - si pulsas se cierra " + e.getWindow().getName());
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
}
