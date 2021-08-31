/*
Prueba el ItemListener
Crea cuatro cajas de texto y les añade la funcionadlidad en la clase ListenerItem
Implementa el método void 	itemStateChanged(ItemEvent e).


*/
import java.awt.*;

public class PruebaListenerItem {
    
    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de los eventos de ItemListener");
        int width = 600;
        int height = 300;
            
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        Panel PnlPpal = new Panel();

        Checkbox chkbDiesel = new Checkbox("Diesel", true);
        Checkbox chkbFaros = new Checkbox("Faros de Xenon", false);
        Checkbox chkbAleacion = new Checkbox("Llantas de Aleacion", false);
        Checkbox chkbMetal = new Checkbox("Pintura Metalizada", true);

        PnlPpal.add(chkbDiesel);
        PnlPpal.add(chkbFaros);
        PnlPpal.add(chkbAleacion);
        PnlPpal.add(chkbMetal);
    
        Frame.add(PnlPpal);
    
        // Adicionamos la clase que trata los evento 
        chkbDiesel.addItemListener(new ListenerItem());
        chkbFaros.addItemListener(new ListenerItem());
        chkbAleacion.addItemListener(new ListenerItem());
        chkbMetal.addItemListener(new ListenerItem());

    }


}
