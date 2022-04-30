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

public class ListenerKey implements KeyListener{
    public void 	keyTyped(KeyEvent e){
        // implementamos lo que queremos que suceda
    }
    public void mouseClicked(MouseEvent e){
        // implementamos lo que queremos que suceda
    }
    public void keyPressed(KeyEvent e){
        // Cuando se pulse cualquier tecla
        // el color de fondo del mismo se pondrá en rojo
        // Cuando teclee la tecla H
        e.getComponent().setBackground(Color.RED);

    }
    public void keyReleased(KeyEvent e) {
        // Cuando se deje de pulsar la tecla
        // el color de fondo del mismo se pondrá en gris.
        e.getComponent().setBackground(Color.GRAY);
    }
}
