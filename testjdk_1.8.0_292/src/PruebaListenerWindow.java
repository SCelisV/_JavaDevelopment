/*
Uso de la interfaz WindowListener
*/
import java.awt.*;

public class PruebaListenerWindow {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de eventos de la ventana");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        MyFrame1 OtroFrame = new MyFrame1(titulo, width, height);

        OtroFrame.setTitle("Otro Frame");
        OtroFrame.setSize(200, 200);
        OtroFrame.setLocation(200, 0);

        Frame.addWindowListener(new ListenerWindow());
        OtroFrame.addWindowListener(new ListenerWindow());

    }
}