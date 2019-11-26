// En una clase, las propiedades y los métodos pueden definirse como 
// De instancia y De clase
// La clase sencilla está definida, pero no instanciada, por lo que todavia no existe ninguna variable PropiedadDeInstancia
// Si ahora intentasemos hacer uso de la propiedad "PropiedadDeInstancia" a través de nombre de la clase (Sencilla), el compilador daría un error.
// Para poder hacer uso de la variable "PropiedadDeInstancia", obligatoriamente deberemos crear alguna instancia de la clase.
class PruebaSencilla2{
    public static void main(String[] args){
        // En este momento existe el objeto y la propiedad
        Sencilla Instancia1 = new Sencilla();
        Sencilla Instancia2 = new Sencilla();
        Instancia1.PropiedadDeInstancia = 8;
        Instancia2.PropiedadDeInstancia = 5;
    }
}