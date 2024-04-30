import java.util.ArrayList;
import java.util.Collections;

public class reverse_ArrayList {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int temp = list.get(Integer.valueOf(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> li = new ArrayList<>();

        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("Original List:   " + list);
        reverseList(list);
        System.out.println("Reverse List:    " + list);

        // we can reverse list directly using inbuilt function in collections module
        System.out.println("Original List-->     " + list);
        Collections.reverse(list);
        System.out.println("Reverse List using inbuild function-->  " + list);

        li.add("Hello");
        li.add("Apurva");
        li.add("CSE");
        li.add("kalyani");

        System.out.println("Original String List:   " + li);
        Collections.reverse(li);
        System.out.println("Reverse String List:   " + li);

        // Sorting ArrayList using sort method;
        System.out.println("List before sorting   " + li);
        Collections.sort(li);
        System.out.println("After Sorted:   " + li);

    }
}