/*
Prueba la clase Operadores.java
*/
import java.awt.Color;
import java.awt.Button;
import java.awt.Panel;
//import java.awt

public class PruebaOperadores {

    public static void main(String[] args){

        // Variables para la creación del Frame
        String titulo = new String("Ventana que Prueba la clase Operadores");
        int width = 600;
        int height = 300;
                
        MyFrame Frame = new MyFrame(titulo, width, height);
        Panel PnlPpal = new Panel();

        // Crear una instancia de Operadores con el constructor vacio()
        // Operadores Operadores = new Operadores();

        // Crear una instancia de Operadores con el constructor Color
        Operadores Operadores = new Operadores(Color.WHITE);

        Panel PnlOperadores = Operadores.getPanel();
        Button[] Botones = Operadores.getButtons();

        // Adicionar los botones al panel 
        for (int i=0; i<Botones.length; i++){
            PnlOperadores.add(Botones[i]);
        }

        // Adicionar el panel al Frame
        PnlPpal.add(PnlOperadores);
        Frame.add(PnlPpal);

    }
    
}
