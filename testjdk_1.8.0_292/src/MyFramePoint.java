/*
Constructores de Frame
Frame()
Frame(GraphicsConfiguration gc)
Frame(String title)
Frame(String title, GraphicsConfiguration gc)

No hay ningún constructor de la clase que admita como parametro el tamaño de la ventana, 
por lo que podemos crear nuestro propio Frame que herede de Frame y ofrezca esta posibilidad
y que por defecto la haga visible

Posicionamiento de múltiples Ventanas, setLocation, heredado de Component.
Sobrecargado y admite dos tipos de parámetros de entrada: 
es necesario suministrar las coordenadas bidimensionales.
*/

import java.awt.Frame;
import java.awt.Point;

public class MyFramePoint extends Frame{

    // constructores
    MyFramePoint(){
        this("Ventana con MyFrame() and setLocation", 600, 200, 100, 100);
    }
    MyFramePoint(String titulo){
        // utilizo el método setTitle de la clase Frame para establecer el titulo
        this.setTitle(titulo);
        this.setVisible(true);
    }
    MyFramePoint(String titulo, int width, int height){
        // utilizo el método MyFrame(String titulo) de esta clase
        this(titulo);
        this.setSize(width, height);
    }
    MyFramePoint(String titulo, int width, int height, int posx, int posy){
        // utilizo el método MyFrame(String titulo) de esta clase
        this(titulo, width, height);
        this.setLocation(new Point(posx, posy));
    }
}