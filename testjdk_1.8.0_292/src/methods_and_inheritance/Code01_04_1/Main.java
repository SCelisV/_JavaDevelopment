package methods_and_inheritance.Code01_04_1;

// In java los parametros son siempre pasados a los métodos por valor.
// El valor de cada parámetro real se copia en su respectiva variable local en el método
// El valor original no puede ser modificado por el método si se "pasa por valor".
// Sin embargo, si el valor del parámetro es de tipo referencia, el método puede modificar el objeto original a través de la referencia "pasado por referencia".

public class Main {

    // toma un object de tipo String como parametro y asigna un nuevo valor a este.
    static void update(String greetings){
        greetings = "Hello String World!";
    }

    // modifica un object de tipo StringBuilder y adiciona un String a este.
    static void update1(StringBuilder greetings){
        greetings.append(" World!");
    }


    public static void main(String[] args) {

        // crea el objeto tipo String 
        String greetings = "Hello this is an String called greetings - ";
        // se pasa el objeto como parámetro al método update
        update(greetings);
        // y lo imprime por consola, el objeto sigue siendo el mismo
        System.out.println("update: " + greetings); // update: Hello this is an String called greetings - 

        // crea el objeto tipo StringBuilder 
        StringBuilder greetings1 = new StringBuilder("Hello this is an StringBuilder call greetings1 - ");
        // se pasa el objeto como parámetro al método update1 a traves de la copia
        update1(greetings1);
        // hay dos copias de la referencia pero sólo un objeto que puede ser cambiado a traves de la referencia
        System.out.println("update: " + greetings1); // update: Hello this is an StringBuilder call greetings1 -  World!
        
    }
    
}