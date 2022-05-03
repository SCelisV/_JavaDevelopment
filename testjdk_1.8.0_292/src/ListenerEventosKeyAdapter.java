/*
Imprime por consola los caracteres tecleados hasta que pulsamos (*), cuando salimos de la app.
basta con sobrecargar el método keyTyped del KeyListener.
Implementar todos los métodos de la Clase MouseListener
*/
import java.awt.event.*;

public class ListenerEventosKeyAdapter extends KeyAdapter{
   
    public void keyTyped(KeyEvent e){
        //System.out.println(e.getKeyChar());
        System.out.print(e.getKeyChar());
        // e.getKeyChar();
        if (e.getKeyChar() == '*') {
            // abandonamos la app
            System.exit(0);
        }
    }
}
