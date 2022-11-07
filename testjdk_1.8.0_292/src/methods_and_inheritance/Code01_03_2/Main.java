package methods_and_inheritance.Code01_03_2;


public class Main {

    // campos estáticos definidos pero no inicializados
    static String message;

    // final requiere que el campo sea inicializado en la declaración ó en el constructor por defecto de la clase, esto genera un error al compilar
    static final String message2 = "message2";

    public static void main(String[] args) {
        System.out.println(message); // null
        System.out.println(message2); // message2
    }
}
