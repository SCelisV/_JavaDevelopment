package JavaTutorials.poo;

public class Dog {

    /* estados */
    String nombre = "Elliot";
    String color; 
    public final String RAZA = "Golden Retriever";
    boolean hambre;

    /* comportamientos */
    void ladrar(){};
    void buscar(){};
    void moverlacola(){};
    void querermimitos(){};

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return this.nombre;
    }
    
        public static void main(String[] args) {
        
        Dog Elliot = new Dog();
        Dog Lenon = new Dog();

        Lenon.setNombre("Lenon");

        System.out.println("El nombre de mi perro es: " + Elliot.nombre); // El nombre de mi perro es: Elliot
        System.out.println("La raza de mi perro es: " + Elliot.RAZA); // La raza de mi perro es: Golden Retriever
        System.out.println("El nombre del perrete de Marta es: " + Lenon.getNombre()); // El nombre del perrete de Marta es: Lenon
    }
}
