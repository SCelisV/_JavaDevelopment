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
import java.awt.Button;
import java.awt.GridLayout;

public class PruebaClassPanelGridLayout2{
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        
        // Asociar el Layout al Frame
        MyFrame.setLayout(new GridLayout(3,2));

        // Crear n Botones; n=6 y Asigna los Botones al Frame
        Button[] Botones = new Button[6];
        for(int i=0;i<Botones.length; i++){
            MyFrame.add(new Button("Botón" + i));
        }

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con GridLayout");
        MyFrame.setVisible(true);

    }
}