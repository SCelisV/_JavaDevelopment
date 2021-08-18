// Propiedades de clase, 
// Una propiedad de clase estática se declara con el atributo static
// Las propiedades de clase son compartidas por todas las instancias de la clase.
// Al crearse una instancia de la clase, no se crean las variables estáticas de esa clase.
// Las variables estáticas (de clase) existen antes de la creación de las instancias de la clase.
class PruebaSencillaEstatica2{
    public static void main (String[] args){
        SencillaEstatica Instancia1 = new SencillaEstatica();
        SencillaEstatica Instancia2 = new SencillaEstatica();
        // Las siguientes, hacen referencia a la misma variable 
        // (la propiedad estática "PropiedadDeClase" de la clase "SencillaEstatica".).
        SencillaEstatica.PropiedadDeClase = 4;
        Instancia1.PropiedadDeClase = 8;
        Instancia2.PropiedadDeClase = 5;
    }
}