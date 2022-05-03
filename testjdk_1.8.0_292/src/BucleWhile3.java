public class BucleWhile3{
    // Cuantos números naturales debemos sumar en secuencia para obtener al menos un valor de 100000?
    // hasta que valor llegará la sumatoria para que la suma alcance al valor 100000
    public static void main (String[]args){
        int Suma=0, SumaTotal=0; 
        int i=1;
        // con un WHILE
        /*
        while(SumaTotal < 100000){
            Suma += i;
            SumaTotal += Suma;
            System.out.println("\ni: " + i + " " + "Suma: " + " " + Suma + " " + "Total: " + " " + SumaTotal);
            i++;
        }
        */
        // con un DO WHILE
        do {
            Suma += i;
            SumaTotal += Suma;
            System.out.println("\ni: " + i + " " + "Suma: " + " " + Suma + " " + "Total: " + " " + SumaTotal);
            i++;
        } while(SumaTotal < 100000);
    }
}