/*
Para poder utilizar los miembros de un interfaz es necesario implementarlo en una clase,
Cuando se implementa un interfaz con una clase no abstracta debemos implementar todos y cada uno de sus métodos
Un método abstracto se declara pero no se define, no usa{}, usa la palabra abstract y termina con (;).
Es obligatorio definir todos su métodos aunque no se desarrollen

Podemos implementar tantas clases "listeners" como comportamientos diferentes deseemos y asignar diferentes componenetes a distintos listeners.
*/
import java.awt.*;

public class PruebaListenerEventosMouseAdapter2{

    public static void main(String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de eventos de Mouse con Mouse Adapter2");
        int width = 600;
        int height = 300;

        final int NUM_OPCIONES = 12;
        Label label = new Label("Mensaje asociado al botón pulsado");

        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // crea el pane con 13 filas y 1 columna
        Panel PnlPpal = new Panel(new GridLayout(NUM_OPCIONES+1, 1));

        Button[] buttons = new Button[NUM_OPCIONES];
        // crea 12 botones con el label "Opcion 0, Opcion1, ..etc"
        for (int i=0; i < NUM_OPCIONES; i++){

            buttons[i] = new Button("Opcion " + i);

            // el nombre del componente es "O0, O1, ..O9, 10, 11 "
            if (i<10)
                buttons[i].setName("O"+i);
            else
                buttons[i].setName(String.valueOf(i));
        }
        /* para mostrar los nombres de los objetos buttons
        for (int i=0; i < NUM_OPCIONES; i++){
            System.out.println("Name: " + buttons[i].getName());
        }
        */

        // adiciona el label y los buttons al panel 
        PnlPpal.add(label);
        for (int i=0; i < NUM_OPCIONES; i++){
            PnlPpal.add(buttons[i]);
        }

        Frame.add(PnlPpal);

        for (int i=0; i < NUM_OPCIONES; i++){
            // adiciona el listener a cada boton en este caso
            buttons[i].addMouseListener  (new ListenerEventosMouseAdapter2(label));
        }

    }
}

