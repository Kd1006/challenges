package HackerRank;

import java.util.Scanner;
//We define the following terms:
//       Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
//        For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
//
//        A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
//        Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length .
//
//        Return the respective lexicographically smallest and largest substrings as a single newline-separated string.



public class KSubString {
        public static String getSmallestAndLarges (String s,int k ){
            String smallestStr = "";
            String largestStr = "";
            smallestStr = largestStr = s.substring(0,k);

            for (int i=0; i<s.length()- k+1; i++ ) {
                String subStr = s.substring(i, i + k);
                if (smallestStr.compareTo(subStr) > 0)
                    smallestStr = subStr;
                if (largestStr.compareTo(subStr) < 0)
                    largestStr = subStr;
            }

            return smallestStr + "\n" + largestStr;

        }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int k = sc.nextInt();
        System.out.println(getSmallestAndLarges(s,k));
    }
    }
