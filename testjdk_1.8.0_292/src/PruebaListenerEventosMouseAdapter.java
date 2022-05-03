/*
Para poder utilizar los miembros de un interfaz es necesario implementarlo en una clase,
Cuando se implementa un interfaz con una clase no abstracta debemos implementar todos y cada uno de sus métodos
Un método abstracto se declara pero no se define, no usa{}, usa la palabra abstract y termina con (;).
Es obligatorio definir todos su métodos aunque no se desarrollen

Podemos implementar tantas clases "listeners" como comportamientos diferentes deseemos y asignar diferentes componenetes a distintos listeners.
*/
import java.awt.*;

public class PruebaListenerEventosMouseAdapter{

    public static void main(String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de eventos de Mouse con Mouse Adapter");
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

        btHi.addMouseListener  (new ListenerEventosMouseAdapter());
        btBye.addMouseListener  (new ListenerEventosMouseAdapter());
    }
}

