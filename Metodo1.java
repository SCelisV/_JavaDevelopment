public class Metodo1 {

    // la Hipotenusa es igual a la suma del cuadrado de los catetos
    // parámetros de tipo double
    static double Hipotenusa( double Cateto1, double Cateto2){
        
        double Auxiliar;
        Auxiliar = Cateto1 * Cateto1 +  Cateto2 * Cateto2;
        return Math.sqrt(Auxiliar);
    }
    

    public static void main (String[] args){

        System.out.println(Hipotenusa(5.0d, 3.0d));
        System.out.println(Hipotenusa(9.0d, 2.0d));
        
    }
}