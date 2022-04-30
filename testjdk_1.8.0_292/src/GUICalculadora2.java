/*
Implementa el interfaz GUI de Calculadora2
Los objetos FlowLayout pueden instanciarse con: 
 - posicionamiento centrado (FlowLayout.CENTER) - disposición por defecto/default
 - posicionamiento izquierdo (FlowLayout.LEFT)
 - posicionamiento derecho (FlowLayout.RIGHT)
*/
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;

public class GUICalculadora2 {

    // constructores
    // vacio
    GUICalculadora2(){

        String titulo="GUICalculadora2";
        int width=300;
        int height=300;

        // Frame
        MyFrame1 Frame = new MyFrame1(titulo, width, height);

        // Panel con disposición BorderLayout
        Panel PnlCalculadora = new Panel();
        // Define el Layout
        FlowLayout FLayout = new FlowLayout(FlowLayout.CENTER);
        // Establece el layout en el panel
        PnlCalculadora.setLayout(FLayout);

        // Instancia con controlador (Color) --> Crea las instancias con el controlador (Color)
        // Instancia de Resultados
        Resultados Resultados = new Resultados(Color.BLUE);
        // Instancia de Digitos
        Digitos Digitos = new Digitos(Color.CYAN);
        // Instancia de Operadores
        Operadores Operadores = new Operadores(Color.DARK_GRAY);

        // Añade los Paneles de cada instancia al Panel
        PnlCalculadora.add(Resultados.getPanel());
        PnlCalculadora.add(Digitos.getPanel());
        PnlCalculadora.add(Operadores.getPanel());

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
        // Asigno a cada boton de la instancia Digitos el Tratamiento de eventos de Botones
        for(int i=0; i<buttonsD.length; i++){
            buttonsD[i].addFocusListener(new ControlFoco(Color.CYAN));
            buttonsD[i].addMouseListener(new ControlRaton(textFieldR, Color.CYAN));

        }

        // Recupero los botones de la instancia Operadores
        Button[] buttonsO = Operadores.getButtons();
        // Asigno a cada boton de la instancia Operadores el Tratamiento de eventos de Botones
        for(int i=0; i<buttonsO.length; i++){
            buttonsO[i].addFocusListener(new ControlFoco(Color.DARK_GRAY));
            buttonsO[i].addMouseListener(new ControlRaton(textFieldR, Color.DARK_GRAY));
        }
    }
}

