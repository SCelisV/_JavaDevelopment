/*
HashMap are unordered, entries are stored by their contents, not by their position
NOT allow duplucate keys
Allow you to have NULL as the value for a key
check the HashMap if contains an entry with a certain key or value
Allow to store pairs of values together (K,V), like phone book.
name of the contact was the key and phone of the contact was the value.

*/

package hashmap;

import java.util.HashMap;

public class HashMapExample {


    public static void main(String[] args){

                // K, V
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // to add values to the HashMap
        phoneBook.put("Kevin", 123456789);
        phoneBook.put("Daniel", 321654987);
        phoneBook.put("Joe", 987654321);

        // Is not printer out in the same order that I added it - unordered
        System.out.println();
        System.out.println(phoneBook);      // {Kevin=123456789, Joe=987654321, Daniel=321654987}

        // NOT allow duplicate keys
        phoneBook.put("Kevin", 789456123);
        System.out.println();
        System.out.println(phoneBook);      //  {Kevin=789456123, Joe=987654321, Daniel=321654987}


        // Allow you to have NULL as the value for a key
        phoneBook.put(null, 456123789);
        System.out.println();
        System.out.println(phoneBook);      //  {null=456123789, Kevin=789456123, Joe=987654321, Daniel=321654987}


        // check the HashMap if contains an entry with a certain key or value

        if(phoneBook.containsKey("Kevin")){

            System.out.println();
            phoneBook.remove("Kevin");
            System.out.println(phoneBook);      //      {null=456123789, Joe=987654321, Daniel=321654987}

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
