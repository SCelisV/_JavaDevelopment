/*
wildcard is essentially an unknown type, give you more flexibility when writing methods
para estar seguro de when you use extends or super with wildcars, think about invariables and outvariables 
método recibe una lista como argumento y esta lista PROVIDES DATA se usa INSIDE the method = INVARIABLE = EXTENDS
método recibe una lista como argumento y se ADDICIONA - GIVE DATA to the list - OUTVARIABLE - SUPER 
NO ES BUENA IDEA USAR WOLDCARS COMO RETURN DE UN METODO - AFECTA HIERARCHIES 
*/
package wildcards;

import java.util.List;
import java.util.ArrayList;

public class Prueba2BuildingOfficeHouse {

    // Este método recibe objetos de tipo Building, pero también subtipos de este, por ejemplo Office
    static void build(Building building){
        System.out.println("Construyendo un nuevo... " + building.toString());
    }

    /*
    // Este método recibe una lista de buildings como argumento, esta lista PROVIDES DATA se usa INSIDE the method = INVARIABLE = EXTENDS
    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size(); i++){
            System.out.println(i + 1 + ": " +  buildings.get(i).toString() + " " + (i+1));
        }
    }
 	*/
    
    // Este método recibe una lista de buildings como argumento, esta lista PROVIDES DATA se usa INSIDE the method = INVARIABLE = EXTENDS
    // to solution simple and quicker is to use wildcards
    // List<? extends: means now pass in list of any type that extends the building class
    static void printBuildings(List<? extends Building> buildings){
        for (int i = 0; i < buildings.size(); i++){
            System.out.println(i + 1 + ": " +  buildings.get(i).toString() + " " + (i+1));
        }
    }

    // Este método recibe una lista de Houses como argumento y adiciona una nueva house
    // en este momento sólo le podemos pasar una lista de houses al método
    /*
    static void addHouseToList(List<House> buildings){
        buildings.add(new House());
        System.out.println();
    }
    */
    // Este método recibe una lista de Houses como argumento y ADDICIONA - GIVE DATA to the list - adiciona una nueva house - OUTVARIABLE - SUPER 
    // Si queremos que sea posible pasar cualquier tipo de subtipo Building
    // debo usar WILDCARS List<? super: means now pass in list of buildings type becouse Buildings is super type of House.

    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }

    public static void main(String[] args){

        // Creo los objetos 
        Building building = new Building();
        Office office = new Office();  // Office is a subtype of Building
        House house = new House();  // House is a subtype of Building

        // usando el método build(Building building) pasandole un Building como parámetro
        build(building);    // imprime: Construyendo un nuevo... usando el método toString from class Building

        // This is a substitution principle
        // usando el método build(Building building) pasandole un Office como parámetro
        build(office);      // imprime: Construyendo un nuevo... usando el método toString from class Office

        // This is a substitution principle
        // usando el método build(Building building) pasandole un House como parámetro
        build(house);      // imprime: Construyendo un nuevo... usando el método toString from class House
        
        /* */
        System.out.println("\n");
        System.out.println("add Building/Office/House and print buildings: "); // add Building/Office/House and print buildings: 
        // This is substitution principle
        List<Building> buildings = new ArrayList();

        // adds some Building to a list of Building
            buildings.add(new Building());
            buildings.add(new Building());
            buildings.add(new Building());
            
            buildings.add(new Office()); // passes in the list to the method // This is a substitution principle
            buildings.add(new House()); // passes in the list to the method // This is a substitution principle

        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Buildings como argumento
        printBuildings(buildings);
/*
1: usando el método toString from class Building 1
2: usando el método toString from class Building 2
3: usando el método toString from class Building 3
4: usando el método toString from class Office 4
5: usando el método toString from class House 5
 */
        // This is NOT substitution principle 
        System.out.println("\n");
        System.out.println("add Office and print offices: "); // add Office and print offices: 
        List<Office> offices = new ArrayList();

        // adds some Office to a list of Office
            offices.add(new Office());
            offices.add(new Office());

        // utilizando este método para imprimir printBuildings(List<? extends Building> buildings)
        // Substitution principle lets you assign variable of a given type to the subtype BUT NOT APPLY with types of lists
        // One solution  would be to create a new method to each different subtype of building
        // Other solution simpler and quicker is to use WILDCARDS
        printBuildings(offices);
        /*
1: usando el método toString from class Office 1
2: usando el método toString from class Office 2 
        */

        // This is NOT substitution principle
        System.out.println("\n");
        System.out.println("add Houses and print houses: "); // add Houses and print houses: 
        List<House> houses = new ArrayList();

        // adds some House to a list of houses
            houses.add(new House());
            houses.add(new House());     

        // utilizando este método para imprimir printBuildings(List<? extends Building> buildings)
        // Substitution principle lets you assign variable of a given type to the subtype BUT NOT APPLY with types of lists
        // One solution  would be to create a new method to each different subtype of building
        // Other solution simpler and quicker is to use WILDCARDS
        printBuildings(houses);

        /*
1: usando el método toString from class House 1
2: usando el método toString from class House 2
         */


        System.out.println("\n");
        System.out.println("add houses and print houses: "); // add houses and print houses: 
        addHouseToList(houses);
        printBuildings(houses);
        /*
1: usando el método toString from class House 1
2: usando el método toString from class House 2
3: usando el método toString from class House 3
         */

        System.out.println("\n");
        System.out.println("add buildings and print buildings: "); // add buildings and print buildings: 
        addHouseToList(buildings);
        printBuildings(buildings);
/*
1: usando el método toString from class Building 1
2: usando el método toString from class Building 2
3: usando el método toString from class Building 3
4: usando el método toString from class Office 4
5: usando el método toString from class House 5
6: usando el método toString from class House 6
 */

        System.out.println("\n");
        System.out.println("add libraries, new Library and print libraries: ");
        List<Building> libraries = new ArrayList();
        addHouseToList(libraries);    
        libraries.add(new Library());
        printBuildings(libraries);
/*
        1: usando el método toString from class House 1
        2: usando el método toString from class Library 2
*/
        
        System.out.println("\n");
        System.out.println("add libraries, new Buildings and print buildings: ");
        addHouseToList(libraries);    
        buildings.add(new Building());
        printBuildings(buildings);
/*
1: usando el método toString from class Building 1
2: usando el método toString from class Building 2
3: usando el método toString from class Building 3
4: usando el método toString from class Office 4
5: usando el método toString from class House 5
6: usando el método toString from class House 6
7: usando el método toString from class Building 7
*/

        System.out.println("\n");
        System.out.println("add new Library and print buildings: ");
        buildings.add(new Library());
        printBuildings(buildings);
/*
1: usando el método toString from class Building 1
2: usando el método toString from class Building 2
3: usando el método toString from class Building 3
4: usando el método toString from class Office 4
5: usando el método toString from class House 5
6: usando el método toString from class House 6
7: usando el método toString from class Building 7
8: usando el método toString from class Library 8      
*/

        System.out.println("\n");
        System.out.println("print libraries: ");
        printBuildings(libraries);
/*
1: usando el método toString from class House 1
2: usando el método toString from class Library 2
3: usando el método toString from class House 3
*/      

    }


}
