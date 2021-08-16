public class Switch3{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // acción('a', 'c', 't') en minúsculas ó mayúsculas ('A', 'C', 'T') 
    // representarán la acción (abrir, cerrar, test), respectivamente
    public static void main(String[]args){
       char Caracter = 'A'; 

       switch (Caracter){
           case 'a':
           case 'A':
            System.out.println("Abrir la puerta");
            break;
           case 'c':
           case 'C':
            System.out.println("Cerrar la puerta");
            break;
           case 't':
           case 'T':
            System.out.println("Comprobar circuitos");
            break;
           default:
            System.out.println("Opción Invalida");
            break;
       }
    }
}