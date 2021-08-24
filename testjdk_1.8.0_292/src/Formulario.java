/*
Este formulario de entrada de datos por medio del cual recibiremos información personal de usuarios

Parte superior: Nombres, Apellidos  y Nacionalidad
Zona Izq: Estado Civil con opciones de selección (sólo una)
Zona Dcha: Ciudad de residencia se presenta una lista con ciudades seleccionada por defecto (Madrid)
Zona Inferior: Botón de envio de datos

// Si no se ubieran definido los métodos DatosPersonales, EstadoCivil y Ciudades en la clase formulario, pasandoles el panel como parámetro, se debería definir los Paneles del Formulario en la clase como private static Panel PnlFormulario = new Panel();

*/

import java.awt.*;
public class Formulario {


    // método para preparar los datos personales
    private static void DatosPersonales(Panel PnlDatosPersonales){
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
        PnlDatosPersonales.add(PnlNombre);
        PnlDatosPersonales.add(PnlPrimerApellido);
        PnlDatosPersonales.add(PnlSegundoApellido);
        /* */
    }
    // método para preparar los datos del Estado Civil
    private static void EstadoCivil(Panel PnlEstadoCivil){
    /* */

        CheckboxGroup ChkbGEstadoCivil = new CheckboxGroup();

        Checkbox ChkSoltero = new Checkbox(" Soltero", false, ChkbGEstadoCivil);
        Checkbox ChkCasado = new Checkbox(" Casado", false, ChkbGEstadoCivil);
        Checkbox ChkDivorciado = new Checkbox(" Divorciado", false, ChkbGEstadoCivil);
        Checkbox ChkSeparado = new Checkbox(" Separado", false, ChkbGEstadoCivil);
        Checkbox ChkOtro = new Checkbox("Otro", true, ChkbGEstadoCivil);

        PnlEstadoCivil.add(ChkSoltero);
        PnlEstadoCivil.add(ChkCasado);
        PnlEstadoCivil.add(ChkDivorciado);
        PnlEstadoCivil.add(ChkSeparado);
        PnlEstadoCivil.add(ChkOtro);

    /**/
    }

    // método para preparar los datos de la list las Ciudades 
    private static void Ciudades(Panel PnlCiudades){
    /* */
        List lstCiudades = new List(20);

        lstCiudades.add("Sevilla");
        lstCiudades.add("Barcelona");
        lstCiudades.add("Madrid");
        lstCiudades.add("Valencia");
        lstCiudades.add("Santiago de Compostela");
        lstCiudades.add("Valladolid");
        lstCiudades.add("Vitoria");
        lstCiudades.add("Las Palmas de Gran Canaria");
        lstCiudades.add("Santa Cruz de Tenerife");
        lstCiudades.add("Toledo");
        lstCiudades.add("Murcia");
        lstCiudades.add("Zaragoza");
        lstCiudades.add("Palma");
        lstCiudades.add("Mérida");
        lstCiudades.add("Oviedo");
        lstCiudades.add("Pamplona");
        lstCiudades.add("Santander");
        lstCiudades.add("Logroño");
        lstCiudades.add("Melilla");
        lstCiudades.add("Ceuta");

        lstCiudades.select(2);


        PnlCiudades.add(lstCiudades);

    /* */ 
    }
    public static void main(String[] args){
        
        // Variables para crear la ventana
        String titulo = "Empresa - Formulario de entrada de datos";
        int width = 300, height = 600;
        
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // Definición de los Paneles del Formulario
        Panel PnlFormulario = new Panel();
        PnlFormulario.setLayout(new BorderLayout());
        Panel PnlDatosPersonales = new Panel();
        PnlDatosPersonales.setLayout(new GridLayout(3,1));   
        Panel PnlEstadoCivil = new Panel();
        PnlEstadoCivil.setLayout(new GridLayout(5, 2));
        Panel PnlCiudades = new Panel();
        
        // Métodos que Preparan los datos en cada formulario
        DatosPersonales(PnlDatosPersonales);
        EstadoCivil(PnlEstadoCivil);
        Ciudades(PnlCiudades);

        // Estetica de los formularios
        PnlDatosPersonales.setBackground(Color.ORANGE);        
        PnlEstadoCivil.setBackground(Color.YELLOW);
        PnlCiudades.setBackground(Color.GREEN);

        // Add de los Paneles al Formulario y a la Ventana
        PnlFormulario.add(PnlDatosPersonales, BorderLayout.NORTH);
        PnlFormulario.add(PnlEstadoCivil, BorderLayout.WEST);
        PnlFormulario.add(PnlCiudades, BorderLayout.CENTER);
        PnlFormulario.add(new Button("Enviar"),BorderLayout.SOUTH);
        /**/
        Frame.add(PnlFormulario);
        
    }
}
