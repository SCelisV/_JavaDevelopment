/*
wildcard is essentially an unknown type, give you more flexibility when writing methods
*/
package wildcards;

public class Office extends Building {  // Office is a subtype of Building


    @Override
    // toString
    // This object (which is already a string!) is itself returned.
    // Returns: the string itself.
    public String toString(){
        return ("usando el método toString from class Office");
    }
}
