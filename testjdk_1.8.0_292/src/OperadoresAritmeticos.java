public class OperadoresAritmeticos{
	public static void main (String[]args){

        float Impuesto = 2.2f * 1.0f + 5.0f;
        System.out.println("Impuesto: " + Impuesto);
        System.out.println('\n');
        int Impuesto2 = -8 + 12 /2;
        System.out.println("Impuesto2: "+ Impuesto2);
        System.out.println('\n');
        int Cociente = 16 / 3;
        System.out.println("Cociente: "+ Cociente);
        System.out.println('\n');
        int Resto = 16 % 3;
        System.out.println("Resto: "+ Resto);
        System.out.println('\n');
        int Nueve = 9;
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        // asigna y después incrementa
        int PostIncremento = Nueve++;
        System.out.println("PostIncremento: "+ PostIncremento);
        System.out.println('\n');
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        Nueve = 9;
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        // incrementa y después asigna
        int PreIncremento = ++Nueve;
        System.out.println("PreIncremento: "+ PreIncremento);
        System.out.println('\n');
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        Nueve = 9;
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        int PostDecremento = Nueve--;
        System.out.println("PostDecremento: "+ PostDecremento);
        System.out.println('\n');
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        Nueve = 9;
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');
        int PreDecremento = --Nueve;
        System.out.println("PreDecremento: "+ PreDecremento);
        System.out.println("Nueve: "+ Nueve);
        System.out.println('\n');

    }
}