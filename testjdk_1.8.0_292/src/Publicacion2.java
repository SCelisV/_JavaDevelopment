// Determina las propiedades básicas comunes a todas las publicaciones (libros, revistas, periódicos, etc.).
// Entre estas propiedades pueden definirse el número de páginas y el precio de la publicación:
// Publicacion es la Super Clase de Libro
// El mecanismo de herencia NO SÓLO actuá sobre las propiedades, lo hace sobre todos los miembros
// (métodos y propiedades) de las clases, de esta manera las clases se pueden completar con métodos
// Las SubClases heredan todos los miembros de su SuperClase, aunque NO todos los miembros tienen porque
// ser accesibles.
// Los miembros privados de una SuperClase NO SON directamente accesibles en sus SubClases.
// Los miembros protegidos de la SuperClase si son accesibles a Subclases situadas en paquetes diferentes a la SuperClase
// Existe la posibilidad de "ocultar" propiedades de la SuperClase, definiendo propiedades con el mismo nombre en la SubClase.
// En este caso en la SubClase, al referenciar directamente el nombre nos referimos a la propiedad de la SubClase.
// Existe la posibilidad de "ocultar" métodos similar al de las propiedades y se denomina redefinición, nos permite volver a definir el comportamiento de los métodos de la SuperClase, además su atributo de acceso debe ser el mismo o menos restrictivo que el original.
// para referirnos a las propiedades y a los métodos de la SuperClase tenemos que hacerlo con super.Nombre

public class Publicacion2{

    // propiedades
    // NO son directamente accesibles desde las SubClases Periodico y Libro
    private int NumeroDePaginas;
    private float Precio;

    // Constructores
    // vacio o sin parámetros, se llamá automaticamente si no ponemos "super" en algun constructor
    // de una SubClase
    Publicacion2(){
        NumeroDePaginas = 2;
        Precio = 0f;
    }
    // firma int
    Publicacion2(int NumeroDePaginas){
        setNumeroDePaginas(NumeroDePaginas);
    }
    // firma float 
    Publicacion2(float Precio){
        setPrecio(Precio);
    }
    // firma int, float 
    Publicacion2(int NumeroDePaginas, float Precio){
        // Invoca al constructor de la misma clase que coincide en firma con la llamada
        // Este invoca al constructor Publicacion2(int NumeroDePaginas)
        this(NumeroDePaginas);
        setPrecio(Precio);
    }
    // firma float, int
    Publicacion2(float Precio, int NumeroDePaginas){
        // Invoca al constructor de la misma clase que coincide en firma con la llamada
        // Este invoca al constructor Publicacion2(int NumeroDePaginas, float Precio)
        this(NumeroDePaginas, Precio);
    }

    // setters
    public void setNumeroDePaginas(int paginas){
        NumeroDePaginas = paginas;
    }
    public void setPrecio(float precio){
        Precio = precio;
    }

    // getters
    public int getNumeroDePaginas(){
        return NumeroDePaginas;
    }
    public float getPrecio(){
        return Precio;
    }

}
