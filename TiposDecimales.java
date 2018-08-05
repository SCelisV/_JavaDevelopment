public class TiposDecimales{
	public static void main (String[]args){
        // float - 4byte from -3.4x10^38 to 3.4x10^38
        
        float $PiezaPan = 0.87f;
        float $KiloQueso = 1.93f;
        
        float $Bocadillo = $PiezaPan + $KiloQueso;

        // double - 8byte from -1.7x10^308 to 1.7x10^308
        
        double NumeroHormigas = 6E+100;
        double DistanciaSubAtomica = 2.45E-95;

        System.out.println($Bocadillo);
	}
}