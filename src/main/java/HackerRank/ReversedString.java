package HackerRank;

import java.util.Scanner;

public class ReversedString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversedStr = "";
        boolean palindrome = true;
        for (int i = A.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + A.charAt(i);
        }
        if (reversedStr.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}