/*
Implementar todos los métodos de la Clase MouseListener
En este ejemplo:
Recordar que implements 
Un método abstracto se declara pero no se define, no usa{}, usa la palabra abstract y termina con (;).
Para poder utilizar los miembros de un interfaz es necesario implementarlo en una clase,
Es obligatorio definir todos su métodos aunque no se desarrollen

Podemos implementar tantas clases "listeners" como comportamientos diferentes deseemos y asignar diferentes componenetes a distintos listeners.
*/
import java.awt.*;

public class PruebaListenerEventosMouse2{

    public static void main(String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TODOS los eventos del ratón en un panel");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout());

        PnlPpal.addMouseListener (new ListenerEventosMouse());

        Frame.add(PnlPpal);

    }
}

