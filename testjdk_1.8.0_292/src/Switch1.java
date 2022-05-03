public class Switch1{    
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Puesto (1, 2, 3) representarán el tipo de Medalla(Oro, Plata Bronce), respectivamente
    public static void main(String[]args){
       int Puesto = 2; 

       switch (Puesto){
           case 1:
            System.out.println("Medalla de Oro");
            break;
           case 2:
            System.out.println("Medalla de Plata");
            break;
           case 3:
            System.out.println("Medalla de Bronce");
            break;
           default:
            System.out.println("Gracias por participar");
            break;
       }
    }
}