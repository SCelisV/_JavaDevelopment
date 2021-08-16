public class PuntodeCorte {
    // Calculo del punto de corte ó intersección.
    // es el punto = (X,Y) donde se cruzan dos rectas distintas, es decir,
    // cuando X e Y en las dos rectas son iguales
    // recta1 = (punto1, punto2) => (X1, Y1) , (X2, Y2)
    // recta2 = (punto1, punto2) => (X3, Y3) , (X4, Y4)
    // Cualquier punto de la recta puede obtenerse multiplicando un número real por
    // los vectores (X1, Y1) , (X2, Y2) para la recta 1 y
    // los vectores (X3, Y3) , (X4, Y4) para la recta 2 y
    // por lo tanto la ecuación de la recta puede ser definida como:
    // recta1 donde t es el valor real para obtener cualquier punto de la recta
    // X = X1 + (X2-X1) * t
    // Y = Y1 + (Y2-Y1) * t
    // recta2 donde r es el valor real
    // X = X3 + (X4-X3) * r
    // Y = Y4 + (Y4-Y3) * r
    public static void main(String[]args){


        // int X1, Y1, X2, Y2, X3, Y3, X4, Y4;
        // recta1 = (punto1, punto2) => 
        int X1 = 05, Y1 = 10;
        int X2 = 15, Y2 = 05;
        // recta2 = (punto1, punto2) => 
        int X3 = 05, Y3 = 05;
        int X4 = 05, Y4 = 15;

        double t, Denominador, Numerador;

    // igualamos los X de las dos rectas
    // X1 + (X2-X1) * t = X3 + (X4-X3) * r
    // igualamos los Y de las dos rectas
    // Y1 + (Y2-Y1) * t = Y4 + (Y4-Y3) * r

    // t = [(Y4-Y3)*(X3-X1)-(Y3-Y1)*(X4-X3)] / [(Y4-Y3)*(X2-X1)-(Y2-Y1)*(X4-X3)] 

        Denominador = (Y4-Y3)*(X2-X1)-(Y2-Y1)*(X4-X3); 
        Numerador = (Y4-Y3)*(X3-X1)-(Y3-Y1)*(X4-X3);
        if (Denominador == 0){
            System.out.println("Las rectas son paralelas");
        } else {
            // recta1 donde t es el valor real para obtener cualquier punto de la recta
            t = Numerador / Denominador;
            System.out.println("Valor real: " + t);
            // recta1 = (punto1, punto2) => 
            System.out.println("Recta1: " + "(" + X1 + "," + Y1 + ") , (" + X2 +", " + Y2 + ")");
            // recta2 = (punto1, punto2) => 
            System.out.println("Recta2: " + "(" + X3 + "," + Y3 + ") , (" + X4 +", " + Y4 + ")");
            // Punto de Corte (X, Y)
            // Punto de Corte (CorteX, CorteY)
            double CorteX = X1 + (X2-X1) * t;
            double CorteY = Y1 + (Y2-Y1) * t;
            System.out.println("Punto de Corte: (" + CorteX + ", " + CorteY + ")");
        }
    }
}