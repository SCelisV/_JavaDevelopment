/*
Liskov Substitution Principle - OOP

si tienes una variable de un tipo determinado puedes asignarla a un valor que sea un subtipo de ese tipo
if you have a variable of a given type you can assign it to a value that is a subtype of that type

Esta clase simplemente sobreescribe el métod toString
*/
package substitutionPrinciple;

public class Building {


    @Override
    // toString
    // This object (which is already a string!) is itself returned.
    // Returns: the string itself.
    public String toString(){
        return ("usando el método toString from class Building");
    }
}
