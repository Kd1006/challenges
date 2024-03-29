package HackerRank;
/* Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders.
So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not.
The strings may consist at most 50 english characters, the comparison should NOT be case-sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.
Sample Input 1
anagram
margana

Sample Output 1:
Anagrams
*/

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase(); // ensuring case insensitive comparison
        boolean f = false;
        char[] c = A.toCharArray();
        Arrays.sort(c); // converting string A to character array a and sorting it.
        char[]d = B.toCharArray();
        Arrays.sort(d);
        String a = new String(c);
        String b = new String(d); // converts the sorted array back to String 'a' and 'b' using String constructor;
        if (a.equals(b)) {
            f = true;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        boolean checked = isAnagram(A, B);
        if (checked) {
            System.out.println(A + " " + B + " are " + "Anagrams.");
        } else {
            System.out.println(A + " " + B + " are "+  "Not Anagrams.");
        }

    }
}
