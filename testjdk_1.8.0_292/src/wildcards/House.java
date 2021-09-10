/*
wildcard is essentially an unknown type, give you more flexibility when writing methods
*/
package wildcards;

public class House extends Building {  // House is a subtype of Building

    public int numberOfRooms = 10;

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    // toString
    // This object (which is already a string!) is itself returned.
    // Returns: the string itself.
    public String toString(){
        return ("usando el método toString from class House");
    }
}
