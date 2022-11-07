package methods_and_inheritance.Code01_02_2;

public class Main {

    private String message = null;

    // constructor por defecto ahora mismo no compila porque un constructor llama a otro constructor la llamada debe aparecer como la primera orden - call to this must be first statement in constructor
    private Main(){
        String message = "default";
        //this(message);
    }

    // constructor sobrecargado que establece un mensaje por defecto
    private Main(String message){
        this.message = message;
    }

    public static void main(String[] args) {

        System.out.println(new Main().message);

    }
    
}
