/*
Contiene un constructor que permite indicar el color de los botones y el visor (campo de texto) de la calculdora.
El parámetro Color sirve para que el método mouseExited restituya el color de cada botón al salir del mismo
el método mouseEntered pone de color verde cada botón en el que se coloca el puntero del ratón
El parámetro TextField sirve para que el método mouseclicked ponga un mensaje en el visor de resultados en una situación erronea (OpcionErronea)

*/
import java.awt.event.*;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;

public class ControlRaton implements MouseListener{

    // propiedades
    private TextField TextField;
    private Color ColorButton;

    // constructores
    // Color - Constructor de la clase
    ControlRaton(TextField textField, Color color){
        this.TextField = textField;
        this.ColorButton = color;
    }
    public void mouseClicked(MouseEvent e){

        // Obtiene el botón que genera el evento, 
        Button button = (Button) e.getSource();
        // Extrae el primer carácter de su etiqueta (0,1,2,3,4,5,6,7,8,9,+,-,*,/,=,.)
        char Char = button.getLabel().charAt(0);
        System.out.print(Char);
        // se le pasa a un método para que lo procese
        // se controla la excepción del tipo OpcionErronea cuando el botón es inadecuado
        // y se coloca un mensaje de error sobre el visor y se le asigna el color ROJO al botón pulsado.
        /*
        try{

        } catch(OpcionErronea e){
            TextField.setText(e.getMessage());
            button.setBackground(Color.GREEN);
        }
        */

    }
    // Pone los botones por los que se pasa en color verde (al desplazarse con el raton)
    public void mouseEntered(MouseEvent e){

        // Cuando el puntero del ratón se coloque sobre el botón, 
        // el color de fondo del mismo se pondrá en verde
        Button button = (Button) e.getSource();
        button.setBackground(Color.GREEN);
        // e.getComponent().setBackground(Color.RED);

    }
    // Pone los botones en su color original (constructor) cuando sale de cada uno de ellos
    public void mouseExited(MouseEvent e){

        // Cuando el puntero del ratón salga de el botón, 
        // el color de fondo del mismo se pondrá en gris.
        Button button = (Button) e.getSource();
        button.setBackground(ColorButton);

    }   
    public void mousePressed(MouseEvent e){
    }
    public void mouseReleased(MouseEvent e){
    }
}
