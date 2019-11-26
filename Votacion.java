// Permite almacenar el nombre de un candidato y el numero de votos que lleva, además de los métodos necearios para actualizar el estado del objeto.
// Si instanciamos la clase 14veces por ejemplo... se podrá llevar el control de votos de 14 candidatos.

// La solución propuesta contienen las propiedades y métodos de acceso a la persona más votada dentro de la propia clase.

// No es necesario usar la clase MasVotado
class Votacion{
    // PROPIEDADES DE INSTANCIA
    // SE REPLICAN CON CADA INSTANCIACION
    private String Persona = null; // Persona a la que se vota en esta instancia 
    private int Votos = 0; // número de votos que lleva

    // PROPIEDADES DE CLASE
    // STATIC - existen dede que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA
    static private String PersonaMasVotada = null; // Persona más votada de todas las instancias 
    static private int VotosMasVotado = 0; // número de votos que lleva

    // CONSTRUCTOR PARA CREAR LA INSTANCIA
    Votacion(String Persona){
        this.Persona = Persona;
    }

    // Este método se invoca cada vez que alguien vota a Persona - MÉTODO DE INSTANCIA
    public void Voto(){
        Votos++;
        if(Votos > VotosMasVotado){
            PersonaMasVotada = Persona;
            VotosMasVotado = Votos;
        }
    }

    // Este método devuelve el nombre de Persona - MÉTODO DE INSTANCIA
    public String NombrePersona(){
        return Persona;
    }

    // Devuelve el número de votos de Persona - MÉTODO DE INSTANCIA
    public int Votos(){
        return Votos;
    }

    // Devuelve el nombre de la persona más votada - MÉTODO DE CLASE
    // STATIC - existen dede que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA
    static public String NombreDelMasVotado(){
        return PersonaMasVotada;
    }

    // Devuelve el numero de votos de la persona más votada
    // STATIC - existen dede que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA
    static public int VotosDelMasVotado(){
        return VotosMasVotado;
    }
}