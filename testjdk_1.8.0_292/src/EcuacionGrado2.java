public class EcuacionGrado2{
    // Solucines de una ecuación de segundo grado
    // Dada una ecuación genérica de grado 2: {ax^2 + bx + c = 0}, sus soluciones son:
    // X = ( -b +/- sqrt(b * b - 4ac) ) / 2a;
    // A partir del discriminante (b * b - 4ac), se pueden conocer las soluciones de la ecuación
    // Si {b*2 -4ac > 0}, entonces  X1, X2 son soluciones reales y distintas.
    // Si {b*2 -4ac = 0}, entonces  X1, X2 son soluciones reales e iguales.
    // Si {b*2 -4ac < 0}, entonces la ecuación no posee soluciones reales.
    public static void main(String[]args){

        // double a, b, c;
        double a = 6, b = -5, c = 1;
        double discriminante = 0, Denominador = 0, X1 = 0, X2 = 0;
        // X = ( -b +/- sqrt(b * b - 4ac) ) / 2a;
        discriminante = (b*b - 4*a*c);
        System.out.println("discriminante: " + discriminante);
        Denominador = 2 * a;
        System.out.println("Denominador: " + Denominador);
        // System.out.println(Math.sqrt(discriminante));
        X1 = - b + (Math.sqrt(discriminante)) / Denominador;
        X2 = - b - (Math.sqrt(discriminante)) / Denominador;
        // Si {b*2 -4ac < 0}, 
        if (discriminante < 0){
            System.out.println("La ecuación de segundo grado: " + "{" + a + "x^2 +" + b + "x + " + c + "=" + 0 + "}, " + "NO TIENE soluciones reales.");
        } // Si {b*2 -4ac = 0}
        else if( discriminante == 0){
                System.out.println("La ecuación de segundo grado: " + "{" + a + "x^2 +" + b + "x + " + c + "=" + 0 + "}, " + "X1, X2 son soluciones reales e iguales: " + X1);
        } else // Si {b*2 -4ac > 0},
                System.out.println("La ecuación de segundo grado: " + "{" + a + "x^2 +" + b + "x + " + c + "=" + 0 + "}, " + "tiene las siguientes soluciones reales X1: " + X1 +", X2: " + X2);
    }
}