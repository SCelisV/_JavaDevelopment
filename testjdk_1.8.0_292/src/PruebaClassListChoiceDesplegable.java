/*
Choise presenta un ménu desplegable de posibilidades.
La posibilidad seleccionada aparece como título del menú.
No existe la posibilidad de selección múltiple
Constructor
Choice()
sus elementos se añaden el método add(String elemento)

*/

import java.awt.*;

public class PruebaClassListChoiceDesplegable {

    public static void main(String[] args){

         // Variables para la creación del Frame
         String titulo = new String("Ventana de Prueba de Class List Desplegable Choise");
         int width = 600;
         int height = 300;
 
         MyFrame1 Frame = new MyFrame1(titulo, width, height);
         Panel PPal = new Panel(new GridLayout(6,1));

         Choice choice = new Choice();

         choice.add("Alicante");
         choice.add("Avila");
         choice.add("Granada");
         choice.add("Segovia");
         choice.add("Sevilla");
         choice.add("Toledo");


         PPal.add(choice);
         Frame.add(PPal);


    }
    
}
