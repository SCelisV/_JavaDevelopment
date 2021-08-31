/*
Extiende el adpatador FocusAdapter, con el fin de sobrecargar únicamente uno de los métodos focusGained
Escribe un texto por consola cada vez que se activa alguno de los métodos disponibles en el interfaz FocusListener.

métodos
void 	focusGained(FocusEvent e)
void 	focusLost(FocusEvent e)
*/
import java.awt.event.*;
import java.awt.*;

public class ListenerFocusAdapter extends FocusAdapter{

    public void focusGained(FocusEvent e){
        // Obtener el elemento que ha generado el evento
        Component Componente = (Component)e.getSource();
        // Se escribe el nombre del componente y 
        // una descripción del elemento que ha perdido el foco (getOppositeComponent())
        System.out.println("focus Gained- Se ha entrado en el componente: " + 
                            Componente.getName() + " " + 
                            "\nsaliendo de: " + e.getOppositeComponent() + "\n" );
        // getOppositeComponent():-  java.awt.Button[button4,0,209,300x52,label=Boton 4]
    }
}
