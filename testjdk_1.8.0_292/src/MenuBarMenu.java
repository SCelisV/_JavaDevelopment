/*
Constructs
MenuBar()
Menu()
Menu(String label)
Menu(String label, boolean tearOff)
*/

import java.awt.*;
public class MenuBarMenu{

    public static void main(String[] args){

     // Variables para crear la ventana
     String titulo = "Empresa -  Ventana que contiene un MenuBar + Menu + Opciones";
     int width = 600, height = 300;
  
     MyFrame1 Frame = new MyFrame1(titulo, width, height);

     MenuBar MenuPpal = new MenuBar();

     // Submenu File
     Menu File = new Menu("File");

     // Opciones de Submenu - File
     File.add("New File");
     File.add("New Window");
     File.add("Save");
     File.add("Save As");

     // Submenu Edit
     Menu Edit = new Menu("Edit");
     // Opciones de Submenu - Edit
     Edit.add("Undo");
     Edit.add("Redo");
     Edit.add("Cut");
     Edit.add("Copy");
     Edit.add("Paste");

     // adiciona los Menus al MenuBar
     MenuPpal.add(File);
     MenuPpal.add(Edit);

     // set / add el MenuBar al Frame
     Frame.setMenuBar(MenuPpal);

    }
}