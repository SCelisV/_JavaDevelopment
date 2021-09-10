/*
No es posible hacer referencia a una propiedad de instancia o un método de instancia desde un método estático. 
(o non-static methods - NECESITA UNA INSTANCIA para usarlo) 
*/

public class PruebaClassString{
    public static void main (String[] args){

        String fname = "Sonia Patricia";
        String lname = "Celis Vasquez";
        // becouse fname and lname son instancias de String - .chartA (non-static method ór instance method)
        char cFname = fname.charAt(0);
        char cLname = lname.charAt(0);
        System.out.println("Iniciales: " + cFname + cLname);
    }
}