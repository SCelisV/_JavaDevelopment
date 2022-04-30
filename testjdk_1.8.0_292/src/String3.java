
public class String3 {

	public static void main(String[] args) {
		// El objeto es INMUTABLE, es decir, no podrá cambiarse nunca.
		
		String yourname = "Sonia";
		String s = "Hello " + yourname;

		
		// Puede asignar s para que haga referencia a una cadena diferente, incluso una derivada de la original
		s = s.trim();
		System.out.println("s: " + s);	
		
		// Obtener caracteres de la cadena original mediante charAt()
		// No hay métodos get ni set charAt
		char c = s.charAt (3);
		System.out.println("c: " + c);

		// Estos métodos no modifican el String simplemente devuelven
		// un objeto String nuevo que incluye los caracteres convertidos
		System.out.println("toUpperCase: " + s.toUpperCase());
					
	}

}
