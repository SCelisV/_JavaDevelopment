package methods_and_inheritance.Code01_02_1;


public class Main {

    // imprime un Long 
    public static void print(Long num){
        System.out.println("print Long: " + num);
    }

    // imprime un Objeto
    public static void print(Object obj){
        System.out.println("print Object: " + obj);
    }

    public static void main(String[] args) {

        // esta llamada utilizará la segunda definición del método print
        print(42); // print Object: 42

        // esta llamada utilizará la primera definición del método print
        print(42L); // print Long: 42

    }
}
