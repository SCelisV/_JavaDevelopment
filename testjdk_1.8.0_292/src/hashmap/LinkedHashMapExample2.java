/*
LinkedHashMap, entries are stored in the same order that you put them it 
You can retrieve entries  in the same order that you put them it or
in the order that they have been accessed in: alter the contructor 

*/

package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample2{


    public static void main(String[] args){


        // in the order that they have been accessed in: alter the contructor or use different constructor
        // that takes three arguments:
        // 1. initial capacity of the map, ex 4 entradas
        // 2. Load Factor, how full the map can be before it is made bigger, ex 75f(default), 
        //      75%full it will increace in size. ex: 4*0.75 = 3 entries
        // 3. Boolean value to specifies the ordering mode, false or no specifies returns elements in the same order that you put them it 
        //      true it will returns elements in the USE ACCESS order - 

                // K, V
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4,0.75f, true);

        // to add values to the HashMap
        phoneBook.put("Kevin", 123456789);
        phoneBook.put("Daniel", 321654987);
        phoneBook.put("Joe", 987654321);

        // Print out in the same order that I added it
        System.out.println();
        System.out.println(phoneBook);      // Kevin=123456789, Daniel=321654987, Joe=987654321}

        // NOT allow duplicate keys
        phoneBook.put("Daniel", 789456123);
        System.out.println();
        System.out.println(phoneBook);      // {Kevin=123456789, Joe=987654321, Daniel=789456123}
                                            // the longest time ago......................the most recent


        // Allow you to have NULL as the value for a key
        phoneBook.put(null, 456123789);
        System.out.println();
        System.out.println(phoneBook);      //  {Kevin=123456789, Joe=987654321, Daniel=789456123, null=456123789}}
        System.out.println("Joe's phone number: " + phoneBook.get("Joe"));      //  Joe's phone number: 987654321

        // prints out the ley and the value for each one

        System.out.println("\nLista of contacts in phoneBook: ");
        // forEach
        for (Map.Entry<String, Integer> entry: phoneBook.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
        // Lista of contacts in phoneBook: 
        // Kevin: 123456789     --> at the top -- the longest time ago
        // Daniel: 789456123
        // null: 456123789
        // Joe: 987654321       --> at the botton most recent

        // check the HashMap if contains an entry with a certain key or value

        if(phoneBook.containsKey("Kevin")){

            System.out.println();
            phoneBook.remove("Kevin");
            System.out.println(phoneBook);      //     {Daniel=789456123, null=456123789, Joe=987654321}
        }
        if(phoneBook.containsKey(null)){

            System.out.println();
            System.out.println(phoneBook.containsKey(null));      // true

        }
        // remove all entries 
        phoneBook.clear();
        System.out.println();
        System.out.println(phoneBook);      //     {}

    }
    
}
