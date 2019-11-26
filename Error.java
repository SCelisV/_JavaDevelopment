// Realizar una referencia a una propiedad no estática desde el método estático main
class Error{
    int valor = 8;
    public static void main(String[] args) {
        valor = 6;    
    }//main
}//class