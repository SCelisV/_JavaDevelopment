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

se usa el método setMultipleMode
select(position), permite seleccionar por programa el elemento idicado por la posición que se le pasa como parámetro.
se numera a partir de cero.
*/

import java.awt.*;

public class PruebaClassListMultiple {

    public static void main(String[] args){

         // Variables para la creación del Frame
        String titulo = new String("Ventana de Prueba de Class List Multiple Mode");
        int width = 600;
        int height = 300;

        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        Panel PPal = new Panel(new GridLayout(6,1));

        List list = new List(3);
        list.setMultipleMode(true);

        list.add("Tenerife");
        list.add("Lanzarote");
        list.add("Gran Canaria");
        list.add("Hierro");
        list.add("La Gomera");
        list.add("Fuerteventura");
        list.add("La Palma");

        list.select(2);
        list.select(4);

        PPal.add(list);
        Frame.add(PPal);
    }
    
}
