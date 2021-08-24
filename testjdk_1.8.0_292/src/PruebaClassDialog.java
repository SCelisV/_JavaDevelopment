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
public class PruebaClassDialog {

    public static void main(String[] args){

     // Variables para crear la ventana
        String titulo = "Empresa -  Ventana que contiene un Dialog";
        int width = 300, height = 600;
     
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        final boolean NO_MODAL = false;
        Dialog Dialogo = new Dialog(Frame, "Ventana de Dialogo - Dialog", NO_MODAL);
        Dialogo.setSize(250,100);
        Dialogo.setVisible(true);

        


    }

    
}
