package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//String s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,),
//        question marks (?), periods (.), underscores (_), apostrophes (‘), and at symbols (@).
//On the first line, print an integer, n, denoting the number of tokens in string s(they do not need to be unique).
//        Next, print each of the n tokens on a new line in the same order as they appear in input string s.



public class StringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ +]");
            System.out.println(strings.length);
            for (String str : strings) {
                System.out.println(str);
            }

        }
    }
}