/*
Situa un boton directamente sobre una ventana
*/
import java.awt.Frame;
import java.awt.Button;

public class PruebaClassButton {
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia de Botón
        Button Btn = new Button("Hola");

        // Añade el componente Btn al contenedor MyFrame
        MyFrame.add(Btn);

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Button");
        MyFrame.setVisible(true);

    }
    
}
