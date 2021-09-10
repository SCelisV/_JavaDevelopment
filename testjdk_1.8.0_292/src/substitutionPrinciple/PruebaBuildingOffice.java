/*
Liskov Substitution Principle - OOP

si tienes una variable de un tipo determinado (ie: Building) puedes asignarla a un valor que sea un subtipo de ese tipo (ie: Office)
if you have a variable of a given type you can assign it to a value that is a subtype of that type

this substitution principle does not apply when: 
- ie  se podria pensar que si Office es un subtipo de Building, entonces una lista de tipo Office tambien es subtipo de Building
*/
package substitutionPrinciple;

import java.util.List;
import java.util.ArrayList;

public class PruebaBuildingOffice{

    // Este método recibe objetos de tipo Building, pero también subtipos de este, por ejemplo Office
    static void build(Building building){
        System.out.println("Construyendo un nuevo... " + building.toString());
    }

    // Este método recibe una lista de buildings como argumento
    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size(); i++){
            System.out.println(i + 1 + ": " +  buildings.get(i).toString());
        }
    }


    public static void main(String[] args){

        // Creo los objetos 
        Building building = new Building();
        Office office = new Office();  // Office is a subtype of Building

        // usando el método build(Building building) pasandole un Building como parámetro
        build(building);    // imprime: Construyendo un nuevo... usando el método toString from class Building

        // This is a substitution principle
        // usando el método build(Building building) pasandole un Office como parámetro
        build(office);      // imprime: Construyendo un nuevo... usando el método toString from class Office

        /* */
        // This is substitution principle
        List<Building> buildings = new ArrayList();

        // adds some Building/Office to a list of Building
            buildings.add(new Building());
            buildings.add(new Office()); // passes in the list to the method // This is a substitution principle

        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Buildings como argumento
        printBuildings(buildings);
        // 1: usando el método toString from class Building
        // 2: usando el método toString from class Office
        /* */

        /*
        // This is NOT substitution principle
        List<Office> offices = new ArrayList();

        // adds some Office to a list of Office
            offices.add(new Office());
            offices.add(new Office());

        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Buildings como argumento
        // y teniendo en cuenta que Office es subtipo de Building deberia funcionar... pero NO, da un error de compilacion
        // Substitution principle lets you assign variable of a given type to the subtype 
        // BUT NOT APPLY with types of lists
        printBuildings(offices);
        */
        /* 
        // If a Library is declared as a subtype of Building, 
        // and you have a print method that accepts parameters of type Building, then which code snippet is not legal?
        // 1. this is ilegal
        List<Library> libraries = new ArrayList();
        // adds some Building/Library to a list of Libraries
            libraries.add(new Library());
        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Library como argumento
        printBuildings(libraries);
        */
        /* 
        // 2. 
        List<Building> libraries = new ArrayList();
        // adds some Building/Library to a list of Buildings
            libraries.add(new Library());
        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Library como argumento
        printBuildings(libraries);
        */
        /*
        // 3. 
        List<Building> buildings = new ArrayList();
        // adds some Building to a list of Buildings
            buildings.add(new Building());
        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Building como argumento
        printBuildings(buildings);
        */
        /* 
        // 4. 
        List<Building> buildings = new ArrayList();
        // adds some Building to a list of Buildings
            buildings.add(new Library());
        // utilizando este método para imprimir printBuildings(List<Building> buildings)
        // que recibe una lista de Building como argumento
        printBuildings(buildings);
        */

    }

}
