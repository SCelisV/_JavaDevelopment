// Permite almacenar el nombre de un candidato y el numero de votos que lleva, 
// además de los métodos necesarios para actualizar el estado del objeto.
// Si instanciamos la clase 14veces por ejemplo... 
// se podrá llevar el control de votos de 14 candidatos.

/*
La solución propuesta contienen las propiedades y 
métodos de acceso a la persona más votada dentro de la propia clase.

Como el nombre y el número de votos de la persona más votada 
hasta el momento es una información GENERAL.- Sólo existe un espacio de almacenamiento de estas variables.
que NO depende únicamente de los votos de un candidato, 
sino de los votos recibidos por todos los candidatos, 
estas propiedades deben ser accesibles, comunes y compartidas por todos.
Estas variables deben ser estáticas (de clase).
*/

class Votacion{

    // -----------------------
    // PROPIEDADES DE INSTANCIA
    // SE REPLICAN CON CADA INSTANCIACION

    // Persona a la que se vota en esta instancia - Nombre completo de un candidato
    private String Persona = null; 

    // Número de votos que lleva en esta instancia - Número de votos que lleva contabilizado
    private int Votos = 0; 

    // -----------------------
    // PROPIEDADES DE CLASE - son GENERALES, NO dependen  de los votos de un candidato únicamente
    // STATIC - existen desde que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA

    // Persona más votada de TODAS las instancias 
    static private String PersonaMasVotada = null; 

    // número de votos que lleva de TODAS las instancias
    static private int VotosMasVotado = 0; 

    // -----------------------
    // CONSTRUCTOR PARA CREAR LA INSTANCIA
    Votacion(String persona){
        this.Persona = persona;
    }

    // -----------------------
    // setters
    // MÉTODO DE INSTANCIA
    // Este método se invoca cada vez que alguien vota a Persona - 
    public void setVoto(){
        // Contabiliza un voto del candidato con el que se ha iniciado la clase.
        Votos++;
        // Se comprueba si este voto convierte al candidato en el nuevo ganador temporal
        if(Votos > VotosMasVotado){
            PersonaMasVotada = Persona;
            VotosMasVotado = Votos;
        }
    }

    // -----------------------
    // getters
    // MÉTODO DE INSTANCIA
    // Este método devuelve el nombre de Persona
    public String getNombrePersona(){
        return Persona;
    }

    // Devuelve el número de votos de Persona
    public int getVotos(){
        return Votos;
    }

    // -----------------------
    // MÉTODO DE CLASE
    // Devuelve el nombre de la persona más votada - 
    // STATIC - existen dede que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA
    static public String NombreDelMasVotado(){
        // retorna el valor de PersonaMasVotada en cualquier momento.
        return PersonaMasVotada;
    }

    // MÉTODO DE CLASE
    // Devuelve el numero de votos de la persona más votada
    // STATIC - existen dede que se ejecuta la aplicación - NO PERTENECEN A NINGUNA INSTANCIA
    static public int VotosDelMasVotado(){
        // retorna el valor de VotosMasVotado en cualquier momento.
        return VotosMasVotado;
    }
}