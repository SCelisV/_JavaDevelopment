/*
TextArea es una región que representa texto en una o varias líneas.
Puede ser editable o de solo lectura.
TextArea()
TextArea(int rows, int columns)
TextArea(String text)
TextArea(String text, int rows, int columns)
TextArea(String text, int rows, int columns, int scrollbars)
SCROLLBARS_BOTH, SCROLLBARS_VERTICAL_ONLY, SCROLLBARS_HORIZONTAL_ONLY, SCROLLBARS_NONE
métodos 
setRows(int Filas)
setColumns(int Columnas)
append(String Texto)
*/
import java.awt.*;
public class PruebaClassTextArea{
    public static void main (String[] args){
        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de TextArea");
        int width = 600;
        int height = 300;

        // Variables para el text area
        int FILAS = 3;
        int COLUM = 20;
        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PnlPpal = new Panel(new GridLayout(4,1));
        /*                               1234567890123456789012*/
        TextArea txtArea = new TextArea("1234567890123456789012", FILAS, COLUM, TextArea.SCROLLBARS_BOTH);
        /*              345678901234567890134567890*/
        txtArea.append("1234567890123456789012");
        // Inserta el texto a partir de la posición dada
        txtArea.insert("12345678901234", 44);

        PnlPpal.add(txtArea);
        Frame.add(PnlPpal);

    }
}