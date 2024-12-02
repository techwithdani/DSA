package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[10000000];
        int target = 5454455;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int result = searchNumber(numbers, target);

        if (result == -1) {
            System.out.print(target + " not found");
        } else {
            System.out.print("The number " + target + " was found at index: " + result);
        }

    }

    public static int searchNumber(int[] data, int target) {
        int start = 0;
        int end = data.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = data[mid];

            System.out.println("Middle Number: " + value);

            if (value < target) {
                start = mid + 1;
            } else if (value > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
