/*
Crea un panel en el que introduce 4 botones.
El panel es accesible mediante el método getPanel()
Los botones son accesibles mediante el método getButtons()
El color de los botones se determina a través de la llamada al constructor con parámetro
El constructor vacio asigna el color gris
Interfaz GUI:

| ----- |
| | + | |
| ----- |
| ----- |
| | - | |
| ----- |
| ----- |
| | * | |
| ----- |
| ----- |
| | / | |
| ----- |
---------
*/
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;


public class Operadores {

    // propiedades
    // Crea un panel en el que introduce 4 botones.
    private Panel PnlOperadores = new Panel();
    private final int NUM_OPERADORES = 4;
    private Button[] Botones = new Button[NUM_OPERADORES];


    // constructores

    // El constructor vacio asigna el color gris
    Operadores(){
        this(Color.LIGHT_GRAY);
    }
    // El color de los botones se determina a través de la llamada al constructor con parámetro
    Operadores(Color colorBotones){

        // Crear el layout
        GridLayout LayoutBotones = new GridLayout(NUM_OPERADORES,1);

        // Crear los botones
        Botones[0] = new Button("+");
        Botones[1] = new Button("-");
        Botones[2] = new Button("*");
        Botones[3] = new Button("/");

        // Establecer el Layout (distribución)
        PnlOperadores.setLayout(LayoutBotones);

        // Adicionar los botones al panel
        // Establecer el color de los botones
        for (int i=0; i<NUM_OPERADORES; i++){
            Botones[i].setBackground(colorBotones);
            PnlOperadores.add(Botones[i]);
        }
    }

    // métodos
    // El panel es accesible mediante el método getPanel()
    public Panel getPanel(){
        return PnlOperadores;
    }
    // Los botones son accesibles mediante el método getButtons()
    public Button[] getButtons(){
        return Botones;
    }
    // Devuelve el Color original de los botones
    public Color getColor(){
        return (Color.LIGHT_GRAY);
    }
}
