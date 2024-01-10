package HackerRank;

import java.io.*;
import java.util.*;

public class RepeatedString{

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int len = s.length();
        long count = 0;
        for(int i = 0; i<len; i++)
        {
            if (s.charAt(i)=='a')
            {
                count++;
            }
        }
        long x = n/len;
        count = count*x;

        long y = n%len;
        for (int i =0; i<y; i++)
        {
            if (s.charAt(i)=='a')
            {
                count++;
            }
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();

        scanner.close();
    }
}