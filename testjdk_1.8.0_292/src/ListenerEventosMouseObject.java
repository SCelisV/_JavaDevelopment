/*
Implementar todos los métodos de la Clase MouseListener
*/
import java.awt.event.*;
import java.awt.Component;
import java.awt.Color;

public class ListenerEventosMouseObject extends Object implements MouseListener{
    public void mouseClicked(MouseEvent e){
        System.out.println("mouseClicked: Click");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("mouseEntered: Focus");
        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component btn = (Component)e.getSource();
        btn.setBackground(Color.BLUE);
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouseExited: Blur");
        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component btn = (Component)e.getSource();
        btn.setBackground(Color.GRAY);
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mousePressed: Presion que se hace al botón del ratón");
        // utiliza los métodos getX y getY de la clase MouseEvent
        // podemos conocer las coordenadas del puntero del ratón respecto al origen del component
        // cuando se pulsa el botón
        System.out.println("Position X: " + e.getX());
        System.out.println("Position Y: " + e.getY());
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("mouseReleased: Se ha levantado el botón del ratón");
        // utiliza los métodos getX y getY de la clase MouseEvent
        // podemos conocer las coordenadas del puntero del ratón respecto al origen del component
        // cuando se suelta el botón
        System.out.println("Position X: " + e.getX());
        System.out.println("Position Y: " + e.getY());
    }
}
