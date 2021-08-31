/*
Prueba ActionListener y ActionEvent    

Escribe por consola información del evento cada vez que se activa actionPerformed (método de ActionListener)
*/
import java.awt.*;

public class PruebaListenerAction{

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de los eventos de ActionListener");
        int width = 600;
        int height = 300;
                
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new GridLayout(3,1));
        
        Button btn = new Button("Botón");
        TextField txtField = new TextField("texto del campo", 8);
        List lst = new List(3);

        lst.add("Option 1");
        lst.add("Option 2");
        lst.add("Option 3");
        lst.add("Option 4");
        
        PnlPpal.add(btn);
        PnlPpal.add(txtField);
        PnlPpal.add(lst);
        
        Frame.add(PnlPpal);
        
        // Adicionamos la clase que trata los evento 
        btn.addActionListener(new ListenerAction());
        txtField.addActionListener(new ListenerAction());
        lst.addActionListener(new ListenerAction());
    }
}
