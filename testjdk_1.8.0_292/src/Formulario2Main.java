import java.awt.*;

public class Formulario2Main {

    // Variables para crear la ventana
    private static String titulo = "Empresa - Formulario2 de entrada de datos - Main";
    private static int width = 300, height = 600;
    
    private static MyFrame1 Frame = new MyFrame1(titulo, width, height);
    private static Panel PnlFormulario2 = new Panel();

        
    public static void main(String[] args){

        PnlFormulario2.setLayout(new BorderLayout());

        Formulario2DatosPersonales DatosPersonales = new Formulario2DatosPersonales(Color.ORANGE);
        Formulario2EstadoCivil EstadoCivil = new Formulario2EstadoCivil(Color.YELLOW);
        Formulario2Ciudades Ciudades = new Formulario2Ciudades(Color.GREEN);

        // Add de los Paneles al Formulario2 y a la Ventana

        PnlFormulario2.add(DatosPersonales.getPanel(), BorderLayout.NORTH);
        PnlFormulario2.add(EstadoCivil.getPanel(), BorderLayout.WEST);
        PnlFormulario2.add(Ciudades.getPanel(), BorderLayout.EAST);
        PnlFormulario2.add(new Button("Enviar"),BorderLayout.SOUTH);
        /**/
        Frame.add(PnlFormulario2);

    }
}
