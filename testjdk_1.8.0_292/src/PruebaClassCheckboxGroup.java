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

*/
import java.awt.*;
public class PruebaClassCheckboxGroup {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class CheckboxGroup");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel(new GridLayout(6,1));

        CheckboxGroup Colores = new CheckboxGroup();

        PPal.add(new Checkbox("Red", false, Colores));
        PPal.add(new Checkbox("Green", false, Colores));
        PPal.add(new Checkbox("Blue", false, Colores));
        PPal.add(new Checkbox("Yellow", false, Colores));
        PPal.add(new Checkbox("Black", false, Colores));
        PPal.add(new Checkbox("Gray", false, Colores));


        Frame.add(PPal);




    }
    
}
