package HackerRank;
//
// Find smallest three elements from the array not using the sort
public class FindSmallestThree {
    public static void findSmallestThree(int arr[]) {
        if (arr.length < 3) {
            System.out.println("Invalid input, Array size is less than 3 ");
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < first) {
                third = second;
                second = first;
                first = current;
            } else if (current< second) {
                third = second;
                second = current;
            } else if (current < third) {
                third = current;

            }

        }
        System.out.println("Three Largest elements are " + first+  " " + second + " " + third);
    }

    public static void main(String[] args) {
        int arr[] = {19, 5, 78, 1, 33, 11, 20, 44, 99,-1};
        findSmallestThree(arr);
    }

}
