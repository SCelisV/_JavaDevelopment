/*
Implementar todos los métodos de la Clase KeyListener
Escribe un texto por consola cada vez que activa uno de los tres métodos que proporciona 
el interfaz KeyListener.
*/
import java.awt.*;

public class PruebaListenerEventosKey {
   
    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TODOS los eventos del teclado");
        int width = 600;
        int height = 300;
        
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout());

        
        Frame.add(PnlPpal);

        // Adicionamos la clase que trata los evento 
        PnlPpal.addKeyListener(new ListenerEventosKey());

    }

}
