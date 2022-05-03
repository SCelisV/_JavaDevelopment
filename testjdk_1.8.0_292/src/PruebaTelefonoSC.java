public class PruebaTelefonoSC {

    public static void main(String[] args){

        //TelefonoSC miTelefono;
        TelefonoSC miTelefono = new TelefonoSC();

        miTelefono.setHacerLLamada("666696969");
        miTelefono.setHacerLLamada("666696869");
        miTelefono.setHacerLLamada("666696769");
        miTelefono.setHacerLLamada("666696669");
        miTelefono.setHacerLLamada("666696569");
        int [] llamadas = miTelefono.getUltLLamadas();
        for (int i =0; i < llamadas.length; i++){
            System.out.println("llamadas[" + i + "]: " + llamadas[i]);

        }
    }
    
}
