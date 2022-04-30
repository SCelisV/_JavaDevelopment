import java.awt.*;

public class FormularioMain2 {

    // Variables para crear la ventana
    private static String titulo = "Empresa - Formulario de entrada de datos - Main";
    private static int width = 300, height = 600;
    
    private static MyFrame1 Frame = new MyFrame1(titulo, width, height);
    private static Panel PnlFormulario = new Panel();

        
    public static void main(String[] args){

        PnlFormulario.setLayout(new BorderLayout());

        FormularioDatosPersonales DatosPersonales = new FormularioDatosPersonales(Color.DARK_GRAY);
        FormularioEstadoCivil EstadoCivil = new FormularioEstadoCivil(Color.LIGHT_GRAY);
        FormularioCiudades Ciudades = new FormularioCiudades(Color.GRAY);

        // Add de los Paneles al Formulario y a la Ventana

        PnlFormulario.add(DatosPersonales.getPanel(), BorderLayout.NORTH);
        PnlFormulario.add(EstadoCivil.getPanel(), BorderLayout.WEST);
        PnlFormulario.add(Ciudades.getPanel(), BorderLayout.EAST);
        PnlFormulario.add(new Button("Enviar"),BorderLayout.SOUTH);
        /**/
        Frame.add(PnlFormulario);

    }
}
