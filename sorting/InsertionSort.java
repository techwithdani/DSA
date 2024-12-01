package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 88, 77, 66, 55, 44, 33, 22, 11, 87, 555, 222, 1, 2, 0, 99 };

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
