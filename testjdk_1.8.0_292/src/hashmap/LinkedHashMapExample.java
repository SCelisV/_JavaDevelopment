/*
LinkedHashMap, entries are stored in the same order that you put them it 
You can retrieve entries  in the same order that you put them it or
in the order that they have been accessed in: alter the contructor 

*/

package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {


    public static void main(String[] args){


                // K, V
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();

        // to add values to the HashMap
        phoneBook.put("Kevin", 123456789);
        phoneBook.put("Joe", 987654321);
        phoneBook.put("Daniel", 321654987);

        // Print out in the same order that I added it
        System.out.println();
        System.out.println(phoneBook);      // {Kevin=123456789, Joe=987654321, Daniel=321654987}

        // NOT allow duplicate keys
        phoneBook.put("Daniel", 789456123);
        System.out.println();
        System.out.println(phoneBook);      // {Kevin=123456789, Joe=987654321, Daniel=789456123}


        // Allow you to have NULL as the value for a key
        phoneBook.put(null, 456123789);
        System.out.println();
        System.out.println(phoneBook);      //  {Kevin=123456789, Joe=987654321, Daniel=789456123, null=456123789}
        System.out.println("Kevin's phone number: " + phoneBook.get("Kevin"));      //  Kevin's phone number: 123456789

        // prints out the ley and the value for each one

        System.out.println("\nLista of contacts in phoneBook: ");
        // forEach
        for (Map.Entry<String, Integer> entry: phoneBook.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
        // Lista of contacts in phoneBook: 
        // Kevin: 123456789
        // Joe: 987654321
        // Daniel: 789456123
        // null: 456123789

        // check the HashMap if contains an entry with a certain key or value

        if(phoneBook.containsKey("Kevin")){

            System.out.println();
            phoneBook.remove("Kevin");
            System.out.println(phoneBook);      //  {Joe=987654321, Daniel=789456123, null=456123789}
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
