/*
Constructores de Frame
Frame()
Frame(GraphicsConfiguration gc)
Frame(String title)
Frame(String title, GraphicsConfiguration gc)

No hay ningún constructor de la clase que admita como parametro el tamaño de la ventana, 
por lo que podemos crear nuestro propio Frame que herede de Frame y ofrezca esta posibilidad
y que por defecto la haga visible

*/

import java.awt.Frame;
public class MyFrame extends Frame{

    // constructores
    MyFrame(){
        this.setTitle("Ventana con MyFrame()");
        this.setSize(400, 200);
        this.setVisible(true);
    }
    MyFrame(String titulo){
        // utilizo el método setTitle de la clase Frame para establecer el titulo
        this.setTitle(titulo);
        this.setVisible(true);
    }
    MyFrame(int width, int height){
        // utilizo el método setSize de la clase Frame para establecer el tamaño
        this.setSize(width, height);
        this.setVisible(true);
    }

    MyFrame(String titulo, int width, int height){
        // utilizo el método MyFrame(String titulo) de esta clase
        this(titulo);
        this.setSize(width, height);
    }
}