/*
Constructores
Font hereda de Object
Font(Map<? extends AttributedCharacterIterator.Attribute,?> attributes)
Font(String name, int style, int size)
String name - Indica el tipo de letra con que se visualizará el texto(Serif, SensSerif, Monospaced... etc)
int style - Italica, negrilla, normal, Font.ITALIC, Font.BOLD, Font.PLAIN.. etc

*/
import java.awt.*;

public class PruebaClassFontColor{
    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class Font Color");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel();
        Panel Sencillo = new Panel();

        Font UnaFuente = new Font("SansSerif", Font.BOLD, 20);
        Font OtraFuente = new Font("Monospaced", Font.ITALIC, 40);


        Label lblOne = new Label("UnaFuente");
        lblOne.setFont(UnaFuente);
        lblOne.setBackground(Color.YELLOW);
        lblOne.setForeground(Color.BLUE);

        Label lblTwo = new Label("OtraFuente");
        lblTwo.setFont(OtraFuente);
        lblTwo.setBackground(Color.BLUE);
        lblTwo.setForeground(Color.YELLOW);

        Sencillo.add(lblOne);        
        Sencillo.add(lblTwo);        

        PPal.add(Sencillo);
        Frame.add(PPal);

    }
}