// Propiedades de clase, 
// Una propiedad de clase estática se declara con el atributo static
// A diferencia de las propiedades de instancia, las propiedades de clase existen incluso si no se ha creado ninguna instancia de la clase.
// Pueden ser referenciadas directamente a través del nombre de la clase, sin tener que utilizar el identificador de ninguna instancia.
// Existen aunque no se haya creado el objeto. "new()".
class PruebaSencillaEstatica{
    public static void main (String[] args){
        SencillaEstatica.PropiedadDeClase = 8;
        
    }
}