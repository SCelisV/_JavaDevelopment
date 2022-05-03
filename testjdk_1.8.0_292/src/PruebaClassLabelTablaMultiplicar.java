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
Se crea una tabla de multiplicar con labels del tipo: GridLayout(11,11)

 1   2   3   4   5   6   7   8   9  10
 2   4   6   8  10  12  14  16  18  20
 3
......
......
10  20  30  40  50  60  70  80  90 100
*/
import java.awt.*;

public class PruebaClassLabelTablaMultiplicar{
    public static void main (String[] args){

        MyFrame1 Frame = new MyFrame1("Tabla de Multiplicar con Labels GridLayout..", 600, 200);
        Panel Tabla = new Panel(new GridLayout(11,11));

        // Crea las cabeceras
        Label[] Cfilas = new Label[11];
        Label[] Ccolum = new Label[11];

        // Adiciona las filas a la tabla
        Tabla.add(new Label(""));
        for(int i = 1; i <= 10; i++){
            Cfilas[i] = new Label(""+i);
            Cfilas[i].setBackground(Color.red);
            Tabla.add(Cfilas[i]);
        }


        // Adiciona las columnas a la tabla
        for(int i = 1; i <= 10; i++){
            Ccolum[i] = new Label(""+i);
            Ccolum[i].setBackground(Color.red);
            Tabla.add(Ccolum[i]);
            for(int j = 1; j <= 10; j++){
                Tabla.add(new Label(""+i*j));
            }
        }
        
        Frame.add(Tabla);
    }
}