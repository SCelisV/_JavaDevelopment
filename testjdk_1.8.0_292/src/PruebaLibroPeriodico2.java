// Comprobar que los libros y los periodicos creados
// contienen las propiedades de la SuperClase como de la SubClase:
public class PruebaLibroPeriodico2{

    public static void main(String[] args){

        // Instanciación
        Libro2 MiLibro2 = new Libro2();
        Libro2 MiOtroLibro2 = new Libro2("JAVA a través de ejemplos", "Blanda", "9788478975495", "Jesus Bobadilla", "RA-MA", 589, 190.00f);

        Periodico2 MiPeriodico2 = new Periodico2();
        Periodico2 MiOtroPeriodico2 = new Periodico2("El Tiempo", "18/08/2021", 30, 1.00f);

        ImprimirLibro (MiLibro2);
        ImprimirLibro (MiOtroLibro2);
        ImprimirPeriodico(MiPeriodico2);
        ImprimirPeriodico(MiOtroPeriodico2);
    }


    // ImprimirLibro
    // Imprime los Datos de los libros que hemos creado
    // Utilizamos métodos de la SuperClase y de la SubClase
    private static void ImprimirLibro(Libro2 Libro){
        System.out.println("Datos de Mi Libro: " + Libro);
        System.out.println("Titulo: " + Libro.getTitulo());
        System.out.println("Tipo de Portada: " + Libro.getTipoPortada());
        System.out.println("ISBN: " + Libro.getISBN());
        System.out.println("Autor: " + Libro.getNombreAutor());
        System.out.println("Editorial " + Libro.getEditorial());
        System.out.println("Páginas: " + Libro.getNumeroDePaginas());
        System.out.println("Precio: " + Libro.getPrecio());
    }

    // ImprimirPeriodico 
    // Imprime los Datos de los Periodicos que hemos creado
    // Utilizamos métodos de la SuperClase y de la SubClase
    private static void ImprimirPeriodico(Periodico2 Periodico){
        String Nombre, Fecha;
        int Paginas;
        float Precio;
        Nombre = Periodico.getNombre();
        Fecha = Periodico.getFecha();
        Paginas = Periodico.getNumeroDePaginas();
        Precio = Periodico.getPrecio();

        System.out.println("Datos de Mi Periodico: " + Periodico);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Fecha: " + Fecha);
        System.out.println("Páginas: " + Paginas);
        System.out.println("Precio: " + Precio);
    }
    
}
