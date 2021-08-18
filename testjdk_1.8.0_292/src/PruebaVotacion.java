
class PruebaVotacion{

    public static void main(String[] args) {

        // Podemos accedera al nombre y al número de votos del candidato más votado.
        // Esto es posible porque tanto los métodos como las variables accedidas son (static) estáticas y 
        // tienen existencia antes de la creación de las instancias de la clase.
        // Se accede a los métodos a través del nombre de la clase.

        System.out.println("Votacion.NombreDelMasVotado(): " + Votacion.NombreDelMasVotado());
        System.out.println("Votacion.VotosDelMasVotado():  " + Votacion.VotosDelMasVotado());

        // Tenemos tres candidatos en esta votación:
        // En este momento además de las propiedades ya existentes se dispone de tres copias de las propiedades de instancia.
        Votacion Juan = new Votacion("Juan Peire");
        Votacion Ana = new Votacion("Ana Garcia");
        Votacion Adela = new Votacion("Adela Sancho");

        // Empieza la votación
        // Se referencia a los métodos estáticos a través del nombre de la clase no de una instancia.
        Juan.setVoto(); Ana.setVoto(); Ana.setVoto(); Ana.setVoto(); Adela.setVoto();
        //Se comprueba que llevamos un seguimiento correcto de la persona más votada.
        System.out.println("Votacion.NombreDelMasVotado(): " + Votacion.NombreDelMasVotado());
        System.out.println("Votacion.VotosDelMasVotado():  " + Votacion.VotosDelMasVotado());
        
        Juan.setVoto(); Juan.setVoto(); Juan.setVoto(); Adela.setVoto(); 
        System.out.println("Votacion.NombreDelMasVotado(): " + Votacion.NombreDelMasVotado());
        System.out.println("Votacion.VotosDelMasVotado():  " + Votacion.VotosDelMasVotado());

        Adela.setVoto(); Adela.setVoto(); Ana.setVoto(); Ana.setVoto();
        System.out.println("Votacion.NombreDelMasVotado(): " + Votacion.NombreDelMasVotado());
        System.out.println("Votacion.VotosDelMasVotado():  " + Votacion.VotosDelMasVotado());
        
        // Se imprime la información que se guarda en las variables de instancia a las cuales se accede por métodos de instancia, 
        // por lo que la referencia a los métodos se hace a través de los identificadores de instancia "Ana, Juan, Adela".
        System.out.println(Juan.getNombrePersona() + ": "+ Juan.getVotos());
        System.out.println(Ana.getNombrePersona() + ": "+ Ana.getVotos());
        System.out.println(Adela.getNombrePersona() + ": "+ Adela.getVotos());

        // Podemos accedera al nombre y al número de votos del candidato más votado.
        System.out.println("Votacion.NombreDelMasVotado(): " + Votacion.NombreDelMasVotado());
        System.out.println("Votacion.VotosDelMasVotado():  " + Votacion.VotosDelMasVotado());

    }
}