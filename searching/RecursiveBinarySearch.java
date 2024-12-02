package searching;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[80000000];
        int target = 4371254;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int index = searchTarget(numbers, target, 0, numbers.length - 1);

        if (index == -1) {
            System.out.print(target + " not found");
        } else {
            System.out.print("The number " + target + " was found at index: " + index);
        }
    }

    private static int searchTarget(int[] numbers, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        int value = numbers[mid];

        if (target == value) {
            return mid;
        }

        if (target < value) {
            return searchTarget(numbers, target, start, mid - 1);
        }

        return searchTarget(numbers, target, mid + 1, end);
    }
}
