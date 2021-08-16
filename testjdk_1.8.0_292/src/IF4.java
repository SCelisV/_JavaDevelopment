public class IF4{
    public static void main(String[]arg){
        float Presion = 2.3f, Temperatura = 90f;

        if(Presion > 2f && Temperatura > 200f){
            System.out.println("Abrir valvula de seguridad");
            System.out.println("Reducir la temperatura");
            System.out.println("Llamar a los bomberos");
        } else {
            System.out.println("Todo en orden");
        }
    }
}