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

public class PruebaListenerMouseKey{

    public static void main(String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de ListenerMouse implements MouseListener");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout());

        Button btHi = new Button("Hi!");
        Button btBye = new Button("Bye!");

        PnlPpal.add(btHi);
        PnlPpal.add(btBye);

        Frame.add(PnlPpal);

        // ListenerMouse.java
        btHi.addMouseListener  (new ListenerMouse());
        btBye.addMouseListener  (new ListenerMouse());

        // ListenerKey.java
        btHi.addKeyListener  (new ListenerKey());
        btBye.addKeyListener  (new ListenerKey());


    }
}

