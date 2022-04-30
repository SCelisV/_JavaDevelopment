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
 Incluimos en el BorderLayout.North otro Panel y sobre el ubicamos tres botones dispuestos en posición horizontal.
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PruebaClassPanelBorderLayout2 {
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        
        // Instancia de Panel
        Panel PnlPal = new Panel();
        // Instancia de BorderLayout
        BorderLayout PuntosCardinales = new BorderLayout();
        // Define el Layout
        PnlPal.setLayout(PuntosCardinales);
        // Instancia de Botón PnlPal
        Button BtnSouth = new Button("Btn South");
        Button BtnCenter = new Button("Btn Center");
        Button BtnWest = new Button("Btn West-Occidente");
        Button BtnEast = new Button("Btn East-Oriente");

        // Instancia de Panel Menu
        Panel PnlMenuNorth = new Panel();
        // Instancia de FlowLayout
        FlowLayout OpcionesMenu = new FlowLayout();
        // Define el Layout
        PnlMenuNorth.setLayout(OpcionesMenu);
        // Instancia de Botón MenuNorth
        Button BtnOpc1 = new Button("Option One");
        Button BtnOpc2 = new Button("Option Two");
        Button BtnOpc3 = new Button("Option Three");
        
        // Añade el componente Pnl al contenedor MyFrame
        MyFrame.add(PnlPal);

        // Añade los componentes a los Contenedores
        // al contenedor PnlPal
        PnlPal.add(PnlMenuNorth, BorderLayout.NORTH);
        PnlPal.add(BtnSouth, BorderLayout.SOUTH);
        PnlPal.add(BtnCenter, BorderLayout.CENTER);
        PnlPal.add(BtnWest, BorderLayout.WEST);
        PnlPal.add(BtnEast, BorderLayout.EAST);
        // al contenedor PnlMenuNorth
        PnlMenuNorth.add(BtnOpc1);
        PnlMenuNorth.add(BtnOpc2);
        PnlMenuNorth.add(BtnOpc3);

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Paneles, Border y Flow Layout");
        MyFrame.setVisible(true);

    }
}