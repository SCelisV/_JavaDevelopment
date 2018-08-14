public class BucleFor8{
    public static void main (String[] args){
        // suma los 1000 primeros números naturales, imprimiendo por cada suma el resultado parcial obtenido
        int Suma = 0;
        for(int i=1;i<=1000;i++){ 
            Suma = Suma + i;
            System.out.println("i: "+ i + " - Suma: " + Suma);
        }
    }
}