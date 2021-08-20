import java.awt.Color;
public class PruebaVehiculos {
    
    public static void main(String[] args){

        byte Ruedas = 8;
        byte Ejes = 4;
        byte Ocupantes = 2;
        short Cilindrada = 1100;

        // Instanciamos
        Camion MiCamion = new Camion();
        Camion OtroCamion = new Camion(Color.BLACK, Ruedas, Cilindrada, Ejes);


        Motocicleta MiMoto = new Motocicleta();
        Motocicleta OtraMoto = new Motocicleta(Color.GREEN, Ruedas, Cilindrada, Ocupantes);

        ImprimirCamiones(MiCamion);
        ImprimirCamiones(OtroCamion);
        ImprimirMotocicletas(MiMoto);
        ImprimirMotocicletas(OtraMoto);
    }

    public static void ImprimirCamiones(Camion camion){
        Color color = camion.getColor();
        byte ruedas = camion.getRuedas();
        short cilindrada = camion.getCilindrada();
        short potencia = camion.getPotencia();
        byte ejes = camion.getEjes();  

        System.out.println("Datos del camion: " + camion);
        System.out.println("Color: " + color);
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Ejes: " + ejes);
        
    }
    public static void ImprimirMotocicletas(Motocicleta motocicleta){
        Color color = motocicleta.getColor();
        byte ruedas = motocicleta.getRuedas();
        short cilindrada = motocicleta.getCilindrada();
        short potencia = motocicleta.getPotencia();
        byte ocupantes = motocicleta.getOcupantes();
        System.out.println("Datos de la motocicleta: " + motocicleta);
        System.out.println("Color: " + color);
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Ocupantes: " + ocupantes);
    }
}