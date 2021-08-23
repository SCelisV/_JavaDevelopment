/*
TextField ó Campo de texto, es un componente que permite la edición de una línea de texto.
Sus constructores permiten que su tamaño tenga un número de columnas determinado y que el campo presente un texto inicial
TextField()
TextField(int columns)
TextField(String text)
TextField(String text, int columns)

Se crea un panel para cada campo de texto en donde se creará el label y el textField
Se instancian tres campos de texto:
Nombre, Apellidos y Nacionalidad

*/
import java.awt.*;
public class PruebaClassTextField2{
    public static void main (String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TextField GridLayout and FlowLayout");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PnlPpal = new Panel(new GridLayout(4,1));
        Panel PnlNombre = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel PnlAppe1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel PnlAppe2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel PnlNac = new Panel(new FlowLayout(FlowLayout.LEFT));

        Label lblNombre = new Label("Nombre: ", Label.LEFT);
        TextField txtfNombre = new TextField("", 12);
        Label lblPrimApellido = new Label("Primer apellido: ", Label.LEFT);
        TextField txtfPrimApellido = new TextField("", 30);
        Label lblSecApellido = new Label("Segundo apellido: ", Label.LEFT);
        TextField txtfSecApellido = new TextField("", 20);
        Label lblNacionalidad = new Label("Nacionalidad: ", Label.LEFT);
        TextField txtfNacionalidad = new TextField("Española", 12);

        PnlPpal.add(PnlNombre);
        PnlNombre.add(lblNombre);
        PnlNombre.add(txtfNombre);
        PnlPpal.add(PnlAppe1);
        PnlAppe1.add(lblPrimApellido);
        PnlAppe1.add(txtfPrimApellido);
        PnlPpal.add(PnlAppe2);
        PnlAppe2.add(lblSecApellido);
        PnlAppe2.add(txtfSecApellido);
        PnlPpal.add(PnlNac);
        PnlNac.add(lblNacionalidad);
        PnlNac.add(txtfNacionalidad);

        Frame.add(PnlPpal);

    }
}