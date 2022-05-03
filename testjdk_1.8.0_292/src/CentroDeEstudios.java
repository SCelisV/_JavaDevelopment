// Ejemplo de interfaz contiene constantes y métodos
/*
public interface CentroDeEstudios {
    byte NumeroDePisos = 5;
    byte NumeroDeAulas = 25;
    byte NumeroDeDespachos = 10;
    // resto de constantes
    short NumeroDeAprobados(float[] Notas);
    short NumeroDeSuspensos(float[] Notas);
    float NotaMedia(float[] Notas);
    float Varianza(float[] Notas);
    // resto de métodos
}
*/

// Definir una interface basada en otra. - extends.
/*
public interface CentroDeEstudios extends DatosCentroDeEstudios{
    short NumeroDeAprobados(float[] Notas);
    short NumeroDeSuspensos(float[] Notas);
    float NotaMedia(float[] Notas);
    float Varianza(float[] Notas);
    // resto de métodos
}
*/

// contiene constantes y métodos
// SuperInterface extiende a varias SuperInterfaces
// Herencia múltiple
public interface CentroDeEstudios extends DatosCentroDeEstudios, CalculosCentroDeEstudios{
    // otros posibles métodos y constantes
}