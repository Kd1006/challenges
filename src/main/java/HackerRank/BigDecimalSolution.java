package HackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Comparator<String> customComp = new Comparator<String>() {
            public int compare(String a, String b) {
                BigDecimal a1 = new BigDecimal(a);
                BigDecimal b1 = new BigDecimal(b);
                return b1.compareTo(a1);
            }
        };
        Arrays.sort(s, 0, n, customComp);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}