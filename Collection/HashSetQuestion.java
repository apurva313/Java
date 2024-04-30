import java.util.HashSet;
import java.util.Iterator;


public class HashSetQuestion {
   public static void main(String args[]) {

       HashSet<Integer> set = new HashSet<>();
      
       //Add
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);


       //Size
       System.out.println("size of set is : " + set.size());


       //Search
       if(set.contains(1)) {
           System.out.println("present");
       }


       if(!set.contains(6)) {
           System.out.println("absent");
       }


       //Delete
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }


       //Print all elements
       System.out.println(set);


       //Iteration - HashSet does not have an order
       set.add(0);

       Iterator it = set.iterator();
        while (it.hasNext()) { //hasNext() return true or false
           System.out.print(it.next() + ", "); //next() gives the next value of the iteration
       }
       System.out.println();


       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }
}
