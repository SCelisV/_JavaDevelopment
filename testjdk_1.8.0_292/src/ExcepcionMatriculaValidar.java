/*
Valida las mátriculas, comprueba el formato del parámetro suministrado y si es necesario levanta (throws) la ExcepcionMatricula
Si la longitud de la mátricula es distinta de 8 caracteres, se crea y levanta una excepción ExcepcionMatricula con estado inicial ExepcionMatricula.MAL_TAMANIO
Si el caracter inicial no es una letra, se crea y levanta una ExcepcionMatricula con estado inicial MAL_LETRA
El método privado sólo es visible en esta clase.
*/
public class ExcepcionMatriculaValidar{

    // El método privado sólo es visible en esta clase.
    // compara una posición de un substring dado con una expresión regular [A-Za-Z], pasada por parametro al método matches
    private boolean UnaLetra(String matricula){
        return(matricula.substring(0, 1).matches("[A-Za-z]"));
    }

    public void Validar (String matricula) throws ExcepcionMatricula {
        if (matricula.length() != 8)
            throw new ExcepcionMatricula(ExcepcionMatricula.MAL_TAMANIO);
        else if (!UnaLetra(matricula)) 
                throw new ExcepcionMatricula(ExcepcionMatricula.MAL_LETRA);
            else {} // matricula bien formada
    }
}