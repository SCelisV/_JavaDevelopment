public class Switch7{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Tratamiento de los días de la semana - L a V -> Laborables - S y D no laborables - 1 a 7 respectivamente
    public static void main(String[]args){

        byte DIA =7;

        /*
            Lunes = 1, Martes = 2, Miercoles = 3, Jueves = 4, Viernes = 5 - Laborables
            Sábado = 6, Domingo 7 - No laborables
        */
        
        switch(DIA){
            case 1:
                System.out.println("Que duro es el Lunes");
                break;
            case 2:
                System.out.println("Entrenamiento TT");
                break;
            case 3:
                System.out.println("Mitad de la semana");
                break;
            case 4:
                System.out.println("Entrenamiento TT");
                break;
            case 5:
                System.out.println("Viernes esperado");
                break;
            case 6:
                System.out.println("Descansar y descansar");
                break;
            case 7:
                System.out.println("Descansar y descansar");
                break;
            default:
                break;
        }
    }
}