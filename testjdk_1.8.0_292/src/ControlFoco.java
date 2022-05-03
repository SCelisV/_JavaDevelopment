/*
Modificar el color de los botones a medida que el usuario se desplaza usando el teclado
método focusGained y focusLost Cambiar el color de los botones cuando nos situemos sobre ellos con el teclado
*/
import java.awt.event.*;
import java.awt.Button;
import java.awt.Color;

public class ControlFoco implements FocusListener{

    // propiedades
    Color ColorButton;

    // constructores
    // Color - Constructor de la clase
    ControlFoco(Color colorButton){
        this.ColorButton = colorButton;
    }

    // métodos
    // Pone los botones por los que se pasa en color verde (al colocarse sobre cada uno de ellos con el teclado)
    public void focusGained(FocusEvent e){

        // Recupera el objeto que genera el evento y le hace cast
        Button button = (Button) e.getSource();
        button.setBackground(Color.GREEN);
        // System.out.println("focus Gained- Se ha entrado en el componente: " + button);
    }
    // Pone los botones en su color original (constructor) cuando sale de cada uno de ellos
    public void focusLost(FocusEvent e){

        // Recupera el objeto que genera el evento y le hace cast
        Button button = (Button) e.getSource();
        button.setBackground(ColorButton);
        // System.out.println("focusLost - Se ha salido de el componente: " + button);
    }
}
