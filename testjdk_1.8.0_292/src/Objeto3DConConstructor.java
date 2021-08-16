public class Objeto3DConConstructor {

    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetros";

    // ---------------------------------------------------------------------------------------
    // Estos dos métodos complementan a TODOS los DEMÁS métodos sobrecargados
    // "Dimensiones"
    public void Dimensiones3D(double Ancho, double Alto, double Profundo) {
        // permite asignar valores a las tres dimensiones espaciales de un objeto.
        X = Ancho;
        Y = Alto;
        Z = Profundo;
    }

    public void TipoMedida(String Medida) {
        // permite asignar un valor a la propiedad Tipo Medida.
        TipoMedida = Medida;
    }
    // ---------------------------------------------------------------------------------------}

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 1. - Dimensiones(double Ancho, double Alto, double Profundo, String Medida)
    Objeto3DConConstructor(double Ancho, double Alto, double Profundo, String Medida) {
        Dimensiones3D(Ancho, Alto, Profundo);
        TipoMedida(Medida);
    }

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 2. - Dimensiones(String Medida, double Ancho, double Alto, double Profundo)
    Objeto3DConConstructor(String Medida, double Ancho, double Alto, double Profundo) {
        // this invoca a los constructores de esta clase cuya firma coincida con la
        // firma de las instrucciones llamantes
        this(Ancho, Alto, Profundo, Medida);
    }

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 3. - Dimensiones(double Ancho, String Medida, double Alto, double Profundo)
    Objeto3DConConstructor(double Ancho, String Medida, double Alto, double Profundo) {
        // this invoca a los constructores de esta clase cuya firma coincida con la
        // firma de las instrucciones llamantes
        this(Ancho, Alto, Profundo, Medida);
    }

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 4. - Dimensiones(double Ancho, double Alto, String Medida, double Profundo
    Objeto3DConConstructor(double Ancho, double Alto, String Medida, double Profundo) {
        // this invoca a los constructores de esta clase cuya firma coincida con la
        // firma de las instrucciones llamantes
        this(Ancho, Alto, Profundo, Medida);
    }

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 6. - Dimensiones(String Medida)
    Objeto3DConConstructor(String Medida) {
        TipoMedida(Medida);
    }

    // Constructores - no tiene la referencia del atributo de acceso y no devuelve
    // ningún valor, tampoco pone la palabara void.
    // 7. - Dimensiones(double Ancho, double Alto, double Profundo
    Objeto3DConConstructor(double Ancho, double Alto, double Profundo) {
        Dimensiones3D(Ancho, Alto, Profundo);
    }

    public double DimeAncho() {
        return X;
    }

    public double DimeAlto() {
        return Y;
    }

    public double DimeProfundo() {
        return Z;
    }

    public String DimeMedida() {
        return TipoMedida;
    }
}