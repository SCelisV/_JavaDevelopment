// Comprobar que un libro contiene las propiedades de la Super Clase como de la Sub Clase:
public class PruebaLibroPeriodico {

    public static void main(String[] args){

        // Instanciación
        Libro MiLibro = new Libro();
        Periodico MiPeriodico = new Periodico();

        // propiedades SuperClase Publicacion
        // NO son directamente accesibles desde las SubClases Periodico y Libro
        MiLibro.setNumeroDePaginas(589);
        MiLibro.setPrecio(190.00f);
        MiPeriodico.setNumeroDePaginas(30);
        MiPeriodico.setPrecio(1.00f);

        // propiedades SubClase Libro
        MiLibro.setTitulo("JAVA a través de ejemplos");
        MiLibro.setTipoPortada("Blanda");
        MiLibro.setISBN("9788478975495");
        MiLibro.setNombreAutor("Jesus Bobadilla");
        MiLibro.setEditorial("RA-MA");

        // propiedades SubClase Periodico
        MiPeriodico.setNombre("El Tiempo");
        MiPeriodico.setFecha("18/08/2021");

        // Imprimir MiLibro
        System.out.println("Datos de Mi Libro: ");
        System.out.println("Titulo: " + MiLibro.getTitulo());
        System.out.println("Tipo de Portada: " + MiLibro.getTipoPortada());
        System.out.println("ISBN: " + MiLibro.getISBN());
        System.out.println("Autor: " + MiLibro.getNombreAutor());
        System.out.println("Editorial " + MiLibro.getEditorial());
        System.out.println("Páginas: " + MiLibro.getNumeroDePaginas());
        System.out.println("Precio: " + MiLibro.getPrecio());

        // Imprimir MiPeriodico
        System.out.println("Datos de Mi Periodico: ");
        System.out.println("Nombre: " + MiPeriodico.getNombre());
        System.out.println("Fecha: " + MiPeriodico.getFecha());
        System.out.println("Páginas: " + MiPeriodico.getNumeroDePaginas());
        System.out.println("Precio: " + MiPeriodico.getPrecio());
        
    }
    
}
