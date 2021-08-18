// Realizar una referencia a una propiedad no estática desde el método estático main
/*
javac Error.java
Error.java:16: error: non-static variable valor cannot be referenced from a static context
        valor = 6;    
        ^
1 error
*/
class Error{
    // para solucionar el error se deberá definir como:
    // static int valor = 8;

    int valor = 8;

    public static void main(String[] args) {
        valor = 6;    
    }

}