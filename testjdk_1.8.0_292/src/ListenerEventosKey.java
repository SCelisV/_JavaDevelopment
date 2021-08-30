/*
Implementar todos los métodos de la Clase MouseListener
*/
import java.awt.event.*;

public class ListenerEventosKey implements KeyListener{
   
    public void keyPressed(KeyEvent e){
        System.out.println("keyPressed:  Tecla pulsada");
    }
    public void keyReleased(KeyEvent e){
        System.out.println("keyReleased: Tecla soltada");
    }
    public void keyTyped(KeyEvent e){
        System.out.println("keyTyped: Tecla pulsada y soltada");
    }
}
