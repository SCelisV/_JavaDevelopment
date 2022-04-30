/*

Escribe un texto por consola cada vez que se activa alguno de los métodos disponibles en el interfaz FocusListener.

Define un conjunto de botones y campos de texto, a los cuales se les añade 
el tratamiento de eventos de enfoque


*/
import java.awt.*; 

public class PruebaListenerFocusAdapter {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de los eventos de FocusListener");
        int width = 600;
        int height = 300;
                
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        final int NUM_FILAS = 5;
        Button[] btns = new Button[NUM_FILAS];
        TextField[] txtFields = new TextField[NUM_FILAS];
        Panel PnlPpal = new Panel(new GridLayout(NUM_FILAS,2));

        for (int i=0; i<NUM_FILAS; i++){

            btns[i] = new Button("Boton " + i);
            txtFields[i] = new TextField(NUM_FILAS + i);

            PnlPpal.add(btns[i]);
            PnlPpal.add(txtFields[i]);

        // Adicionamos la clase que trata los evento 
            btns[i].addFocusListener(new ListenerFocusAdapter());
            txtFields[i].addFocusListener(new ListenerFocusAdapter());
        }

        
        Frame.add(PnlPpal);
        
    }
    
}
