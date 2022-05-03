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
*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridLayout;

public class PruebaClassPanelGridLayout{
    public static void main(String[] args){

        // Instancia de Frame
        Frame MyFrame = new Frame();
        
        // Instancia de Panel
        Panel PnlPal = new Panel();
        // Instancia de GridLayout
        GridLayout Matriz = new GridLayout(2, 3);
        // Define el Layout
        PnlPal.setLayout(Matriz);

        // Crear n Botones; n=6
        Button[] Botones = new Button[6];
        for(int i=0;i<Botones.length; i++){
            Botones[i] = new Button("Botón: " + i);
        }

        // Adicionar los botones al panel
        PnlPal.setLayout(Matriz);
        for(int i=0; i<Botones.length; i++){
            PnlPal.add(Botones[i]);
        }

        MyFrame.add(PnlPal);

        MyFrame.setSize(400, 200);
        MyFrame.setTitle("Ventana con Paneles, GridLayout");
        MyFrame.setVisible(true);

    }
}