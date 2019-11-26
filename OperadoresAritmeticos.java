public class OperadoresAritmeticos{
	public static void main (String[]args){

        float Impuesto = 2.2f * 1.0f + 5.0f;
        int Impuesto2 = -8 + 12 /2;
        int Cociente = 16 / 3;
        int Resto = 16 % 3;
        int Nueve = 9;
        // asigna y después incrementa
        int PostIncremento = Nueve++;
        Nueve = 9;
        // incrementa y después asigna
        int PreIncremento = ++Nueve;
        Nueve = 9;
        int PostDecremento = Nueve--;
        Nueve = 9;
        int PreDecremento = --Nueve;

        System.out.println("Impuesto: " + Impuesto);
        System.out.println('\n');
        System.out.println("Impuesto2: "+ Impuesto2);
        System.out.println('\n');
        System.out.println("Cociente: "+ Cociente);
        System.out.println('\n');
        System.out.println("Resto: "+ Resto);
        System.out.println('\n');
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        System.out.println("PostIncremento: "+ PostIncremento);
        System.out.println('\n');
        System.out.println("PreIncremento: "+ PreIncremento);
        System.out.println('\n');
        System.out.println("PostDecremento: "+ PostDecremento);
        System.out.println('\n');
        System.out.println("PreDecremento: "+ PreDecremento);
    }
}