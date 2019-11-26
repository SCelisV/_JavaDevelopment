public class TiposEnteros2{
	public static void main (String[]args){
        // int - 4byte from -2^31 to 2^31

        int HabitantesEnMadrid = 4000000;
        
        // long 8bytes from -2^63 to 2^63 - L indica que se tome como long antes de asignar; 
        // long HabitantesEnElMundo = 5000000000 -- possible error integer number too large;
        long HabitantesEnElMundo = 5000000000L;
        
        System.out.println(HabitantesEnElMundo);
	}
}