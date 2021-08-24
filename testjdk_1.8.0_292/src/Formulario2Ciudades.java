/*
// Implementación en varias clases  de la Clase Formulario2.java
Este formulario de entrada de datos por medio del cual recibiremos información personal de usuarios

Parte superior: Nombres, Apellidos  y Nacionalidad
Zona Izq: Estado Civil con opciones de selección (sólo una)
Zona Dcha: Ciudad de residencia se presenta una lista con ciudades seleccionada por defecto (Madrid)
Zona Inferior: Botón de envio de datos

// Si no se ubieran definido los métodos Ciudades, Ciudades y Ciudades en la clase formulario, pasandoles el panel como parámetro, se debería definir los Paneles del Formulario2 en la clase como private static Panel PnlFormulario2 = new Panel();

*/

import java.awt.*;

public class Formulario2Ciudades {

    // propiedades
    private Panel PnlCiudades = new Panel();   

    // Constructores
    Formulario2Ciudades(){
        this(Color.BLACK);
    }
    Formulario2Ciudades(Color color){
        PnlCiudades.setBackground(color);
        setCiudades(PnlCiudades);
    }

    // return Pnl Ciudades
    public Panel getPanel() {
        return PnlCiudades;
    }

    // set Pnl Ciudades con List
 
   public void setCiudades(Panel panel){

        /* */
        Choice chcCiudades = new Choice();

        chcCiudades.add("Sevilla");
        chcCiudades.add("Barcelona");
        chcCiudades.add("Madrid");
        chcCiudades.add("Valencia");
        chcCiudades.add("Santiago de Compostela");
        chcCiudades.add("Valladolid");
        chcCiudades.add("Vitoria");
        chcCiudades.add("Las Palmas de Gran Canaria");
        chcCiudades.add("Santa Cruz de Tenerife");
        chcCiudades.add("Toledo");
        chcCiudades.add("Murcia");
        chcCiudades.add("Zaragoza");
        chcCiudades.add("Palma");
        chcCiudades.add("Mérida");
        chcCiudades.add("Oviedo");
        chcCiudades.add("Pamplona");
        chcCiudades.add("Santander");
        chcCiudades.add("Logroño");
        chcCiudades.add("Melilla");
        chcCiudades.add("Ceuta");
        chcCiudades.select("Madrid");


        panel.add(chcCiudades);        // Adiciona los Pnl* al PnlCiudades

        /* 
        List lstCiudades = new List(20);

        lstCiudades.add("Sevilla");
        lstCiudades.add("Barcelona");
        lstCiudades.add("Madrid");
        lstCiudades.add("Valencia");
        lstCiudades.add("Santiago de Compostela");
        lstCiudades.add("Valladolid");
        lstCiudades.add("Vitoria");
        lstCiudades.add("Las Palmas de Gran Canaria");
        lstCiudades.add("Santa Cruz de Tenerife");
        lstCiudades.add("Toledo");
        lstCiudades.add("Murcia");
        lstCiudades.add("Zaragoza");
        lstCiudades.add("Palma");
        lstCiudades.add("Mérida");
        lstCiudades.add("Oviedo");
        lstCiudades.add("Pamplona");
        lstCiudades.add("Santander");
        lstCiudades.add("Logroño");
        lstCiudades.add("Melilla");
        lstCiudades.add("Ceuta"); 
        
        lstCiudades.select(2);

        panel.add(lstCiudades);        // Adiciona los Pnl* al PnlCiudades

        */
    }

}
