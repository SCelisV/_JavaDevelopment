public class Primo{
    //  Número entero que solamente es divisible por él mismo (positivo y negativo) y por la unidad (positiva y negativa).
    // el 2 es un número primo porque solamente es divisible por 2, -2, 1 y -1
    // Un numero divisible por si mismo es cuando el resto de la división es diferente de 0
    // 
    public static void main(String[]args){
        int upto = 100;
        boolean ES_PRIMO;
        for (int i=2; i<=upto; i++){
            ES_PRIMO = true;
//            System.out.println("i: " + i);
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    ES_PRIMO = false;
                    break;
                }
//            System.out.println("j: " + j);
            }
        if(ES_PRIMO)    
            System.out.println("Es primo: " + i);
        }
    }
}