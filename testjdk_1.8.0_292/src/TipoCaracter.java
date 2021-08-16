public class TipoCaracter{
	public static void main (String[]args){
        // char - 2byte - conjunto de caracteres
        
        char AMayuscula = 'A', AMinuscula = 'a';
        // cast explicito de tipo - (AMayuscula + 1) el resultado es int
        char BMayuscula = (char) (AMayuscula + 1);
        
        System.out.println('\n');
        System.out.println(BMayuscula);
	}
}