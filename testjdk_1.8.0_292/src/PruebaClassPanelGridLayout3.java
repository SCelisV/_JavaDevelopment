/*
Para establecer una disposición de manera explicita, podemos recurrir al método setLayout(heredado de Container).
Instanciar nuestro panel indicando directamente el layout deseado. GridLayout(filas, columnas)

Panel MiPanel = new Panel (new GridLayout(2,3));
OtroPanel.setLayout(new GridLayout(2,3));
ó
GridLayout MiGL = new GridLayout(2,3);
MiPanel.setLayout(MiGL);
ó
GridLayout MiGL = new GridLayout();
MiGL.setRows(2);
MiGL.setColumns(3);

El GridLayout crea una ventana con 6 botones dispuestros matricialmente 2 filas y 3 columnas

Asociamos directamente un GridLayout de 3x2 al Frame.


*/
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PruebaClassPanelGridLayout3{
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        // Instancia y asigna el BorderLayout al Pnl
        Panel MyPnl = new Panel(new BorderLayout());
        
        // Asociar el Layout al Frame
        MyFrame.setLayout(new GridLayout(2,3));

        MyPnl.add(new Button("NORTH"), BorderLayout.NORTH);
        MyPnl.add(new Button("CENTER"), BorderLayout.CENTER);
        MyPnl.add(new Button("SOUTH"), BorderLayout.SOUTH);

        MyFrame.add(MyPnl);
        // Crear n Botones; n=6 y Asigna los Botones al Frame
        for(int i=1;i<6; i++){
            MyFrame.add(new Button("Botón" + i));
        }

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Panel Border y Grid Layout");
        MyFrame.setVisible(true);

    }
}