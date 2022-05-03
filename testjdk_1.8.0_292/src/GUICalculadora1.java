/*
Implementa el interfaz GUI de Calculadora1

 El BorderLayout situa y dimensiona los componentes en 5 regiones cardinales:
 - NORTE (BorderLayout.NORTH), - CENTER derecho (BorderLayout.CENTER- Oriente - ESTE (BorderLayout.EAST) - Usados en esta clase
 - SUR (BorderLayout.SOUTH), - Occidente - OESTE (BorderLayout.WEST), 

*/
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;

public class GUICalculadora1 {

    // constructores
    // vacio
    GUICalculadora1(){

        String titulo="GUICalculadora1";
        int width=150;
        int height=150;

        // Frame
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // Panel con disposición BorderLayout
        Panel PnlCalculadora = new Panel();
        // Define el Layout
        BorderLayout BLayout = new BorderLayout();
        // Establece el layout en el panel
        PnlCalculadora.setLayout(BLayout);

        // Instancia con controlador vacio ()
        // Instancia de Resultados
        Resultados Resultados = new Resultados();
        // Instancia de Digitos
        Digitos Digitos = new Digitos();
        // Instancia de Operadores
        Operadores Operadores = new Operadores();

        // Añade los Paneles de cada instancia al Panel
        PnlCalculadora.add(Resultados.getPanel(), BLayout.NORTH);
        PnlCalculadora.add(Digitos.getPanel(), BLayout.CENTER);
        PnlCalculadora.add(Operadores.getPanel(), BLayout.EAST);

        // Añade el Panel al Frame
        Frame.add(PnlCalculadora);

        // Tratamiento de eventos de Ventana
        Frame.addWindowListener(new ControlVentana());

        // Recupero el texto de la instancia Resultados
        TextField textFieldR = Resultados.getTextField();

        // Procesa Eventos
        ProcesaEvento Procesar = new ProcesaEvento(textFieldR);

        // Recupero los botones de la instancia Digitos
        Button[] buttonsD = Digitos.getButtons();
        Color ColorD = Digitos.getColor();
        // Asigno a cada boton de la instancia Digitos el Tratamiento de eventos de Botones
        for(int i=0; i<buttonsD.length; i++){
            buttonsD[i].addFocusListener(new ControlFoco(ColorD));
            buttonsD[i].addMouseListener(new ControlRaton(textFieldR, ColorD));
        }

        // Recupero los botones de la instancia Operadores
        Button[] buttonsO = Operadores.getButtons();
        Color ColorO = Operadores.getColor();
        // Asigno a cada boton de la instancia Operadores el Tratamiento de eventos de Botones
        for(int i=0; i<buttonsO.length; i++){
            buttonsO[i].addFocusListener(new ControlFoco(ColorO));
            buttonsO[i].addMouseListener(new ControlRaton(textFieldR, ColorO));
        }
    }
}

