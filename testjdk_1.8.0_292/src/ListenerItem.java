/*
Implementa el método void 	itemStateChanged(ItemEvent e).
*/
import java.awt.*;
import java.awt.event.*;


public class ListenerItem implements ItemListener{
    

    public void itemStateChanged(ItemEvent e){

        // Obtenemos la caja de texto que ha producido el evento getSource() ó getItem()
        // sobre el evento que nos llega
        Checkbox chckComponente = (Checkbox) e.getSource();
        System.out.println("getSource - Checkbox: " + (Checkbox) e.getSource());
        System.out.println("getItem - Checkbox: " + e.getItem());

        // Consultar el estado de la caja de texto getStateChange de ItemEvent
        int newState = e.getStateChange();
        // getStateChange - newState: 1 => Seleccionado
        // getStateChange - newState: 2 => No Seleccionado
        System.out.println("getStateChange - newState: " + e.getStateChange());

        // Consultar el estado de la caja de texto getState() de checkbox ó
        // getState - bState: true => Seleccionado
        // getState - bState: false => No Seleccionado
        Boolean bState = chckComponente.getState();
        System.out.println("getState - bState: " + bState); 

        if(newState==ItemEvent.SELECTED){
            System.out.println("Seleccionado");
        }else{
            System.out.println("No Seleccionado");
        }

    }
}
