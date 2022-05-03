/*
Una excepción definida por el programador hereda de la clase Exception.
Se incluye como mínimo el constructor vacio y 
otro que contenga un String como argumento, inicializado automáticamente con el nombre de la clase (en Throwable), el texto en este constructor se añadirá al nombre de lal clase insertado por la SuperClase.
*/
public class ExcepcionPropia extends Exception{

    // define el constructor vacio
   ExcepcionPropia(){
       super("Esta es mi propia excepción");
   } 
   // define el constructor con un String como argumento,
   // añade un texto cuando se realiza la instanciación de la clase
   ExcepcionPropia(String s){
       super(s);
   }
}
