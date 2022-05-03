/*
TextField ó Campo de texto, es un componente que permite la edición de una línea de texto.
Sus constructores permiten que su tamaño tenga un número de columnas determinado y que el campo presente un texto inicial
TextField()
TextField(int columns)
TextField(String text)
TextField(String text, int columns)

Se instancian tres campos de texto:
Nombre, Apellidos y Nacionalidad

*/
import java.awt.*;
public class PruebaClassTextField{
    public static void main (String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TextField");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        // FlowLayout(CENTER) por default
        Panel PnlPpal = new Panel(new FlowLayout());

        Label lblNombre = new Label("Nombre: ");
        TextField txtfNombre = new TextField("Digite el Nombre: ", 25);
        Label lblPrimApellido = new Label("Apellido: ");
        TextField txtfPrimApellido = new TextField("Digite el Primer Apellido: ", 30);
        Label lblSecApellido = new Label("Apellido: ");
        TextField txtfSecApellido = new TextField("Digite el Segundo Apellido: ", 30);
        Label lblNacionalidad = new Label("Nacionalidad: ");
        TextField txtfNacionalidad = new TextField("Española", 10);

        PnlPpal.add(lblNombre);
        PnlPpal.add(txtfNombre);
        PnlPpal.add(lblPrimApellido);
        PnlPpal.add(txtfPrimApellido);
        PnlPpal.add(lblSecApellido);
        PnlPpal.add(txtfSecApellido);
        PnlPpal.add(lblNacionalidad);
        PnlPpal.add(txtfNacionalidad);

        Frame.add(PnlPpal);

    }
}