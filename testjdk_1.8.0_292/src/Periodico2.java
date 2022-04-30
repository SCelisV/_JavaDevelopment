// Creamos un Periodico especifico a partir de la clase Publicacion
// Esta clase extiende de la clase Publicación
// Periodico es una clase derivada o SubClase de Publicacion.
// El mecanismo de herencia NO SÓLO actuá sobre las propiedades, lo hace sobre todos los miembros
// (métodos y propiedades) de las clases, de esta manera las clases se pueden completar con métodos
// Las SubClases heredan todos los miembros de su SuperClase, aunque NO todos los miembros tienen porque
// ser accesibles.
// Los miembros privados de una SuperClase NO SON directamente accesibles en sus SubClases.
// Los miembros protegidos de la SuperClase si son accesibles a Subclases situadas en paquetes diferentes a la SuperClase.
// Existe la posibilidad de "ocultar" propiedades de la SuperClase, definiendo propiedades con el mismo nombre en la SubClase.
// En este caso en la SubClase, al referenciar directamente el nombre nos referimos a la propiedad de la SubClase.
// Existe la posibilidad de "ocultar" métodos similar al de las propiedades y se denomina redefinición, nos permite volver a definir el comportamiento de los métodos de la SuperClase, además su atributo de acceso debe ser el mismo o menos restrictivo que el original.
// para referirnos a las propiedades y a los métodos de la SuperClase tenemos que hacerlo con super.Nombre

public class Periodico2 extends Publicacion2{

    // propiedades
    private String Nombre;
    private String Fecha;

    // Constructores.
    // vacio - no define explicitamente ninguna propiedad.
    // Aunque no se impementará el compilador realizaría implicitamente las mismas acciones.
    Periodico2(){
        super();
        Nombre = null;
        Fecha = null;
    }
    // Sólo las propiedades de la SubClase: firma String, String 
    Periodico2(String Nombre, String Fecha){
        super();
        this.Nombre = Nombre;
        this.Fecha = Fecha;
    }
    // Sólo las propiedades de la SuperClase: firma int, float 
    Periodico2(int NumeroDePaginas, float Precio){
        super(NumeroDePaginas, Precio);
        this.Nombre = null;
        this.Fecha = null;
    }
    // TODAS las propiedades
    // las propiedades de la SubClase: firma String, String 
    // las propiedades de la SuperClase: firma int, float 
    Periodico2(String Nombre, String Fecha,
                int NumeroDePaginas, float Precio){
        super(NumeroDePaginas, Precio);
        this.Nombre = Nombre;
        this.Fecha = Fecha;
    }

    // setters
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    
    // getters
    public String getNombre(){
        return Nombre;
    }
    public String getFecha(){
        return Fecha;
    }
}
