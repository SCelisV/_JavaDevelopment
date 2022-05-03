/*
// Implementación en varias clases  de la Clase Formulario2.java
Este formulario de entrada de datos por medio del cual recibiremos información personal de usuarios

Parte superior: Nombres, Apellidos  y Nacionalidad
Zona Izq: Estado Civil con opciones de selección (sólo una)
Zona Dcha: Ciudad de residencia se presenta una lista con ciudades seleccionada por defecto (Madrid)
Zona Inferior: Botón de envio de datos

// Si no se ubieran definido los métodos DatosPersonales, EstadoCivil y Ciudades en la clase formulario, pasandoles el panel como parámetro, se debería definir los Paneles del Formulario2 en la clase como private static Panel PnlFormulario2 = new Panel();

*/

import java.awt.*;

public class Formulario2DatosPersonales {

    // propiedades
    private Panel PnlDatosPersonales = new Panel(new GridLayout(3,1));

    // Constructores
    Formulario2DatosPersonales(Color color){
        PnlDatosPersonales.setBackground(color);
        setDatosPersonales(PnlDatosPersonales);
    }
    Formulario2DatosPersonales() {
        this(Color.BLACK);
    }

    // return Pnl DatosPersonales
    public Panel getPanel() {
        return PnlDatosPersonales;
    }

    // set Pnl DatosPersonales
    public void setDatosPersonales(Panel panel){
        /* */
        // Campo Nombre
        Panel PnlNombre = new Panel();
        PnlNombre.setLayout(new FlowLayout(FlowLayout.LEFT));

        Label lblNombre = new Label("Nombre: ", Label.LEFT); // new Label("Nombre: ", 0)
        TextField txtNombre = new TextField("", 20);

        PnlNombre.add(lblNombre);
        PnlNombre.add(txtNombre);

        // Campo PrimerApellido
        Panel PnlPrimerApellido = new Panel();
        PnlPrimerApellido.setLayout(new FlowLayout(FlowLayout.LEFT));

        Label lblPrimerApellido = new Label("PrimerApellido: ", Label.LEFT); // new Label("PrimerApellido: ", 0)
        TextField txtPrimerApellido = new TextField("", 20);

        PnlPrimerApellido.add(lblPrimerApellido);
        PnlPrimerApellido.add(txtPrimerApellido);

        // Campo SegundoApellido
        Panel PnlSegundoApellido = new Panel();
        PnlSegundoApellido.setLayout(new FlowLayout(FlowLayout.LEFT));

        Label lblSegundoApellido = new Label("SegundoApellido: ", Label.LEFT); // new Label("SegundoApellido: ", 0)
        TextField txtSegundoApellido = new TextField("", 20);

        PnlSegundoApellido.add(lblSegundoApellido);
        PnlSegundoApellido.add(txtSegundoApellido);

        // Adiciona los Pnl* al PnlDatosPersonales
        panel.add(PnlNombre);
        panel.add(PnlPrimerApellido);
        panel.add(PnlSegundoApellido);
        /* */
    }

}
