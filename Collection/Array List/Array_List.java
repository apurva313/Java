/*
 * 
 * ArrayList deals with the limitation of array
 * ArrayList have inbuit function/methods for various operations
 * its size automatically shifteed as per requirement
 * 
 */

 import java.util.ArrayList;

  class Array_list {
     public static void main(String[] args) {
 
         // Initilizing arrrayList (syntax)
         ArrayList<Integer> l1 = new ArrayList<>();
 
         // adding element in Array_list
         l1.add(5);
         l1.add(3);
         l1.add(6);
         l1.add(7);
         l1.add(8);
 
         System.out.println(l1);
 
         // Get any element at index i
         System.out.println(l1.get(2)); // 6
 
         // printing ArrayList using for loop
 
         // to get size of ArrayList we use -> .size()
 
         for (int i = 0; i < l1.size(); i++) {
 
             System.out.print(l1.get(i)); // ->> 5 3 6 7 8
 
         }
 
         // printing ArrayList directly
         System.out.println(l1); // -> [5,3,6,7,8]
 
         // adding some element at any index i
         l1.add(3, 10);
 
         // modifying any element at any index i
         l1.set(1, 9);
 
         // removing any element at any index i
         l1.remove(4); // remove 4 th index value
 
         // removing any element e - .> this return boolean value
         l1.remove(Integer.valueOf(9));
 
         // checking if an element exixts
 
         boolean ans = l1.contains(Integer.valueOf(3));
 
         // if we did'nt specifiy class then we can store any type of value in arrayList
 
         ArrayList list = new ArrayList();
         list.add("hello");
         list.add(5);
         list.add(true);
         System.out.println(list); // -> [hello,5,true]
 
     }
 
 }