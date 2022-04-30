/*
Situa un Panel sobre el Frame (Ventana)
Situa un boton sobre un Panel, conseguiremos que los componentes que añadamos al Panel sigan una disposición establecida
(por defecto ordenación secuencial).
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class PruebaClassButtonPanel {
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia de Panel
        Panel Pnl = new Panel();
        // Instancia de Botón
        Button BtnArea = new Button("Área");
        Button BtnPerimetro = new Button("Perimetro");

        // Añade el componente Pnl al contenedor MyFrame
        MyFrame.add(Pnl);
        // Añade los componente Btn al contenedor al Pnl
        Pnl.add(BtnArea);
        Pnl.add(BtnPerimetro);

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Calcula Área y Perimetro");
        MyFrame.setVisible(true);

    }
}
