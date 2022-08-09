/*
Prueba la clase Digitos.java
*/
package Calculadora;

import java.awt.*;
import java.awt.Button;
import src.MyFrame1.*;

public class PruebaDigitos {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana que Prueba la clase Digitos");
        int width = 600;
        int height = 300;
                
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // Definir una instancia de la clase Digitos con el constructor vacio
        // Digitos Digitos = new Digitos();

        // Definir una instancia de la clase Digitos con el constructor Color
        Digitos Digitos = new Digitos(Color.GREEN);

        // Recupero las propiedades de la clase
        Panel PnlPpal = Digitos.getPanel();
        Button[] Botones = Digitos.getButtons();

        //  System.out.println("Botones.length :" + Botones.length);

        // Adicionar los botones al panel 
        for (int i=0; i<Botones.length; i++){
            PnlPpal.add(Botones[i]);
        }

        // Adicionar el panel al Frame
        Frame.add(PnlPpal);
        
    }
    
}
