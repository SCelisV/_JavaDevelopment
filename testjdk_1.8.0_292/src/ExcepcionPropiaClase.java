/*
Levanta la ExcepcionPropia cuando la variable recibe un 0.
*/
public class ExcepcionPropiaClase{
    int Valor = 0;
    // Este método es susceptible de lanzar la excepcion
    public void Metodo() throws ExcepcionPropia{
        if (Valor == 0){
            throw new ExcepcionPropia();
        }
    }
}
