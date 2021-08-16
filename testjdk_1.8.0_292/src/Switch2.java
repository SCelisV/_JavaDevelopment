public class Switch2{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // acción('a', 'c', 't') representarán la acción (abrir, cerrar, test), respectivamente
    public static void main(String[]args){
       char Caracter = 't'; 

       switch (Caracter){
           case 'a':
            System.out.println("Abrir la puerta");
            break;
           case 'c':
            System.out.println("Cerrar la puerta");
            break;
           case 't':
            System.out.println("Comprobar circuitos");
            break;
           default:
            System.out.println("Opción Invalida");
            break;
       }
    }
}