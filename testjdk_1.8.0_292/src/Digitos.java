/*
Crea un panel en el que introduce 12 botones.
El panel es accesible mediante el método getPanel()
Los botones son accesibles mediante el método getButtons()
El color de los botones se determina a través de la llamada al constructor con parámetro
El constructor vacio asigna el color gris
Interfaz GUI:
| ----- ----- ----- |
| | 0 | | 1 | | 2 | |     -> 0*3+0;   0*3+1;    0*3+2;
| ----- ----- ----- |
| ----- ----- ----- |
| | 3 | | 4 | | 5 | |     -> 1*3+0;   1*3+1;    1*3+2;
| ----- ----- ----- |
| ----- ----- ----- |
| | 6 | | 7 | | 8 | |     -> 2*3+0;   2*3+1;    2*3+2;
| ----- ----- ----- |
| ----- ----- ----- |
| | 9 | | . | | = | |     ->     9;       .;        =;
| ----- ----- ----- |
---------------------
*/
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

public class Digitos {

    // propiedades

    // Crea un panel en el que introduce 12 botones.
    private Panel PnlDigitos = new Panel();
    private final int NUM_DIGITOS=12;
    private Button[] Botones = new Button[NUM_DIGITOS];

    // constructores
    // El constructor vacio asigna el color gris
    Digitos(){
        this(Color.LIGHT_GRAY);
    }

    // El color de los botones se determina a través de la llamada al constructor con parámetro 
    Digitos(Color colorBotones){
        GridLayout LayoutBotones=new GridLayout(4,3);
        // filas del gridlayout
        for(int fila=0; fila<3; fila++){

            // columnas del gridlayout
            for(int columna=0; columna<3; columna++){
                // 0,1,2,3,4,5,6,7,8,9,.,=
                Botones[fila*3+columna] = new Button(String.valueOf(fila*3+columna));
            }
        }
        Botones[9] = new Button("9");
        Botones[10] = new Button(".");
        Botones[11] = new Button("=");

        PnlDigitos.setLayout(LayoutBotones);
        for (int i=0; i<NUM_DIGITOS; i++){
            Botones[i].setBackground(colorBotones);
            PnlDigitos.add(Botones[i]);
        }

    }

    // métodos
    // El panel es accesible mediante el método getPanel()
    public Panel getPanel() {
        return PnlDigitos;
    }
    // Los botones son accesibles mediante el método getButtons()
    public Button[] getButtons(){
        return Botones;
    }
    
}
