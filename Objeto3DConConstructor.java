public class Objeto3DConConstructor{
    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetros";

    public void Dimensiones3D( double Ancho, double Alto, double Profundo){
        X = Ancho; Y = Alto; Z = Profundo;
    }
    public void TipoMedida ( String Medida){
        TipoMedida = Medida;
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    Objeto3DConConstructor( double Ancho, double Alto, double Profundo, String Medida){
        Dimensiones3D( Ancho, Alto, Profundo );
        TipoMedida( Medida );
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    //this invoca a los constructores de esta clase cuya firma coincida con la firma de las instrucciones llamantes
    Objeto3DConConstructor( String Medida, double Ancho, double Alto, double Profundo){
        this( Ancho, Alto, Profundo, Medida );
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    Objeto3DConConstructor( double Ancho, String Medida, double Alto, double Profundo){
        this ( Ancho, Alto, Profundo, Medida);
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    Objeto3DConConstructor( double Ancho, double Alto, String Medida, double Profundo ){
        this ( Ancho, Alto, Profundo, Medida);
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    Objeto3DConConstructor( double Ancho, double Alto, double Profundo){
        Dimensiones3D ( Ancho, Alto, Profundo);
    }
    //Constructores - no tiene la referencia del atributo de acceso y no devuelve ningún valor, tampoco pone la palabara void.
    Objeto3DConConstructor( String Medida ){
        TipoMedida( Medida );        
    }
    public double DimeAncho(){
        return X;
    }
    public double DimeAlto(){
        return Y;
    }
    public double DimeProfundo(){
        return Z;
    }
    public String DimeMedida(){
        return TipoMedida;
    }
}