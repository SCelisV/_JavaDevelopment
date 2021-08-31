/*
Objeto de tratamiento de eventos, 
a través del constructor de esta clase, 
se pasa la referencia del panel que registrará los cambios de color 
a medida que se produzcan los eventos.
(método de ActionListener)
*/
import java.awt.event.*;
import java.awt.*;

public class ListenerAction2 implements ActionListener{

    // propiedades
    private Panel PnlPpal;

    // constructor
    ListenerAction2(Panel pnlPpal){
        this.PnlPpal = pnlPpal;
    }

    public void actionPerformed(ActionEvent e){

        Color ColorFondo;

        // Obtener el componente que genera el evento
        Button Componente = (Button) e.getSource();

        // Obtener el literal que identifica el comando (texto asociado al objeto)
        String ColorSeleccion = Componente.getLabel();

        // al obtener la etiqueta del componente en este caso, 
        // es sencillo modificar adecuadamente el color del panel
        if(ColorSeleccion=="Rojo"){
            ColorFondo = Color.RED;
        }else{
            if(ColorSeleccion=="Verde"){
                ColorFondo = Color.GREEN;
            }else{
                ColorFondo = Color.BLUE;
            }
        }

        PnlPpal.setBackground(ColorFondo);

    }
    
}
