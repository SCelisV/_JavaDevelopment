package methods_and_inheritance.Code01_01_2;

public class Main {

    // this method1 no return nothing
    public void method1(){}

    // this method2 no return nothing
    public void method2(){
        return;
    }
    
    /* Genera un error de compilación
    // this method3 declara que devuelve un freturnreturn  loat
    public Float method3(){
        return 12.3; // pero esta devolviendo a double floating-poing type
    }
    */

    public Float method4(){
        return 12.3f; // return a Float
    }


    public static void main(String[] args) {
        Main m = new Main();

        m.method1();
        m.method2();
        // m.method3();
        m.method4();

    }
    
}
