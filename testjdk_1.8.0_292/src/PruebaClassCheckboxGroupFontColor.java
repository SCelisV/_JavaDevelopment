/*
CheckboxGroup agrupa un conjunto de cajas de verificación. es SubClase de Object.
Al definir un grupo de botones de radio utilizamos varias instancias del componente Checkbox asociadas a un objeto CheckboxGroup
La activación de un elemento, implica directamente la desactivación automática de los demás botones del grupo, e decir no puede haber dos o más botones activos al mismo tiempo.

Sólo existe el constructor sin argumentos del objeto CheckboxGroup cbg = new CheckboxGroup();
Cada caja de verificación se puede asociar a un CheckboxGroup de dos posibles maneras:

Instanciando la caja de verificación con uno de los siguientes constructores:
Checkbox(String Etiqueta, boolean estado, CheckboxGroup GrupoDeBotonesDeRadio)
Checkbox(String Etiqueta, CheckboxGroup GrupoDeBotonesDeRadio, boolean estado) 

Utilizando el método setCheckboxGroup(CheckboxGroup GrupoDeBotonesDeRadio) sobre la caja de verificación

Se define un método setVisualization(Checkbox checkbox, Color color, Font font) para modificar (la fuente y el color) pasados como parametros, 
Se ha creado un objeto myFont para modificar la fuente por defecto. 

*/
import java.awt.*;
public class PruebaClassCheckboxGroupFontColor {

    private static void setVisualization(Checkbox checkbox, Color color, Font font){
        checkbox.setFont(font);
        checkbox.setForeground(color);
    }

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class CheckboxGroupFontColor");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel(new GridLayout(6,1));

        CheckboxGroup Colores = new CheckboxGroup();

        Checkbox Red = new Checkbox("Red", false, Colores);
        Checkbox Green = new Checkbox("Green", false, Colores);
        Checkbox Blue = new Checkbox("Blue", false, Colores);
        Checkbox Yellow = new Checkbox("Yellow", false, Colores);
        Checkbox Black = new Checkbox("Black", false, Colores);
        Checkbox Gray = new Checkbox("Gray", false, Colores);

        Font myFont = new Font("SansSerif", Font.PLAIN, 25);

        setVisualization(Red, Color.RED, myFont);
        setVisualization(Green, Color.GREEN, myFont);
        setVisualization(Blue, Color.BLUE, myFont);
        setVisualization(Yellow, Color.YELLOW, myFont);
        setVisualization(Black, Color.BLACK, myFont);
        setVisualization(Gray, Color.GRAY, myFont);

        PPal.add(Red);
        PPal.add(Blue);
        PPal.add(Green);
        PPal.add(Yellow);
        PPal.add(Black);
        PPal.add(Gray);

        Frame.add(PPal);




    }
    
}
