
public class String4 {

	/* Procesar una cadena carácter a carácter, utilizando un bucle for y el método charAt()
	 * Un método charAt() recupera un carácter dado por un número de índice (a partir de cero), 
	 * desde el objeto String.
	 * Para procesar todos los caracteres de un String, usamos un bucle for entre cero y String.length()-1.
	 * ó String.length().
	*/

	public static void main(String[] args) {

		String s = "Esta es una cadena";	
		for (int i=0; i < s.length(); i++)
			System.out.println("Char " + i + " is " + s.charAt(i));
		/*
		 * Char 0 is E
         * Char 1 is s
         * Char 2 is t
         * Char 3 is a
         * Char 4 is  
         * Char 5 is e
         * Char 6 is s
         * Char 7 is  
         * Char 8 is u
         * Char 9 is n
         * Char 10 is a
         * Char 11 is  
         * Char 12 is c
         * Char 13 is a
         * Char 14 is d
         * Char 15 is e
         * Char 16 is n
         * Char 17 is a
		 */
	}
}