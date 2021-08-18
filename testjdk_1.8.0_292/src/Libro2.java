// Creamos un Libro especifico a partir de la clase Publicacion
// Esta clase extiende de la clase Publicación
// Libro es una clase derivada o SubClase de Publicacion.
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


public class Libro2 extends Publicacion2{

    // propiedades 
    private String Titulo;
    private String TipoPortada;
    private String ISBN;
    private String NombreAutor;
    private String Editorial;

    // Constructores
    // vacio - no define explicitamente ninguna propiedad.
    // Aunque no se impementará el compilador realizaría implicitamente las mismas acciones.
    Libro2(){
        super();
        Titulo = null;
        TipoPortada = null;
        ISBN = null;
        NombreAutor = null;
        Editorial = null;
    }    
    // Sólo las propiedades de la SubClase firma String, String, String, String, String
    Libro2(String Titulo, String TipoPortada, String ISBN, String NombreAutor, String Editorial){
        super();
        this.Titulo = Titulo;
        this.TipoPortada = TipoPortada;
        this.ISBN = ISBN; 
        this.NombreAutor = NombreAutor;
        this.Editorial = Editorial;
    }
    // Sólo las propiedades de la SuperClase firma int, float
    Libro2(int NumeroDePaginas, float Precio){
        super(NumeroDePaginas, Precio);
        this.Titulo = null;
        this.TipoPortada = null;
        this.ISBN = null; 
        this.NombreAutor = null;
        this.Editorial = null;
    }
    // TODAS las propiedades
    // las propiedades de la SubClase: firma String, String, String, String, String
    // las propiedades de la SuperClase: firma int, float 
    Libro2(String Titulo, String TipoPortada, String ISBN, String NombreAutor, String Editorial,
           int NumeroDePaginas, float Precio){
               super(NumeroDePaginas, Precio);
               this.Titulo = Titulo;
               this.TipoPortada = TipoPortada;
               this.ISBN = ISBN;
               this.NombreAutor = NombreAutor;
               this.Editorial = Editorial;
    }
    // setters 
    public void setTitulo(String titulo){
        Titulo = titulo;
    }
    public void setTipoPortada(String tipoPortada){
        TipoPortada = tipoPortada;
    }
    public void setISBN(String isbn){
        ISBN = isbn;
    }
    public void setNombreAutor(String nombreAutor){
        NombreAutor = nombreAutor ;
    }
    public void setEditorial(String editorial){
        Editorial = editorial;
    }
    // getters
    public String getTitulo(){
        return Titulo;
    }
    public String getTipoPortada(){
        return TipoPortada;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getNombreAutor(){
        return NombreAutor;
    }
    public String getEditorial(){
        return Editorial;
    }
}
