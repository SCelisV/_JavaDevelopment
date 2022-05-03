/*
List, nos permite desplazarnos por una secuencia de elementos de texto.
Se puede configurar para selecciones múltiples o bien para que sólo se pueda seleccionar un único elemento de la lista
List()
List(int rows)
List(int rows, boolean multipleMode)
Se puede variar en tiempo de ejecución el modo de selección de elementos, utilizando el método setMultipleMode(boolean setmultiplemode)
Se puede incorporar elementos de texto en una lista mediante 
add(String elemento) se añade el elemento al final de la lista ó 
add(String elemento, int Posicion) se añade el elemento en una posicion determinada.

*/

import java.awt.*;

public class PruebaClassList {

    public static void main(String[] args){

         // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class List");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel(new GridLayout(6,1));

        List list = new List(5, false);

        list.add("Tenerife");
        list.add("Lanzarote");
        list.add("Gran Canaria");
        list.add("Hierro");
        list.add("La Gomera");
        list.add("Fuerteventura");
        list.add("La Palma");

        PPal.add(list);
        Frame.add(PPal);
    }
    
}
