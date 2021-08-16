public class Factorial {
    // Hallar el factorial de un número
    // Factorial de  = 0
    // En este caso utilizamos un int pero si Numero es muy grande se puede desbordar y debemos usar un long
    // Factorial de k (k!) = k * (k-1) * (k-2) * ... * 2 * 1
    // 6! = 6 * 5 * 4 * 3 * 2 * 1
    public static void main (String[] args){
        int Numero = 6;
        int Factorial = 1;
        for(int i=2; i<=Numero; i++)
            Factorial = Factorial * i;
        System.out.println(Factorial);
        
    }
}