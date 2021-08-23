/*
PruebaExcepcionMatricula recoje las matrículas que introducen los usuarios.
La recuperación de los errores de formato se escribirá en el bloque catch correspondiente:

*/
public class PruebaExcepcionMatricula{

    public static void main(String[] args){

        // propiedades
        ExcepcionMatriculaValidar UnaMatricula = new ExcepcionMatriculaValidar();

        do {
          try {
              /*
              Se puede reemplazar por la llamada a un método que sea capas de leer de la consola
              System.out.println ("Introduce la matricula: ");
              String matricula = Teclado.Lee_String();
              */
              String matricula = "12345678";
              // Validar(matricula), levanta la excepción que será recogida y tratada en el catch
              UnaMatricula.Validar(matricula);

              
          } catch (ExcepcionMatricula e) {
              // tratamos la causa de la excepcion
              switch (e.getProblema()){
                  case ExcepcionMatricula.MAL_TAMANIO:
                    System.out.println("Tamaño incorrecto");
                    break;
                  case ExcepcionMatricula.MAL_LETRA:
                    System.out.println("Letra inicial no incluida");
                    break;
                  default:
                    System.out.println("Matricula correcta");
                    break;
              }
          }  
        } while (true);
    }
}