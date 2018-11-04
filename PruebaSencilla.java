// En una clase, las propiedades y los métodos pueden definirse como 
// De instancia y De clase
// La clase sencilla está definida, pero no instanciada, por lo que todavia no existe ninguna variable PropiedadDeInstancia
// Si ahora intentasemos hacer uso de la propiedad "PropiedadDeInstancia" a través de nombre de la clase (Sencilla), el compilador daría un error.
class PruebaSencilla{
    public static void main(String[] args){
        Sencilla.PropiedadDeInstancia = 8;
    }
}