/*
Ejemplo de una seccion de código que recoje la excepción que hemos creado ExcepcionPropia
*/
public class PruebaExcepcionPropia{
    int Valor = 0;

    public static void main(String[] args){
        System.out.println("PruebaExcepcionPropia");
        do{
            try {
               ExcepcionPropiaClase Instancia = new ExcepcionPropiaClase();
               Instancia.Metodo(); 
               // Este catch recoge la Excepción definida en ExcepcionPropia
            } catch (ExcepcionPropia e) {
                System.out.println(e);
            }
        }while(true);
    }
}