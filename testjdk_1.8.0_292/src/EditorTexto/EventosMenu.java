/*
Implementa el tratamiento de las opciones de menú
*/
package EditorTexto;

import java.awt.*;
import java.awt.event.*;

public class EventosMenu implements ActionListener{

    // propiedades
    public Frame Frame;
    public TextArea TAreaPal;
    // constructores
    EventosMenu(Frame Frame){
        this.Frame = Frame;
    }
    // métodos
    public void actionPerformed(ActionEvent e){
        System.out.println("actionPerformed");
        if (e.getActionCommand().equals("New File")){
            FileDialog fd = new FileDialog(Frame, "Cargar", FileDialog.LOAD);
            fd.setVisible(true);
            fd.getFile();
            System.out.println(fd.getFile());
            return;
        }
        /*
        ("New Window")
        ("Save")
            FileDialog fd = new FileDialog(Frame, "Guardar", FileDialog.SAVE);
            fd.setVisible(true)
        ("Save As")
        */
    }
    
}
