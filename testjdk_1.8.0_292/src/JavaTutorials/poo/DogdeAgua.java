package JavaTutorials.poo;

public class DogdeAgua implements DogI{

    public void ladrar() {
        System.out.println("GUAU");
    }

    public void buscar() {
        System.out.println("Buscar");
    }

    /* 
     * Si no implemento un método que este definido en la interfaz genera este error...
     * The type DogElliot must implement the inherited abstract method DogI.moverlacola()Java(67109264)
    */ 
    public void moverlacola() {
        System.out.println("Mover el culito");
    }
}
