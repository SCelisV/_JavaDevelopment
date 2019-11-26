public class String1 {
    
    // existe una clase String(java.lang.String);

    public static void main (String[] args){

        String InstanciaDeString = "El amigo de los osos";
        String OtroString = "El chico llamo 'pesado' a su amigo";
        String Vacio = null;
        String NoVacio = "";
        String AnimalesPreferidos = "osos";
        String Greenpeace = "El amigo de los " + AnimalesPreferidos;;
        String Adena = Greenpeace;

        System.out.println("InstanciaDeString: " + InstanciaDeString);
        System.out.println("OtroString: " + OtroString);
        System.out.println("Vacio: "+ Vacio);
        System.out.println("NoVacio: " + NoVacio);
        System.out.println("Greenpeace: " + Greenpeace);
        System.out.println("InstanciaDeString==Greenpeace: " + (InstanciaDeString==Greenpeace));
        System.out.println("Adena==Greenpeace: " + (Adena==Greenpeace));

        boolean Iguales = InstanciaDeString.equals(Greenpeace);
        System.out.println("InstanciaDeString.equals(Greenpeace): " + Iguales);
    }
}