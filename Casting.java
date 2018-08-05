public class Casting{
	public static void main (String[]args){
        
        byte EdadJuan = 20;

        // error: incompatible types: possible lossy conversion
        // byte EdadPedro = EdadJuan + 1;

        byte EdadPedro = (byte) (EdadJuan + 1);

        short SueldoBase = 1980;
        short Complementos = 400;

        short SueldoTotal;

        // error: incompatible types: possible lossy conversion from int to short
        // SueldoTotal= SueldoBase + Complementos;
        
        SueldoTotal= (short) (SueldoBase + Complementos);
        
        System.out.println('\n');
        System.out.println(EdadPedro);
        System.out.println('\n');
        System.out.println(SueldoTotal);
	}
}