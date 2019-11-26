// Si se quiere referenciar a la propiedad valor de la clase, es necesario que esté declarada como estática
class NoError{
    static int valor = 8;
    public static void main(String[] args) {
        valor = 6;
    }//main
}//class