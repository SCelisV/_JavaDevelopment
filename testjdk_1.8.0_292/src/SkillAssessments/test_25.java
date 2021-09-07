package SkillAssessments;

import java.util.List;
import java.util.ArrayList;

public class test_25 {


    public static void main(String[] args){

        /* You have a list of Bunny objects that you want to sort by weight using Collections.sort.
            What modification would you make to the Bunny class?

            npi..
            Add the keyword default to the weight variable
            Implement the Comparable interface by overriding the compareTo method
            Implement Sortable and override the sortBy method
            Override the equals method inside the Bunny class
            
            revisar test_15.java

        */

        Bunny oneBunny = new Bunny("Sonia", 70.0f);
        Bunny twoBunny = new Bunny("Solete", 65.0f);
        Bunny threeBunny = new Bunny("Maytete", 68.0f);

        // lista de Bunny
        List<Bunny> list=new ArrayList<Bunny>();  

        list.add(oneBunny);
        list.add(twoBunny);
        list.add(threeBunny);

        if (list.isEmpty()){ // si lista vacia
        // if (!list.isEmpty()){ // si lista NO vacia

            System.out.println("isEmpty: " + list.isEmpty());
            for(Bunny b:list){  
                System.out.println(b.getName()+" "+b.getWeight());  
            } 

        }

        Bunny listBunny = new Bunny(list);
        listBunny.printer(list);
        listBunny.sorted(list);
        
    }
}
