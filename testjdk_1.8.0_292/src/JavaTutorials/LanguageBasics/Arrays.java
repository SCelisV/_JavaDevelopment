/*
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
*/
package JavaTutorials.LanguageBasics;

class Array{ 
	public static void main(String[] args){

		// declarar un array
		int[] anArray;
		
		// asigna memoria para 5 enteros
		anArray = new int[5];

		// initailize all elements
		anArray[0] = 0;
		anArray[1] = 1;
		anArray[2] = 2;
		anArray[3] = 3;
		anArray[4] = 4;

		System.out.println();
		System.out.println("anArray" + anArray);	//	anArray[I@d716361

		System.out.println();
		for (int i=0; i<anArray.length; i++){
			System.out.println("Element at index [" + i +"]: " + anArray[i]);
		}

		// Element at index [0]: 0
		// Element at index [1]: 1
		// Element at index [2]: 2
		// Element at index [3]: 3
		// Element at index [4]: 4

		System.out.println();

		// forma corta para inicializar un array
		int[] otherArray = { 0, 1, 2, 3, 4 };
		System.out.println();		
		for (int i: otherArray) {
				System.out.print(i + ", "); 	// 0, 1, 2, 3, 4, 
		}

		//
		System.out.println();
                // multidimensional array
				//            [0][0],  [0][1],   [0][2]    [1][0], [1][1]
 		String[][] names = { {"Sr. ", "Sra. ", "Srta. "},{"Sonia", "Sol"} };

		System.out.println();
		System.out.println(names[0][0] + names[1][0]);	//	Sr. Sonia

		System.out.println();
		System.out.println(names[0][2] + names[1][1]);	// 	Srta. Sol

		// determine the size of any array. 
		System.out.println();
		System.out.println("anArray.length: " + anArray.length);			//	anArray.length: 5

		//
		System.out.println();
                // Copying Array
		// arraycopy method to efficiently copy data from one array into another:
		                             //  0,           1,            2,          3,         4,
		String[] arrayDesde = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
		                     //    5,          6,            7,        8,       9,          10,
            				"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
		                         //   11,         12
            				"Marocchino", "Ristretto" };

		String[] arrayHasta = new String[7];

		// copia un arreglo a otro
		System.arraycopy(arrayDesde, 2, arrayHasta, 0, 7);
		for (String string : arrayHasta) {
				System.out.print(string + ", "); //	Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo,          
		}

		//
		System.out.println();
		System.out.println();
 		String[][] otrosNames = new String[2][5];
		for (int i=0; i<otrosNames.length; i++){
			for (int j=0; j<otrosNames.length; j++){
				otrosNames[i][j] = ("name: [" + String.valueOf(i) + "][" + String.valueOf(j) + "]");
				System.out.println("Element at index [" + i +"][" + j + "]: " + otrosNames[i][j]);
			}
		}
		// Element at index [0][0]: name: [0][0]
		// Element at index [0][1]: name: [0][1]
		// Element at index [1][0]: name: [1][0]
		// Element at index [1][1]: name: [1][1]
	}
}
