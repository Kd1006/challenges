package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Given an integer array numbers, return true if there is any duplicate values, if not return false;
public class DuplicateValue {
    public static void main(String[] args) {
        int[] numbers = {12, 1, 4, 6, 5, 2, 1, 44, 99};
        boolean success = findDuplicates(numbers);
        System.out.println(success);
    }

    public static boolean findDuplicates(int[] numbers) {
        // sort first

        //[3,4,5,11,3]
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] == numbers[j]) {
                    return true;
                }
        }
        return false;
    }
// []
    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        return set.size() == numbers.length;
    }


public static boolean containsDuplicateSorted(int [] numbers) {
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == numbers[i + 1]) {
            return true;
        }
    }
    return false;
}
}
