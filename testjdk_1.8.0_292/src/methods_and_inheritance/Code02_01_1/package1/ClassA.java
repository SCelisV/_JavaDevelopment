package methods_and_inheritance.Code02_01_1.package1;

public class ClassA {

   // no tienen modificador default or package private solo es visible para el package1
   // void print(){
   public void print(){
        // creamos unsa instancia de la ClassC
        ClassC c = new ClassC();
        // usamos la referencia para modificar el mensaje variable
        c.message = "World!";
        // llama al método print definido en el objeto ClassC,
        // la ClaseA puede ver los miembros protegidos de la ClassC
        c.print();
   }
    
}
