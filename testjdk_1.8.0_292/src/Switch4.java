public class Switch4{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Se puede validar la acción tan compleja como sea necesario
    public static void main(String[]args){

        int Valor = 341;

        switch ((4*Valor+17)%3){
            case 0:{
                // System.out.println((4*Valor+17)%3);
                System.out.println("Primera opción");
                break;
            }
            case 1:{
                // System.out.println((4*Valor+17)%3);
                System.out.println("Segunda opción");
                break;
            }
            case 2:{
                // System.out.println((4*Valor+17)%3);
                System.out.println("Tercera opción");
                break;
            }
        }   
        
    }
}