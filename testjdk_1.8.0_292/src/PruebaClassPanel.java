/*
Los paneles son contenedores que puedn albergar componentes(incluidos otros paneles)
Dependiendo de la definición de pantalla en pixels que tenga el usuario la relación de tamaños entre los botones y la ventana puede variar.
Si los botones no caben a lo ancho, la disposicion secuencial hará "saltar de linea" al panel derecho.
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
public class PruebaClassPanel{
    public static void main(String[] args) {

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia de Panel
        Panel PnlPal = new Panel();
        Panel PnlIzq = new Panel();
        Panel PnlDch = new Panel();
        // Instancia de Botón
        Button BtnCorrer = new Button("Correr");
        Button BtnSaltar = new Button("Saltar");
        Button BtnDescansar = new Button("Descansar");
        
        // Añade el componente Pnl al contenedor MyFrame
        MyFrame.add(PnlPal);
        // Añade los componentes PnlIzq y PnlDch al contenedor PnlPal
        PnlPal.add(PnlIzq);
        PnlPal.add(PnlDch);
        // Añade los componente Btn al contenedor PnlIzq
        PnlIzq.add(BtnCorrer);
        PnlIzq.add(BtnSaltar);
        // Añade los componente Btn al contenedor PnlDch
        PnlDch.add(BtnDescansar);
        
        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Paneles");
        MyFrame.setVisible(true);
    }
}