/*
Crea un panel en el que introduce 1 campo de texto
El panel es accesible mediante el método getPanel()
El campo de texto es accesible mediante el método getTextField()
El color de los botones se determina a través de la llamada al constructor con parámetro
El constructor vacio asigna el color gris
Interfaz GUI:
---------------------------
|  _____________________  |
| |                     | |
| |_____________________| |
---------------------------
*/
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Color;
import java.awt.FlowLayout;

public class Resultados {

    // propiedades
    // Crea un panel en el que introduce 1 campo de texto
    private Panel PnlResultados = new Panel();
    // El campo de texto es accesible mediante el método getTextField()
    private TextField txtResultados = new TextField("",10);

    // constructores
    // El constructor vacio asigna el color gris
    Resultados(){
        this(Color.LIGHT_GRAY);
    }
    // El color de los botones se determina a través de la llamada al constructor con parámetro
    Resultados(Color colorTextField){

        // Definir el layout del panel
        FlowLayout LayoutResultados = new FlowLayout(FlowLayout.LEFT);

        // Establecer el layout al panel
        PnlResultados.setLayout(LayoutResultados);

        // Establecer el fondo de los resultados
        txtResultados.setForeground(colorTextField);
        
        // Adicionar el campo de texto al panel y habilitarlo
        PnlResultados.add(txtResultados);
        txtResultados.setEnabled(false);

    }

    // métodos
    // El panel es accesible mediante el método getPanel()
    public Panel getPanel() {
        return PnlResultados;
    }
    // El campo de texto es accesible mediante el método getTextField()
    public TextField getTextField(){
        return txtResultados;
    }
    
}
