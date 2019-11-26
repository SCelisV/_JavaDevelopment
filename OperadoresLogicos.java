public class OperadoresLogicos{
	public static void main (String[]args){

        boolean Calor, Frio = false, Oportunidad, Bueno = true,
                Bonito = true, Barato = true, Llueve = true,
                Riego = false;
                
        Oportunidad = Bueno && Bonito && Barato;

        System.out.println("!Frio: " + !Frio);
        System.out.println('\n');
        System.out.println("Oportunidad: " + Oportunidad);
        System.out.println('\n');
        System.out.println("Llueve o Riego: " + (Llueve || Riego));

    }
}