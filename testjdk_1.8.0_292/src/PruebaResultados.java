/*
Prueba la clase Resultados.java
*/
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;

public class PruebaResultados {

    public static void main(String... args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana que Prueba la clase Resultados");
        int width = 600;
        int height = 300;
                        
        MyFrame1 Frame = new MyFrame1(titulo, width, height);
        

        // Instanciar objetos de la clase Resultados con el constructor vacio
        // Resultados Resultados = new Resultados();

        // Instanciar objetos de la clase Resultados con el constructor Color
        Resultados Resultados = new Resultados(Color.BLACK);

        // Recuperar las propiedades de las clase
        Panel PnlPpal = Resultados.getPanel();
        TextField txtField = Resultados.getTextField();

        PnlPpal.add(txtField);
        Frame.add(PnlPpal);

    }
    
}
