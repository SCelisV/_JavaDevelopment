/*
Implementar todos los métodos de la Clase MouseListener
*/
import java.awt.event.*;

public class ListenerEventosMouse implements MouseListener{
    public void mouseClicked(MouseEvent e){
        System.out.println("mouseClicked: Click");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("mouseEntered: Focus");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouseExited: Blur");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mousePressed: Presion que se hace al botón del ratón");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("mouseReleased: Se ha levantado el botón del ratón");
    }
}
