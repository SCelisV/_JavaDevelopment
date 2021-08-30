/*
implementa todos los métodos del interfaz MouseListener de esta manera, 
con MouseAdapter, podemos sobrecargar únicamente los métodos que deseemos.
*/

import java.awt.event.*;
import java.awt.Component;
import java.awt.Color;

public class ListenerEventosMouseAdapter extends MouseAdapter{
    
    public void mouseEntered(MouseEvent e){
        System.out.println("mouseEntered: Focus");
        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component btn = (Component)e.getSource();
        btn.setBackground(Color.BLUE);
    }
    // este es el método CON errores sintacticos que el compilador no detectaria
    // public void mouseEited(MouseEvent e){

    // este es el método sin errores sintacticos
    public void mouseExited(MouseEvent e){
        System.out.println("mouseExited: Blur");
        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component btn = (Component)e.getSource();
        btn.setBackground(Color.GRAY);
    }
}
