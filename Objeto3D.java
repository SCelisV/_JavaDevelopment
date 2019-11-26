public class Objeto3D{
    // Valores iniciales para las variables privadas
    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetros";
    // Estos dos métodos complementan los dos métodos Dimensiones con parámetros diferentes
    // Permite asignar valores a las tres dimensiones espaciales de un objeto.
    public void Dimensiones3D(double Alto, double Ancho, double Profundo){
        X = Ancho;
        Y = Alto; 
        Z = Profundo;
    }
    // Permite asignar un valor a la propiedad Tipo Medida.
    public void TipoMedida(String Medida){
        TipoMedida = Medida;
    }
    // Cuando realicemos una llamada al método Dimensiones(...), el compilador podrá determinar 
    // a cual de los métodos nos referimos por la posición del parámetro de tipo String
    // 1. Método sobrecargado Dimensiones: 
    public void Dimensiones(double Ancho, double Alto,  double Profundo, String Medida){
        Dimensiones3D( Ancho, Alto, Profundo );
        TipoMedida( Medida );
    }
    // 2. Llaman al primer método dimensiones ordenando adecuadamenet los argumentos de la invocación
    public void Dimensiones(String Medida, double Ancho, double Alto, double Profundo){
        Dimensiones( Ancho, Alto, Profundo, Medida );
    }
    // 3. Llaman al primer método dimensiones ordenando adecuadamenet los argumentos de la invocación
    public void Dimensiones(double Ancho, String Medida, double Alto, double Profundo){
        Dimensiones( Ancho, Alto, Profundo, Medida );
    }
    // 4. Llaman al primer método dimensiones ordenando adecuadamenet los argumentos de la invocación
    public void Dimensiones(double Ancho, double Alto, String Medida, double Profundo){
        Dimensiones ( Ancho, Alto, Profundo, Medida );
    }
    // 5. Los métodos sobrecargados pueden contener distinto número de parámetros, 
    // tienen sentido si suponenmos el método adicional "TipoMedida" que lo complemente
    public void Dimensiones(String Medida){
        TipoMedida( Medida );
    }
    // 6. Los métodos sobrecargados pueden contener distinto número de parámetros,
    // tienen sentido si suponenmos el método adicional "Dimensiones3D" que lo complemente
    public void Dimensiones(double Ancho, double Alto, double Profundo){
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