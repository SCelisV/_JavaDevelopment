/*
Prueba ActionListener y ActionEvent    
Cambia el color del panel pasado como parámetro
*/
import java.awt.*;

public class PruebaListenerAction2{

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de los eventos de ActionListener");
        int width = 600;
        int height = 300;
                
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel();
        
        Button btnR = new Button("Rojo");
        Button btnG = new Button("Verde");
        Button btnB = new Button("Azul");

        PnlPpal.add(btnR);
        PnlPpal.add(btnG);
        PnlPpal.add(btnB);
        
        Frame.add(PnlPpal);
        
        // Adicionamos la clase que trata los evento 
        // Se pasa la referencia del panel que registrará los cambios de color
        // a medida que se produzcan los eventos
        btnR.addActionListener(new ListenerAction2(PnlPpal));
        btnG.addActionListener(new ListenerAction2(PnlPpal));
        btnB.addActionListener(new ListenerAction2(PnlPpal));
    }
}
