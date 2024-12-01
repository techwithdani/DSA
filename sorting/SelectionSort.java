package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = { 55, 66, 77, 33, 22, 11, 1, 2, 3, 4, 777, 8888, 6, 5, 0 };

        for (int i = 0; i < numbers.length - 1; i++) {
            int key = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[key] > numbers[j]) {
                    key = j;
                }
            }
            int temp = numbers[key];
            numbers[key] = numbers[i];
            numbers[i] = temp;
        }

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
