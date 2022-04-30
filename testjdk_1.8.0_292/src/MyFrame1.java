/*
Constructores de Frame
Frame()
Frame(GraphicsConfiguration gc)
Frame(String title)
Frame(String title, GraphicsConfiguration gc)

No hay ningún constructor de la clase que admita como parametro el tamaño de la ventana, 
por lo que podemos crear nuestro propio Frame que herede de Frame y ofrezca esta posibilidad
y que por defecto la haga visible

el constructor () se construye diferente que en MyFrame
elimino el constructor int, int 

*/

import java.awt.Frame;
public class MyFrame1 extends Frame{

    // constructores
    MyFrame1(){
        this("Ventana con MyFrame()", 400, 200);
    }
    MyFrame1(String titulo){
        // utilizo el método setTitle de la clase Frame para establecer el titulo
        this.setTitle(titulo);
        this.setVisible(true);
    }
    MyFrame1(String titulo, int width, int height){
        // utilizo el método MyFrame(String titulo) de esta clase
        this(titulo);
        this.setSize(width, height);
    }
}