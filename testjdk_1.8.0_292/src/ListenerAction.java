/*
Escribe por consola información del evento cada vez que se activa actionPerformed (método de ActionListener)
*/
import java.awt.event.*;
import java.awt.*;

public class ListenerAction implements ActionListener{

    public void actionPerformed(ActionEvent e){
        // Obtener el componente que genera el evento
        Component Componente = (Component) e.getSource();
        // Obtener el literal que identifica el comando (texto asociado al objeto)
        String Action = e.getActionCommand();
        System.out.println("Componente: " + Componente.getName());  //  Componente: textfield0,  Componente: button0i, Componente: list0
        System.out.println("Accion: " + Action);    //  Accion: este es un campo de texto,  Accion: Botón,  Accion: Option 3
        System.out.println();
    }
    
}
