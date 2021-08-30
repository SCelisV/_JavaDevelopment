/*
implementa todos los métodos del interfaz MouseListener de esta manera, 
con MouseAdapter, podemos sobrecargar únicamente los métodos que deseemos.

*/

import java.awt.event.*;
import java.awt.Component;
import java.awt.Color;
import java.awt.Label;

public class ListenerEventosMouseAdapter2 extends MouseAdapter{

    // propiedades
    private Label label;
    private Component componente;
    
    // constructor
    // a través del cual se puede indicar una etiqueta 
    // donde los métodos de la clase podrán asignar diferentes textos.  
    public ListenerEventosMouseAdapter2(Label label){
        this.label = label;
    }

    public void mouseClicked(MouseEvent e){

        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component componente = (Component) e.getSource();

        // obtiene el nombre del componente
        String Nombre = componente.getName();

        // aisla los dos últimos digitos del nombre que indican el número del botón
        // el nombre del componente es "O0, O1, ..O9, 10, 11 "
        String Opcion = Nombre.substring(Nombre.length()-2, Nombre.length());

        // se modifica el texto de la etiqueta que ha recibido a través del constructor
        label.setText("Ejecutar la accion: " + Opcion);

        // invocar a un método Opcion
        // label();

        System.out.println("mouseClicked: Click");

    }
    public void mouseEntered(MouseEvent e){

        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component component = (Component) e.getSource();
        component.setBackground(Color.MAGENTA);

        System.out.println("mouseEntered: Focus");
    }
    public void mouseExited(MouseEvent e){

        // obtener el objeto que generó el evento 
        // usando el método getSource de MouseEvent
        // y cambiar sus propiedades 
        Component component = (Component) e.getSource();
        component.setBackground(Color.ORANGE);

        System.out.println("mouseExited: Blur");
    }
}
