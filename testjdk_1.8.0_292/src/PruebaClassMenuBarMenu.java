/*
Constructs
MenuBar()
*/
import java.awt.*;

public class PruebaClassMenuBarMenu{

    public static void main(String[] args){

     // Variables para crear la ventana
     String titulo = "Empresa -  Ventana que contiene un MenuBar";
     int width = 300, height = 600;
  
     MyFrame1 Frame = new MyFrame1(titulo, width, height);

     MenuBar mb = new MenuBar();
     Menu m = new Menu("Menu Principal");

     m.add("Opc 1");

     mb.add(m);
     Frame.setMenuBar(mb);

    }
}