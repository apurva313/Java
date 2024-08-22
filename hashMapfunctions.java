import java.util.HashMap;
import java.util.Map;

public class hashMapfunctions {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        // to add key value pair in hashmap
        mp.put("Rahul", 30025);
        mp.put("Aman", 3007);
        mp.put("Amitosh", 3008);
        mp.put("Anand", 3010);

        // to retrieve value from hashmap
        System.out.println(mp.get("Rahul"));// -> 30025
        // to update value in existing value in hashmap
        mp.put("Rahul", 3125);
        System.out.println(mp.get("Rahul")); // updated value -> 3125

        // TO REMOVE A VALUE FROM HASHMAP
        System.out.println(mp.remove("Amitosh"));// return the value after deletion

        // TO CHECK WETHER THE KEY IS PRESENT IN HASHMAP OR NOT
        System.out.println(mp.containsKey("Amitosh")); // return Boolean value

        // TO ADD TO HASHMAP IF NOT PRESENT IN HASHMAP
        mp.putIfAbsent("Anand Pathak", 30010);

        // GET ALL KEY OF HASHMAP
        System.out.println(mp.keySet());

        // GET ALL ENTRY (VALUE) OF HASH MAP
        System.out.println(mp.entrySet());
        // TRAVERSING THE HASHMAP
        /* 1 FOR EACH */
        System.out.println("1st approach using for each in for loop");
        for (String key : mp.keySet()) {
            System.out.printf("Roll number of  %s is %d \n", key, mp.get(key));
        }

        System.out.println("2nd approach using Map.Enttry datatype");
        /* 2 using Map.Entry<key,value> datatype */
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Roll number of  %s is %d \n", e.getKey(), e.getValue());
        }
        System.out.println("3rd approach using var keyboard");
        /* 3 USING VAR keyword */
        for (var e : mp.entrySet()) {
            System.out.printf("Roll number of  %s is %d \n", e.getKey(), e.getValue());

        }
    }
}
