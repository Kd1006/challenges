package HackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

    // Input [-1, 0,-1,2,3]
    //
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(findSum(a, target)));

        int[] arr = {-2, -1, 0, 1, 2, 3};
        System.out.println(Arrays.toString(maxSquares(arr)));

        System.out.println(Arrays.toString(maxSquaresTwoPointers(arr)));
    }

    // {1,2,3,4}  target =6;
    public static int[] findSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{left, right};
            }
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};      //  {-1,-1}  if there is any target value in our array
    }

    // using hashmap
    public static int[] findSumM(int[] arr, int target) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(target - arr[i])) {
                return new int[]{nums.get(target - arr[i]), i};
            } else nums.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }


    public static int[] maxSquares(int[] arr) {
        // n*log(arr)
        int[] squares = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
        }
        Arrays.sort(squares);   //O(n* log n )
        return squares;
    }


    public static int[] maxSquaresTwoPointers(int[] arr) { /// O(n) - time complexity
        int[] squares = new int[arr.length];  // {0,0,0,0,0,0}
        int n = arr.length;  // 6
        int left = 0;
        int right = arr.length - 1;  // 5
        int highestIndex = n - 1;
        while (left <= right) {
            int leftSq = arr[left] * arr[left]; // 4
            int rightSq = arr[right] * arr[right];// 16
            if (leftSq > rightSq) {
                squares[highestIndex--] = leftSq;
                left++;
            } else {
                squares[highestIndex--] = rightSq;
                right--;
            }
        }
        return squares;
    }
}



