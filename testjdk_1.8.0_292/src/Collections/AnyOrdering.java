/*
 * DataStructureDecision
 */
package Collections;

public class AnyOrdering extends Order {  // AnyOrdering is a subtype of Order

    @Override
    // toString
    // This object (which is already a string!) is itself returned.
    // Returns: the string itself.
    public String toString(){
        return ("usando el método toString from class AnyOrdering");
    }
}
