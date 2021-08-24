/*
Constructores 
FileDialog(Frame parent)
FileDialog(Frame parent, String title)
FileDialog(Frame parent, String title, int mode)
FileDialog(Dialog parent)
FileDialog(Dialog parent, String title)
FileDialog(Dialog parent, String title, int mode)

métodos
módo Carga o Grabación
void 	setMode(int mode)
int 	getMode()
Para seleccionar por programa el fichero, o consultar cual es el fichero que ha sido seleccionado
void 	setFile(String file)
String 	getFile()
Para seleccionar el directorio inicial que utilizará el dialogo o consultarlo
String 	getDirectory()
void 	setDirectory(String dir)
Para mostrar únicamente los ficheros que pasan el filtro
FilenameFilter 	getFilenameFilter()
void 	setFilenameFilter(FilenameFilter filter)

*/

import java.awt.*;
public class PruebaClassFileDialog2{

    public static void main(String[] args){

     // Variables para crear la ventana
        String titulo = "Empresa -  Ventana que contiene un FileDialog - LOAD";
        int width = 600, height = 300;
     
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        FileDialog fd = new FileDialog(Frame, "Cargar", FileDialog.LOAD);
        fd.setVisible(true);
    }

    
}
