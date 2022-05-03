/*
Checkbox se puede encontrar en dos posibles estados: activado (true), desactivado (false).
Cuando se pulsa en una caja de verificación se conmuta de estado.

Constructores
Checkbox()
Checkbox(String label)
Checkbox(String label, boolean state)
Checkbox(String label, boolean state, CheckboxGroup group)
Checkbox(String label, CheckboxGroup group, boolean state)

métodos:
setLabel(String etiqueta)
SetState(boolean estado)

*/
import java.awt.*;
public class PruebaClassCheckbox {
    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class Checkbox");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel(new GridLayout(6,1));

        Checkbox cb_AireAcondicionado = new Checkbox("Aire Acondicionado", true);
        Checkbox cb_FarosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox cb_PinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        Checkbox cb_LlantasAleacion = new Checkbox("Llantas de Aleación", true);
        Checkbox cb_TapiceriaCuero = new Checkbox();
        cb_TapiceriaCuero.setLabel("Tapiceria de Cuero");
        cb_TapiceriaCuero.setState(true);
        Checkbox cb_FarosAntiniebla = new Checkbox("Faros Antiniebla", false);

        PPal.add(cb_AireAcondicionado);
        PPal.add(cb_FarosAntiniebla);
        PPal.add(cb_PinturaMetalizada);
        PPal.add(cb_FarosXenon);
        PPal.add(cb_LlantasAleacion);
        PPal.add(cb_TapiceriaCuero);
        Frame.add(PPal);
    }
    
}
