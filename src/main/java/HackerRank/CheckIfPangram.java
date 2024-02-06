package HackerRank;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CheckIfPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));
    }
    public static boolean checkIfPangram(String sentence) {

        sentence = sentence.toLowerCase();  // convert it to lowercase
        char[] chars = sentence.toCharArray();   // convert string to array

        Set<Character> set = new HashSet<>();   // create new hashset and keep only letter characters
        for (char c : chars) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;   // check if the size is 26
    }
}
