/*
Implementar todos los métodos de la Clase MouseListener
En este ejemplo:
Recordar que implements 
Un método abstracto se declara pero no se define, no usa{}, usa la palabra abstract y termina con (;).
Para poder utilizar los miembros de un interfaz es necesario implementarlo en una clase,
Es obligatorio definir todos su métodos aunque no se desarrollen

*/
import java.awt.event.*;
import java.awt.Color;

public class ListenerMouse implements MouseListener{
    public void mouseClicked(MouseEvent e){
        // implementamos lo que queremos que suceda
    }
    public void mouseEntered(MouseEvent e){
        // Cuando el puntero del ratón se coloque sobre el botón, 
        // el color de fondo del mismo se pondrá en rojo
        e.getComponent().setBackground(Color.RED);

    }
    public void mouseExited(MouseEvent e){
        // Cuando el puntero del ratón salga de el botón, 
        // el color de fondo del mismo se pondrá en gris.
        e.getComponent().setBackground(Color.GRAY);
    }
    public void mousePressed(MouseEvent e){
        // implementamos lo que queremos que suceda
    }
    public void mouseReleased(MouseEvent e){
        // implementamos lo que queremos que suceda
    }
}
