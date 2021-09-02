/*
    ProcesaEvento
    Se definen las propiedades static para evitar pasar la referencia de la instancia de la clase ProcesaEvento a la clase ControlRaton.

    Sin embargo, si en una misma aplicación se quiere crear más de una calculadora, ProcesaEvento no funcionaría ya que todas las calculadoras de la aplicación compartirían las mismas propiedades de estado.

    Si cada calculadora se encontrara en una app separada ProcesaEvento si funciona, ya que cada calculadora se ejecuta sobre una JVM diferente.

    Para evitar las propiedades static: 
    - pasar la referencia del objeto ProcesaEvento a la clase ControlRaton.
    - utilizar la referencia pasada en lugar del nombre de la clase cuando la invoca en el try (ProcesaEvento.charPulsado())
*/

import java.awt.TextField;

public class ProcesaEvento {

    // propiedades
    // Deben tener existencia durante toda la app,
    // No en variables LOCALES al método charPulsado().
    // static  para evitar pasar la referencia de la instancia de la clase ProcesaEvento a la clase ControlRaton, 
    // Cada calculadora esta en una app separada y se ejecutaría sobre una JVM diferente
    // Estado indica el valor númerico del estado en el que nos encontramos
    private static byte bEstado = 0;
    // Visor, contiene los últimos caracteres pulsados
    private static TextField txtFVisor;
    // Operador, indica el operador seleccionado por el usuario
    private static char chOperador=' ';
    // Operando1 y Operando2, valores a partir de los cuales se calcula el resultado
    private static double dOperando1=0d;
    private static double dOperando2=0d;

    // constructores
    ProcesaEvento(TextField txtfvisor){
        this.txtFVisor = txtfvisor;
    }

    // métodos
    // static  para evitar pasar la referencia de la instancia de la clase ProcesaEvento a la clase ControlRaton, 
    // Cada calculadora esta en una app separada y se ejecutaría sobre una JVM diferente
    public static void charPulsado(char choperador) throws OpcionErronea{

        // Inicializar el Visor de la calculadora
        if (txtFVisor.getText().equals("No valido"))
            txtFVisor.setText("");

        // consultar el estado en el que se encuentra ProcesaEvento()
        // Diagrama de estados - file Java.txt
        // En cada uno de los estados realizar las validaciones correspondientes ya sean por ejemplo:
        // inicializar y/ó
        // actualizar el estado y/o
        // actualizar el texto del visor y/ó
        // actualizar los operandos y/ó
        // calcular los resultados, 
        // asignar el resultado como primer operando para la siguiente operación
        // levantar la excepción cuando llega un caracter equivocado etc...
        switch (bEstado) {

            // sólo nos pueden pulsar "-","0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 0:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '-':
                        bEstado=1;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=2;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 1:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=2;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;                      
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar ".", "+", "-", "*", "/"
            case 2:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '.':
                        bEstado=3; 
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        bEstado=5;
                        chOperador=choperador;
                        dOperando1=Double.parseDouble(txtFVisor.getText());
                        txtFVisor.setText("");
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=2; 
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 3:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':                        
                        bEstado=4; 
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "+", "-", "*", "/"
            case 4:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        bEstado=5;
                        chOperador=choperador;
                        dOperando1=Double.parseDouble(txtFVisor.getText());
                        txtFVisor.setText("");
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=4;
                        txtFVisor.setText(txtFVisor.getText()+choperador);                
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "-","0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 5:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '-':
                        bEstado=6;
                        txtFVisor.setText(txtFVisor.getText()+choperador);                
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':                
                        bEstado=7;
                        txtFVisor.setText(txtFVisor.getText()+choperador);                
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 6:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=7;
                        txtFVisor.setText(txtFVisor.getText()+choperador);                
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar ".", "="
            case 7:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '.':
                        bEstado=8;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    case '=':
                        bEstado=10;
                        dOperando2=Double.parseDouble(txtFVisor.getText());
                        double dResultado = Resultado();
                        txtFVisor.setText(String.valueOf(dResultado));
                        dOperando1=dResultado;
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=7;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" 
            case 8:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        bEstado=9;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
            // sólo nos pueden pulsar "="
            case 9:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '=':
                        bEstado=10;
                        dOperando2=Double.parseDouble(txtFVisor.getText());
                        double dResultado = Resultado();
                        txtFVisor.setText(String.valueOf(dResultado));
                        dOperando1=dResultado;
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':                
                        bEstado=9;
                        txtFVisor.setText(txtFVisor.getText()+choperador);
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
           // sólo nos pueden pulsar "+", "-", "*", "/"
            case 10:
                // consultar el caracter que se ha pulsado y se actua en consecuencia
                switch (choperador) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        bEstado=5;
                        chOperador=choperador;
                        txtFVisor.setText("");
                        break;
                    default:
                        Inicializar();
                        throw new OpcionErronea();
                        // break;
                }
                break;
        }

    }

    // Inicializa las variable de la clase
    private static void Inicializar(){
        bEstado=0;
        txtFVisor.setText("");
        chOperador=' ';
        dOperando1=0d;
        dOperando2=0d;
    }
    // Devuelve el resultado de la operación entre los operandos
    private static double Resultado(){
        switch (chOperador) {
            case '+':
                return dOperando1+dOperando2;
            case '-':
                return dOperando1-dOperando2;
            case '*':
                return dOperando1*dOperando2;
            case '/':
                return dOperando1/dOperando2;
            default:
                return 0d;
        }

    }
}
