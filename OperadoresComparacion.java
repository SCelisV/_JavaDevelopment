public class OperadoresComparacion{
	public static void main (String[]args){

        int EdadJuan = 6, EdadPedro = 21, Contador = 14;

        float Hipotenusa = 105.6f, Cateto1 = 13.2f, Cateto2 = 5.7f;

        System.out.println("EdadJuan < 18: " + (EdadJuan < 18));
        System.out.println('\n');
        System.out.println("EdadJuan <= EdadPedro: " + (EdadJuan <= EdadPedro));
        System.out.println('\n');
        System.out.println("Hipotenusa > 8.0f * 6.2f + 5.7f: " + (Hipotenusa > 8.0f * 6.2f + 5.7f));
        System.out.println('\n');
        System.out.println("Cateto1 >= Cateto2: " + (Cateto1 >= Cateto2));
        System.out.println('\n');
        System.out.println("Contador == 8: " + (Contador == 8));
        System.out.println('\n');
        System.out.println("Contador != 8: "+ (Contador != 8));
    }
}