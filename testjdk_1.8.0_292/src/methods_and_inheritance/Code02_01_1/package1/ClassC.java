package methods_and_inheritance.Code02_01_1.package1;

public class ClassC {

  protected String message = " World";

  // el método es definido como protegido es visible en el package1 y en las subclases
  // porque la ClassA y la ClassC estan en el mismo package1
  protected void print(){
    System.out.println(message);  
  }
    
}
