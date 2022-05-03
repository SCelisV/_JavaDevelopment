/*
Para establecer una disposición de manera explicita, podemos recurrir al método setLayout(heredado de Container).
Instanciar nuestro panel indicando directamente el layout deseado.
Panel MiPanel = new Panel (new FlowLayout());
OtroPanel.setLayout(new FlowLayout());
Los objetos FlowLayout pueden instanciarse con: 
 - posicionamiento centrado (FlowLayout.CENTER) - disposición por defecto/default
 - posicionamiento izquierdo (FlowLayout.LEFT)
 - posicionamiento derecho (FlowLayout.RIGHT)

y los menos utilizados 
 - posicionamiento (FlowLayout.LEADING)
 - posicionamiento (FlowLayout.TRAILING)
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.FlowLayout;

public class PruebaClassPanelFlowLayout {
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia de Panel
        Panel PnlPal = new Panel();
        // Instancia de FlowLayout
        // FlowLayout PosicionamientoSecuencial = new FlowLayout();
        // FlowLayout PosicionamientoLEFT = new FlowLayout(FlowLayout.LEFT);
        // FlowLayout PosicionamientoRIGHT = new FlowLayout(FlowLayout.RIGHT);
        // FlowLayout PosicionamientoCENTER = new FlowLayout(FlowLayout.CENTER);
        // FlowLayout PosicionamientoLEADING = new FlowLayout(FlowLayout.LEADING);
        FlowLayout PosicionamientoTRAILING = new FlowLayout(FlowLayout.TRAILING);
        // Instancia de Botón
        Button BtnA = new Button("Btn A");
        Button BtnB = new Button("Btn B");
        Button BtnC = new Button("Btn C");
        Button BtnD = new Button("Btn D");
        
        // Define el Layout
        // PnlPal.setLayout(PosicionamientoSecuencial);
        // PnlPal.setLayout(PosicionamientoLEFT);
        // PnlPal.setLayout(PosicionamientoRIGHT);
        // PnlPal.setLayout(PosicionamientoCENTER);
        // PnlPal.setLayout(PosicionamientoLEADING);
        PnlPal.setLayout(PosicionamientoTRAILING);
        // Añade el componente Pnl al contenedor MyFrame
        MyFrame.add(PnlPal);
        // Añade los componentes PnlIzq y PnlDch al contenedor PnlPal
        PnlPal.add(BtnA);
        PnlPal.add(BtnB);
        PnlPal.add(BtnC);
        PnlPal.add(BtnD);
        
        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Paneles y FlowLayout()");
        MyFrame.setVisible(true);

    }
}