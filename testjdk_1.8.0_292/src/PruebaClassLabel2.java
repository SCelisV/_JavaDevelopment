/*
Label permite situar un texto en un componente
Label()
Label(String text)
Label(String text, int alignment)

métodos 
setText(String text);
setAlignment(int alignment)

Se combinan etiquetas con el uso de layouts.
Se instancia un Panel MyPnl con GridLayout (1 x 2)
Se adiciona un PnlIzq con disposición GridLayout 3x1 y 
un PnlDcho con disposición FlowLayout
Se crean Label y se adicionan a los paneles, 

*/
import java.awt.*;

public class PruebaClassLabel2{
    public static void main (String[] args){

        MyFrame1 Frame = new MyFrame1("Ventana con MyFrame1, Panel, GridLayout, FlowLayout y Labels", 600, 200);
        Panel Pnl = new Panel(new GridLayout(1,2));
        Panel PnlIzq = new Panel(new GridLayout(3,1));
        Panel PnlDcho = new Panel(new FlowLayout(FlowLayout.CENTER));
        Frame.add(Pnl);
        Pnl.add(PnlIzq);
        Pnl.add(PnlDcho);

        // Crea y Adiciona Labels

        PnlIzq.add(new Label("PnlIzq - lbl Center", Label.CENTER));
        PnlIzq.add(new Label("PnlIzq - lbl Left", Label.LEFT));
        PnlIzq.add(new Label("PnlIzq - lbl Right", Label.RIGHT));
        PnlDcho.add(new Label("PnlDcho - lbl Flow1"));
        PnlDcho.add(new Label("PnlDcho - lbl Flow2"));
        
    }
}