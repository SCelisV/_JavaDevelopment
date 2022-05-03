public class Hipotenusa{
    // Calculo de la Hipotenusa de un Triangulo equilátero.
    // teorema de Pitágoras: 
    // la hipotenusa al cuadrado es igual a la suma de los catetos al cuadrado.
    // java.lang.Math exponential, logarithm, sqrt, square root, and trigonometric functions.
    // Math.sqrt(valor_double) --> esto es porque el método sqrt de la clase Math es estático.
    public static void main(String[]args){

        double Hipotenusa = 0, Cateto1 = 0, Cateto2 = 0;

        for (int i = 1; i <= 5; i++){
            Cateto1 = (double) i;
            for(int j=1; j <= 5; j++){
                Cateto2 = (double) j;
                Hipotenusa = Math.sqrt((Cateto1 * Cateto1) + (Cateto2 * Cateto2));
                System.out.println("Cateto1: " + Cateto1);
                System.out.println("Cateto2: " + Cateto2);
                System.out.println("La Hipotenusa: " + Hipotenusa);
            }
        }

    }
}