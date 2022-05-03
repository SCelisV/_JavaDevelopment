/*
Implementa el interfaz ItemListener
Que admite un constructor
Opciones y validaciones interactivas

métodos
void 	itemStateChanged(ItemEvent e).
*/
import java.awt.*;
import java.awt.event.*;


public class ListenerItem2 implements ItemListener{

    // propiedades
    Component[] Components = new Component[8];

    // constructor que recoge un vector de componentes con el fin de actuar sobre los mismos.
    ListenerItem2(Component[] components){
        this.Components = components;
    }

    // Si el elemento que ha generado el evento esta definido, 
    // la lista se habilita en caso de que la caja de verificación esté seleccionada, ó
    // la lista se deshabilita en caso de que la caja de verificaión No este seleccionada

    public void itemStateChanged(ItemEvent e){

        // Consultar el estado getStateChange ItemEvent
        // getStateChange - iState: 1 => Seleccionado
        // getStateChange - iState: 2 => No Seleccionado
        int iState = e.getStateChange();

        // Obtenemos la caja de texto que ha producido el evento getSource() ó getItem()
        // sobre el evento que nos llega

        // ("getItem - Checkbox: " + e.getItem());
        if(e.getItem().equals("Llantas de Aleacion")){
            if (iState==ItemEvent.SELECTED){
                Components[5].setEnabled(true);
            } else {
                Components[5].setEnabled(false);
            }
        }
        // ("getItem - Checkbox: " + e.getItem());
        // Si selecciona "Pintura Metalizada"
        // Se hace visible la lista despegable lstColoresMetal
        if(e.getItem().equals("Pintura Metalizada")){
            if (iState==ItemEvent.SELECTED){
                Components[6].setVisible(true);
            } else {
                Components[6].setVisible(false);
            }
        }
        // ("getItem - Checkbox: " + e.getItem());
        // Si selecciona "Asientos Deportivos"
        // Se deshabilita el chkbAsientos
        // Controla el estado y disponibilidad del check "Tapiceria de cuero"
        if(e.getItem().equals("Asientos Deportivos")){
            Checkbox chkbAsientos = (Checkbox) Components[2];
            // Si se selecciona "Asientos Deportivos"
            // se selecciona la "Tapiceria de cuero"
            if (iState==ItemEvent.SELECTED){
                chkbAsientos.setState(true);
                Components[2].setEnabled(false);
            } else {
                Components[2].setEnabled(true);
            }
        }

        // muestra un texto relativo al elemento que ha sido seleccionado recientemente
        Label lblSelec = (Label) Components[7];
        lblSelec.setText("" + e.getItem());

    }
}
