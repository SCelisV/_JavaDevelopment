/*
// Implementación en varias clases  de la Clase Formulario.java
Este formulario de entrada de datos por medio del cual recibiremos información personal de usuarios

Parte superior: Nombres, Apellidos  y Nacionalidad
Zona Izq: Estado Civil con opciones de selección (sólo una)
Zona Dcha: Ciudad de residencia se presenta una lista con ciudades seleccionada por defecto (Madrid)
Zona Inferior: Botón de envio de datos

// Si no se ubieran definido los métodos Ciudades, Ciudades y Ciudades en la clase formulario, pasandoles el panel como parámetro, se debería definir los Paneles del Formulario en la clase como private static Panel PnlFormulario = new Panel();

*/

import java.awt.*;

public class FormularioCiudades {

    // propiedades
    private Panel PnlCiudades = new Panel();   

    // Constructores
    FormularioCiudades(){
        this(Color.RED);
        setCiudades(PnlCiudades);
    }
    FormularioCiudades(Color color){
        PnlCiudades.setBackground(color);
        setCiudades(PnlCiudades); 

    }

    // return Pnl Ciudades
    public Panel getPanel() {
        return PnlCiudades;
    }

    // set Pnl Ciudades
    public void setCiudades(Panel panel){

        /* */
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

        /* */
    }
}
