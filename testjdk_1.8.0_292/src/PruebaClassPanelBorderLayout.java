/*
Para establecer una disposición de manera explicita, podemos recurrir al método setLayout(heredado de Container).
Instanciar nuestro panel indicando directamente el layout deseado.
Panel MiPanel = new Panel (new BorderLayout());
OtroPanel.setLayout(new BorderLayout());
ó
BorderLayout MiBL = new BorderLayout();
MiPanel.setLayout(MiBL);

El BorderLayout situa y dimensiona los componentes en 5 regiones cardinales:
 - NORTE (BorderLayout.NORTH)
 - SUR (BorderLayout.SOUTH)
 - Occidente - OESTE (BorderLayout.WEST)
 - Oriente - ESTE (BorderLayout.EAST)
 - CENTER derecho (BorderLayout.CENTER)
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;

public class PruebaClassPanelBorderLayout {
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia de Panel
        Panel PnlPal = new Panel();
        // Instancia de BorderLayout
        BorderLayout PuntosCardinales = new BorderLayout();
        // Instancia de Botón
        Button BtnNorth = new Button("Btn North");
        Button BtnSouth = new Button("Btn South");
        Button BtnCenter = new Button("Btn Center");
        Button BtnWest = new Button("Btn West-Occidente");
        Button BtnEast = new Button("Btn East-Oriente");
        
        // Define el Layout
        PnlPal.setLayout(PuntosCardinales);
        // Añade el componente Pnl al contenedor MyFrame
        MyFrame.add(PnlPal);
        // Añade los componentes al contenedor PnlPal
        PnlPal.add(BtnNorth, BorderLayout.NORTH);
        PnlPal.add(BtnSouth, BorderLayout.SOUTH);
        PnlPal.add(BtnCenter, BorderLayout.CENTER);
        PnlPal.add(BtnWest, BorderLayout.WEST);
        PnlPal.add(BtnEast, BorderLayout.EAST);
        
        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Paneles y BorderLayout()");
        MyFrame.setVisible(true);

    }
}