public class Objeto3D{
    // Clase para definir un objeto 3D
    // Para establecer la dimensión de un objeto (anchura, profundidad, altura) en una medida dada (centimetros,pulgadas, etc), 
    // Los métodos sobrecargados NO PUEDEN SER IDENTICOS
    // Los métodos se determinan por la firma, se compone del nombre del método, número de parámetros y tipo de parámetros (por orden de colocación). 

    // Valores iniciales para las variables privadas
    // Propiedades
    // Accesibles desde fuera por los métodos 
    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetros";

    // Para nuestro ejemplo y mejor entendimiento primero crear 
    // los métodos 1 a 4 y 6 y 7
    // Después crear los métodos de asignación de valores (Dimensiones3D y TipoMedida)

    // ---------------------------------------------------------------------------------------
    // Estos dos métodos complementan a TODOS los DEMÁS métodos sobrecargados "Dimensiones"
    public void Dimensiones3D(double Ancho, double Alto, double Profundo){
        // permite asignar valores a las tres dimensiones espaciales de un objeto.
        X = Ancho;
        Y = Alto; 
        Z = Profundo;
    }
    public void TipoMedida(String Medida){
        // permite asignar un valor a la propiedad Tipo Medida.
        TipoMedida = Medida;
    }
    // ---------------------------------------------------------------------------------------

    // Cuando realicemos una llamada al método Dimensiones(...), el compilador podrá determinar 
    // a cual de los métodos nos referimos por la posición de los parámetros

    // 1. - Dimensiones(double Ancho, double Alto, double Profundo, String Medida)
    public void Dimensiones(double Ancho, double Alto,  double Profundo, String Medida){
        // Utilizando los métodos Dimensiones3D y TipoMedida se inicializan todas las variables
        // Dimensiones3D tiene el mismo orden de los tres parámetros iniciales
        // TipoMedida el cuarto parámetro 

        // Inicializa las dimensiones en el orden Ancho=X, Alto=Y, Profunto=Z
        Dimensiones3D( Ancho, Alto, Profundo );
        // Inicializa la médida
        TipoMedida( Medida );
    }

    // 2. - Dimensiones(String Medida, double Ancho, double Alto, double Profundo)
    public void Dimensiones(String Medida, double Ancho, double Alto, double Profundo){
        // Llama al método 1. - Dimensiones(double Ancho, double Alto, double Profundo, String Medida)
        // Que a su vez hace uso de los métodos Dimensiones3D y Tipo Medida
        // Que asignan los valores a las propiedades de la clase
        Dimensiones( Ancho, Alto, Profundo, Medida );
    }

    // 3. - Dimensiones(double Ancho, String Medida, double Alto, double Profundo)
    public void Dimensiones(double Ancho, String Medida, double Alto, double Profundo){
        // Llama al método 1. - Dimensiones(double Ancho, double Alto, double Profundo, String Medida)
        // Que a su vez hace uso de los métodos Dimensiones3D y Tipo Medida
        // Que asignan los valores a las propiedades de la clase
        Dimensiones( Ancho, Alto, Profundo, Medida );
    }
    // 4. - Dimensiones(double Ancho, double Alto, String Medida, double Profundo
    public void Dimensiones(double Ancho, double Alto, String Medida, double Profundo){
        // Llama al método 1. - Dimensiones(double Ancho, double Alto, double Profundo, String Medida)
        // Que a su vez hace uso de los métodos Dimensiones3D y Tipo Medida 
        // Que asignan los valores a las propiedades de la clase
        Dimensiones ( Ancho, Alto, Profundo, Medida );
    }

    // 6. - Dimensiones(String Medida)
    public void Dimensiones(String Medida){
        // Los métodos sobrecargados pueden contener distinto número de parámetros, 
        // llama al método TipoMedida que permite asignar un valor a la propiedad TipoMedida de la clase
        TipoMedida( Medida );
    }

    // 7. - Dimensiones(double Ancho, double Alto, double Profundo
    public void Dimensiones(double Ancho, double Alto, double Profundo){
        // Los métodos sobrecargados pueden contener distinto número de parámetros,
        // llama al método Dimensiones3D que permite asignar los valores a las propiedades X, Y, Z de la clase
        Dimensiones3D( Ancho, Alto, Profundo );
    }

    // Nos premite conocer el valor de las propiedades de la clase aumenando la funcionalidad de Objeto3D
    public double DimeAncho(){
        return X;
    }
    // Nos premite conocer el valor de las propiedades de la clase aumenando la funcionalidad de Objeto3D
    public double DimeAlto(){
        return Y;
    }
    // Nos premite conocer el valor de las propiedades de la clase aumenando la funcionalidad de Objeto3D
    public double DimeProfundo(){
        return Z;
    }
    // Nos premite conocer el valor de las propiedades de la clase aumenando la funcionalidad de Objeto3D
    public String DimeMedida(){
        return TipoMedida;
    }
}