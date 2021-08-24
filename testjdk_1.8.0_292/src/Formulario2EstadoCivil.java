/*
// Implementación en varias clases  de la Clase Formulario2.java
Este formulario de entrada de datos por medio del cual recibiremos información personal de usuarios

Parte superior: Nombres, Apellidos  y Nacionalidad
Zona Izq: Estado Civil con opciones de selección (sólo una)
Zona Dcha: Ciudad de residencia se presenta una lista con ciudades seleccionada por defecto (Madrid)
Zona Inferior: Botón de envio de datos

// Si no se ubieran definido los métodos EstadoCivil, EstadoCivil y Ciudades en la clase formulario, pasandoles el panel como parámetro, se debería definir los Paneles del Formulario2 en la clase como private static Panel PnlFormulario2 = new Panel();

*/

import java.awt.*;

public class Formulario2EstadoCivil {

    // propiedades
    private Panel PnlEstadoCivil = new Panel(new GridLayout(5,1));   

    // Constructores
    Formulario2EstadoCivil(){
        this(Color.BLACK);
    }
    Formulario2EstadoCivil(Color color){
        PnlEstadoCivil.setBackground(color);
        setEstadoCivil(PnlEstadoCivil);
    }

    // return Pnl EstadoCivil
    public Panel getPanel() {
        return PnlEstadoCivil;
    }

    // set Pnl EstadoCivil
    public void setEstadoCivil(Panel panel){

        /* */
        CheckboxGroup ChkbGEstadoCivil = new CheckboxGroup();

        Checkbox ChkSoltero = new Checkbox(" Soltero", false, ChkbGEstadoCivil);
        Checkbox ChkCasado = new Checkbox(" Casado", false, ChkbGEstadoCivil);
        Checkbox ChkDivorciado = new Checkbox(" Divorciado", false, ChkbGEstadoCivil);
        Checkbox ChkSeparado = new Checkbox(" Separado", false, ChkbGEstadoCivil);
        Checkbox ChkOtro = new Checkbox("Otro", true, ChkbGEstadoCivil);

        // Adiciona los Pnl* al PnlEstadoCivil
        panel.add(ChkSoltero);
        panel.add(ChkCasado);
        panel.add(ChkDivorciado);
        panel.add(ChkSeparado);
        panel.add(ChkOtro);

        /* */
    }
}
