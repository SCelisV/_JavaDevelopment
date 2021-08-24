/*
Constructores más usados
Dialog(Frame owner, String title, boolean modal)
Dialog(Dialog owner, String title, boolean modal)
Dialog(Frame owner)
Dialog(Dialog owner)

setTitle(String title)
setModal(boolean modal)
hide()
show()
setResizable(boolean resizable)

*/

import java.awt.*;
public class PruebaClassDialog2 {

    public static void main(String[] args){

     // Variables para crear la ventana
        String titulo = "Empresa -  Ventana que contiene un Dialog";
        int width = 600, height = 300;
     
        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel Pnl = new Panel();
        Pnl.add(new Label("Label - Un elemento de Dialog"));

        final boolean MODAL = true;
        Dialog Dialogo = new Dialog(Frame, "Ventana de Dialogo - Dialog", MODAL);

        Dialogo.add(Pnl);
        Dialogo.setSize(250,100);
        Dialogo.setLocation(new Point(50,80));
        Dialogo.setVisible(true);
        
    }

    
}
