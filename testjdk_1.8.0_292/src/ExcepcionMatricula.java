/*
Introduce por teclado de mátriculas de Vehiculos en un país donde las matriculas se componen de 8 caracteres, siendo obligatoriamente el primero de ellos una letra.
Si alguna matricula introducida por el usuario no sigue el formato esperado se recogerá la interrupción oportuna y se escribirá un aviso en la consola.
En este caso vamos a dotar de un estado (propiedad) a la clase que define la excepción
Esta clase hereda de Exception y los constructores permiten iniciar el estado de la clase a través de los constructores de la SuperClase
*/
public class ExcepcionMatricula extends Exception{

    // propiedades de la clase
    private int Problema = 0;
    static final int MAL_TAMANIO = -1;
    static final int MAL_LETRA = -2;

    // Constructores
    ExcepcionMatricula(){}
    ExcepcionMatricula(String s){
        super(s);
    }
    ExcepcionMatricula(int problema){
        this.Problema = problema;
    }
    
    // getters
    public int getProblema(){
        return Problema;
    }
    
}

