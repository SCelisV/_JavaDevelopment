/*
Label permite situar un texto en un componente
Label()
Label(String text)
Label(String text, int alignment)

métodos 
setText(String text);
setAlignment(int alignment)
*/
import java.awt.*;

public class PruebaClassLabel{
    public static void main (String[] args){

        MyFrame1 MyFrame = new MyFrame1("Ventana con MyFrame1 y Label", 600, 200);
        Panel MyPnl = new Panel();
        Label lblTitulo = new Label("Este es un Lbl");
        Label Saludo = new Label("Hola", Label.LEFT);
        Label OtroSaludo = new Label ("Buenos días");
        OtroSaludo.setAlignment(Label.RIGHT);
        MyFrame.add(MyPnl);
        MyPnl.add(lblTitulo);
        MyPnl.add(Saludo);
        MyPnl.add(OtroSaludo);
    }
}