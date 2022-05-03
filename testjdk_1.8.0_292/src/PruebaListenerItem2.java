/*
Prueba el ItemListener
Crea 5 check cajas de texto 
Crea 1 lista desplegable
Crea 1 lista
Crea 1 label
y los asigna a un vertor de Componentes

y les añade la funcionadlidad en la clase ListenerItem
Implementa el método void 	itemStateChanged(ItemEvent e).


*/
import java.awt.*;

public class PruebaListenerItem2 {
    
    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Opciones y validaciones interactivas ItemListener"); 
        int width = 600;
        int height = 300;
            
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // FlowLayout default (CENTER)
        Panel PnlPpal = new Panel(new FlowLayout(FlowLayout.LEFT));

        Panel PnlIzq = new Panel(new GridLayout(6,1));

        Component[] Components = new Component[8];

        // 5 Checkbox
        Checkbox chkbDiesel = new Checkbox("Diesel", true);
        Checkbox chkbAsientos = new Checkbox("Asientos Deportivos", false);
        Checkbox chkbTapiceria = new Checkbox("Tapiceria de cuero", false);
        Checkbox chkbAleacion = new Checkbox("Llantas de Aleacion", false);
        Checkbox chkbMetal = new Checkbox("Pintura Metalizada", true);

        // 1 Lista desplegable 
        Choice lstLlantas = new Choice();
        lstLlantas.add("Tres radios");
        lstLlantas.add("Cinco radios");
        lstLlantas.add("Siete radios");
        lstLlantas.setEnabled(false);

        // 1 Lista
        List lstColoresMetal = new List(2);
        lstColoresMetal.add("Rojo");
        lstColoresMetal.add("Verde");
        lstColoresMetal.add("Azul");

        // 1 Label
        Label lblSelec = new Label("Seleccionado: ");
        lblSelec.setForeground(Color.RED);

        // Asigno los componentes a un vertor de Componentes
        Components[0] = chkbDiesel;
        Components[1] = chkbAsientos;
        Components[2] = chkbTapiceria;
        Components[3] = chkbAleacion;
        Components[4] = chkbMetal;
        Components[5] = lstLlantas;
        Components[6] = lstColoresMetal;
        Components[7] = lblSelec;

        PnlPpal.add(PnlIzq);
        PnlPpal.add(lstColoresMetal);
        PnlPpal.add(lstLlantas);
    
        PnlIzq.add(chkbDiesel);
        PnlIzq.add(chkbAsientos);
        PnlIzq.add(chkbTapiceria);
        PnlIzq.add(chkbAleacion);
        PnlIzq.add(chkbMetal);
        PnlIzq.add(lblSelec);

        Frame.add(PnlPpal);
    
        // Adicionamos la clase que trata los eventos a cada elemento
        chkbDiesel.addItemListener(new ListenerItem2(Components));
        chkbAsientos.addItemListener(new ListenerItem2(Components));
        chkbTapiceria.addItemListener(new ListenerItem2(Components));
        chkbAleacion.addItemListener(new ListenerItem2(Components));
        chkbMetal.addItemListener(new ListenerItem2(Components));
        lstLlantas.addItemListener(new ListenerItem2(Components));
        lstColoresMetal.addItemListener(new ListenerItem2(Components));

    }

}
