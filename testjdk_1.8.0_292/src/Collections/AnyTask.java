/*
 * DataStructureDecision
 */
package Collections;

public class AnyTask extends Task {  // AnyTask is a subtype of Task

    @Override
    // toString
    // This object (which is already a string!) is itself returned.
    // Returns: the string itself.
    public String toString(){
        return ("usando el método toString from class AnyTask");
    }
}
