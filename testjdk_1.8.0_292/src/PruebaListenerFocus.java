/*

Escribe un texto por consola cada vez que se activa alguno de los métodos disponibles en el interfaz FocusListener.

Define 2 botones y añade a uno de ellos el tratamiento de eventos de enfoque

*/
import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaListenerFocus {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de los eventos de FocusListener");
        int width = 600;
        int height = 300;
                
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel();

        Button btnA = new Button("BotonA");
        Button btnB = new Button("BotonB");

        PnlPpal.add(btnA);
        PnlPpal.add(btnB);
        
        Frame.add(PnlPpal);
        
        // Adicionamos la clase que trata los evento 
        btnB.addFocusListener(new ListenerFocus());
    }
    
}
