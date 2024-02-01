package HackerRank;
import java.util.Scanner;

//Given two strings of lowercase English letters,  and , perform the following operations:
//        Sum the lengths of A and B
//        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//        Capitalize the first letter in and print them on a single line, separated by a space.

public class substring {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();

            System.out.println(A.length() + B.length());
            int i = A.compareTo(B); //Comparing lexicographical order of string A and B and storing the result to var i;
            if(i>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            A = A.substring(0,1).toUpperCase() + A.substring(1);
            B = B.substring(0,1).toUpperCase() +B.substring(1);
            //  Capitalizes the first letter of string A. It extracts the first character using substring(0,1)
            //  converts it to uppercase using .toUpperCase(), and then concatenates it with the rest of the
            //  string starting from the second character.
            System.out.println(A+  " " + B);

        }

    }
