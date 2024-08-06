
// Find out the number of palindrome substring in the given string.
// abbd -> 5 palindrome substring a b bb b d  
/*
 * concept first we check the sbubstring is palindrome using two pointer methods 
 * we make a flag for palindrome if true count ++ 
 * 
 *  topic - two pointer ,string method,substring method;
 */

import java.util.*;

public class No_of_Palindrome {
    public static boolean palindrome(String str) {

        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }

        return flag;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (palindrome(str.substring(i, j))) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;

                }
            }

        }
        System.out.println("The number of palindrome substring:" + count);

        sc.close();
    }
}