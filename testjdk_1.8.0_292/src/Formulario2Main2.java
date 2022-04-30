import java.awt.*;

public class Formulario2Main2 {

    // Variables para crear la ventana
    private static String titulo = "Empresa - Formulario2 de entrada de datos - Main";
    private static int width = 600, height = 250;
    
    private static MyFrame1 Frame = new MyFrame1(titulo, width, height);
    private static Panel PnlFormulario2 = new Panel();

        
    public static void main(String[] args){

        PnlFormulario2.setLayout(new GridLayout(3,1));

        Panel PnlEstadoCivil_PnlCiudades = new Panel(new FlowLayout(FlowLayout.CENTER));
        Panel PnlButtons = new Panel();

        Formulario2DatosPersonales DatosPersonales = new Formulario2DatosPersonales();
        Formulario2EstadoCivil EstadoCivil = new Formulario2EstadoCivil(Color.YELLOW);
        Formulario2Ciudades Ciudades = new Formulario2Ciudades(Color.YELLOW);

        PnlEstadoCivil_PnlCiudades.add(EstadoCivil.getPanel());
        PnlEstadoCivil_PnlCiudades.add(Ciudades.getPanel());

        //PnlFormulario2.add(DatosPersonales.getPanel(), BorderLayout.NORTH);
        PnlFormulario2.add(DatosPersonales.getPanel());
        //PnlFormulario2.add(EstadoCivil.getPanel(), BorderLayout.WEST);
        //PnlFormulario2.add(PnlEstadoCivil_PnlCiudades.add(EstadoCivil.getPanel()));
        PnlFormulario2.add(PnlEstadoCivil_PnlCiudades);
        //PnlFormulario2.add(Ciudades.getPanel(), BorderLayout.EAST);
        //PnlFormulario2.add(PnlEstadoCivil_PnlCiudades.add(Ciudades.getPanel()));
        PnlFormulario2.add(PnlEstadoCivil_PnlCiudades);
        //PnlFormulario2.add(new Button("Enviar"),BorderLayout.SOUTH);
        PnlFormulario2.add(PnlButtons);
        /**/
        Frame.add(PnlFormulario2);

    }
}
