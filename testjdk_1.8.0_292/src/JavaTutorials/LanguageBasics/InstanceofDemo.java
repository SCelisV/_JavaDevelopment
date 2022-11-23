/*
 * define una clase padre (llamada Padre), 
 * una interfaz simple (llamada MiInterfaz), 
 * y una clase hija (llamada Hijo) que hereda del padre e implementa la interfaz.
 * null no es una instancia de nada.
 */
package JavaTutorials.LanguageBasics;

class InstanceofDemo {

    public static void main(String[] args) {

        /*Define dos objetos tipo Padre */
        Padre obj1 = new Padre();
        Padre obj2 = new Hijo();

        System.out.println("obj1 instanceof Padre: "
            + (obj1 instanceof Padre)); // obj1 instanceof Padre: true
        System.out.println("obj1 instanceof Hijo: "
            + (obj1 instanceof Hijo)); // obj1 instanceof Hijo: false
        System.out.println("obj1 instanceof MiInterfaz: "
            + (obj1 instanceof MiInterfaz)); // obj1 instanceof MiInterfaz: false
        System.out.println("obj2 instanceof Padre: "
            + (obj2 instanceof Padre)); // obj2 instanceof Padre: true
        System.out.println("obj2 instanceof Hijo: "
            + (obj2 instanceof Hijo)); // obj2 instanceof Hijo: true
        System.out.println("obj2 instanceof MiInterfaz: "
            + (obj2 instanceof MiInterfaz)); // obj2 instanceof MiInterfaz: true
        
    }
}

