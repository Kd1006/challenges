package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings) {
                System.out.println(str);
            }

        }
    }
}