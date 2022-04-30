public class Switch7a{
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
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Laborable");
                break;
            case 6:
            case 7:
                System.out.println("Fin de Semana");
                break;
            default:
                break;
        }
    }
}