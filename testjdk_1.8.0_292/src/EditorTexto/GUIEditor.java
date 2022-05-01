/*

Se trata de crear un editor de texto sencillo basado en la utilización de componentes AWT.
Usando Interfaces y Adaptadores de tratamiento de eventos.
El interfaz grafico que incorpora la app tendrá como mínimo:
- una barra de menus con algunas opciones
- área de edición de texto
- 
Se deberá permitir:
- cambiar el tamaño y el estido de la fuente del texto seleccionado
- funciones de upper y lower case 
- implementar buscar / reemplazar
- 

*/
package EditorTexto;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.FileDialog;
import java.lang.Object;
import java.awt.event.*;

public class GUIEditor{

    // propiedades
    // componentes AWT
    // Frame es más especializada que Window, 
    // MenuBar para incluir las opciones de menu
    // Panel principal de la app
  
    private Frame Frame = new Frame();

    private MenuBar MenuPpal = new MenuBar();

    private Panel PanelPpal = new Panel();

    // contiene 5 regiones cardinales.
    private BorderLayout BLayout = new BorderLayout();

     // Menu File
    private Menu File = new Menu("File");
     // Menu Edit
    private Menu Edit = new Menu("Edit");
     // Menu Selection
    private Menu Selection = new Menu("Selection");
     // Menu  Tools
    private Menu Tools = new Menu("Tools");
     // Menu  Test para adicionar un menu ya definido
    private Menu Test = new Menu("Test");

    // Area de Edition
    
    private TextArea TAreaPpal = new TextArea("", 500, 130, TextArea.SCROLLBARS_BOTH);

    // Position initial y final de selection de texto
    private int pIni = 0;
    private int pFin = 0;

    // Para establecer el tipo y color de texto 
    private final int TEXTO = 1;
    private final int FONDO = 1;
    private int TextoFondo = TEXTO;


    
    // constructores
    GUIEditor(){
        setLayout();
        setMenus();
        setTextArea();
        setPanels();
        setEvents();
        setFrame();
    }



    // métodos
    // Crea y visualiza el Frame
    public void setFrame(){

        // add el MenuBar al Frame
        Frame.setMenuBar(MenuPpal);
        // add el Panel al Frame
        Frame.add(PanelPpal);
        // utilizo los métodos de la clase Frame para establecer las caracteristicas del Frame
        Frame.setTitle("SCEditor"); 
        Frame.setVisible(true);
        Frame.setSize(600, 600);

    }

    // Crea la Barra de menus y adiciona los menus
    public void setMenus(){

        // add Opciones al Menu - File
        File.add("New File");
        File.add("Open File");
        File.add("Save");
        File.add("Save As");

        // add Opciones al Menu - Edit
        Edit.add("Undo");
        Edit.add("Redo");
        Edit.add("Cut");
        Edit.add("Copy");
        Edit.add("Paste");

        // add Opciones al Menu - Selection
        Selection.add("All");
        Selection.add("Search");
        Selection.add("Replace");

        // add Opciones al Menu - Tools
        Tools.add("Upper");
        Tools.add("Lower");

        // add un Menu en otro Menu
        Test.add(Tools);

        // add Menus al MenuBar
        MenuPpal.add(File);
        MenuPpal.add(Edit);
        MenuPpal.add(Selection);
        // Lo dejo comentado mientras se construye estará dentro del menú Test
        // MenuPpal.add(Tools);
        MenuPpal.add(Test);

    }

    public void setLayout(){

        // Establece el layout en el panel
        PanelPpal.setLayout(BLayout);
        
    }

    public void setPanels(){

        setTextArea();
    //PanelPpal.add(BLayout.NORTH);
    //PanelPpal.add(BLayout.CENTER);
    //PanelPpal.add(BLayout.EAST);
    //PanelPpal.add(BLayout.WEST);

    }

    public void setTextArea(){

        // TAreaPpal.append("1234567890123456789012");
        // Inserta el texto a partir de la posición dada
        // TAreaPpal.insert("12345678901234", 44);
        // add el TextArea al Panel

        PanelPpal.add(TAreaPpal,BLayout.CENTER);

    }

    // 
    public void setColor(){

    }

    
    // Control ventana - cierre de la ventana
    private class CerrarVentana extends WindowAdapter{

        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }

    // Implementa el tratamiento de las opciones de menu
    public class EventosMenu implements ActionListener{

        // métodos
        public void actionPerformed(ActionEvent e){
    
            if (e.getActionCommand().equals("New File")){

                System.out.println("New File");
                /*
                GUIEditor NewWindow = new GUIEditor();
                */
                return;

            }
            if (e.getActionCommand().equals("Open File")){

                System.out.println("Open File");
                /*
                FileDialog fd = new FileDialog(Frame, "Cargar", FileDialog.LOAD);
                fd.setVisible(true);
                fd.getFile();
                // ya veremos como se abre y como se lee
                System.out.println(fd.getFile());
                TAreaPpal.append(fd.getFile());
                */
                return;

            }
            if (e.getActionCommand().equals("Save")){

                System.out.println("Save");
                /*
                FileDialog fd = new FileDialog(Frame, "Guardar", FileDialog.SAVE);
                fd.setVisible(true);
                */
                return;
            
            } 
            if (e.getActionCommand().equals("Save As")){

                System.out.println("Save As");
                /*
                */
                return;

            }

        }
        
    }
    
    // Establece los eventos a los componentes
    public void setEvents(){

            // add los eventos de ventana
        Frame.addWindowListener(new CerrarVentana());
        // add el tratamiento de los eventos de menu a un componente
        File.addActionListener(new EventosMenu());

    }

}