/*
Escribe un texto por consola cada vez que se activa alguno de los métodos disponibles en el interfaz FocusListener.

métodos
void 	focusGained(FocusEvent e)
void 	focusLost(FocusEvent e)
*/
import java.awt.event.*;

public class ListenerFocus implements FocusListener{


    public void focusGained(FocusEvent e){
        System.out.println("focus Gained- Se ha entrado en el componente");
    }
    public void focusLost(FocusEvent e){
        System.out.println("focusLost - Se ha salido de el componente");
    }

}
