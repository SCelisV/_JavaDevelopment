/*
implementa el interfaz MouseMotionListener
*/

import java.awt.event.*;
import java.awt.Color;
import java.awt.Label;


public class ListenerMouseMotion2 implements MouseMotionListener{

    // propiedades
    private Label labelX, labelY;
        
    // constructor que contiene como parámetros dos etiquetas
    public ListenerMouseMotion2(Label labelx, Label labely){

        this.labelX = labelx;
        this.labelY = labely;

    }
   
    private void setPosition(MouseEvent e){
        // obtiene la posición en pixels del puntero del ratón

        // usando getX de de la clase Mouse Event
        // los int se convierten a String y se asignan a las etiquetas
        String PosicionX = String.valueOf(e.getX());
        labelX.setText(PosicionX);

        // usando getY de de la clase Mouse Event
        // los int se convierten a String y se asignan a las etiquetas
        String PosicionY = String.valueOf(e.getY());
        labelY.setText(PosicionY);

    }

    public void mouseDragged(MouseEvent e){

        labelX.setBackground(Color.ORANGE);
        labelY.setBackground(Color.ORANGE);
        setPosition(e);
        System.out.println("Movimiento del ratón con un botón pulsado: ");

    }
    public void mouseMoved(MouseEvent e){

        labelX.setBackground(Color.LIGHT_GRAY);
        labelY.setBackground(Color.LIGHT_GRAY);
        setPosition(e);
        System.out.println("Movimiento del ratón");

    }
    
}
