/*
Prueba de la clase java.math.BigDecimal

*/
import java.math.BigDecimal;
public class PruebaClassBigDecimal{

    public static void main(String[] args) {
        
        // BigDecimal(int val);
        BigDecimal myBigDecimal = new BigDecimal(-5);
        System.out.println("myBigDecimal.abs(-5) : " + myBigDecimal.abs());

        // 
        String SBigDecimal = myBigDecimal.toString();
        System.out.println("myBigDecimal.toString() : " + SBigDecimal); 

        System.out.println(myBigDecimal.toString()); 


    }
}
