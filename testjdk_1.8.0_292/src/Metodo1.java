public class Metodo1 {
    // Este método calcula el tamaño de la Hipotenusa
    // la Hipotenusa es igual a la suma del cuadrado de los catetos
    // Se le pasa como parámetros los catetos de tipo double
    // Return el valor de la hipotenusa de tipo double

    static double Hipotenusa( double Cateto1, double Cateto2){
        
        double Auxiliar;
        Auxiliar = Cateto1 * Cateto1 +  Cateto2 * Cateto2;
        return Math.sqrt(Auxiliar);
    }

    public static void main (String[] args){

        // Realizamos dos llamadas al método Hipotenusa 
        // 1. pasandole los parámetros: (5.0d, 3.0d);
        // 2. pasandole los parámetros: (9.0d, 2.0d);

        System.out.println("La Hipotenusa de (5.0d, 3.0d) es: " + Hipotenusa(5.0d, 3.0d));
        System.out.println("La Hipotenusa de (9.0d, 2.0d) es: " + Hipotenusa(9.0d, 2.0d));
        
    }
}