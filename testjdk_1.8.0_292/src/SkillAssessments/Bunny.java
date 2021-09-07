/* You have a list of Bunny objects that you want to sort by weight using Collections.sort

   What modification would you make to the Bunny class?

        Add the keyword default to the weigh variable
        Implement the Comparable interface by overriding the compareTo method
        Implement Sortable and override the sortBy method
        Override the equals method inside the Bunny class
*/

package SkillAssessments;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bunny {

    // propiedades
    private String Name;
    private float Weight;
    List<Bunny> list=new ArrayList<Bunny>();  

    // Constructor
    Bunny(String name, float weight){
        setName(name);
        setWeight(weight);
    }
    Bunny(float weight, String name){
        this(name, weight);
    }
    Bunny(List<Bunny> list){}
    // setters
    public void setName(String name){
        Name = name;
    }
    public void setWeight(float weight){
        Weight = weight;
    }
    // imprime la lista
    public void printer(List<Bunny> list){
        System.out.println("imprimiendo...");
        for(Bunny b:list){  
            System.out.println(b.getName()+" "+b.getWeight());  
        } 
    }
    public void sorted(List<Bunny> list){
    // public static <T extends Comparable<? super T>> void sort​(List<Bunny> list){
        System.out.println("ordenando...");
    }
    // getters
    public float getWeight(){
        return Weight;
    }
    public String getName(){
        return Name;
    }
}



    // métodos
    //public List sortBy(List list){}
