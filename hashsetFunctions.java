import java.util.*;

public class hashsetFunctions {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // TO ADD VALUE IN HASH SER
        set.add("Anand");
        set.add("Aman");
        set.add("Amitosh");
        set.add("Azad");
        System.out.println("Original hash value");
        for (String key : set) {
            System.out.println(key + "      ");
        }

        System.out.println("Operations on hashsets");
        // TO CHECK THE VALUE PRESENT IN HASHSET OR NOT
        System.out.println(set.contains("Anand"));

        // TO GET THE SIZE OF THE HASH SET
        System.out.println(set.size());
        // TO REMOVE THE VALUE FROM HASHSET
        System.out.println(set.remove("Amitosh"));
        // ITERATION OF HASH SET

        for (String key : set) {
            System.out.println(key + "      ");
        }

    }
}
