package maps;

import java.util.*;
 
class entryset {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        HashMap<String, Integer> hm= new HashMap<String, Integer>();
 
        hm.put("Pranay", 54);
        hm.put("A computer portal", 80);
        hm.put("XOXOX", 82);
 
        System.out.println("Created hashmap is" + hm);
 
        Iterator hmIterator = hm.entrySet().iterator();
 
        System.out.println("HashMap after adding bonus marks:");
 
        // Iterating through Hashmap and
        // adding some bonus marks for every student
        while (hmIterator.hasNext()) {
 
            Map.Entry mapElement= (Map.Entry)hmIterator.next();
            int marks = ((int)mapElement.getValue() + 10);
 
            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey() + " : "+ marks);
        }
    }
}