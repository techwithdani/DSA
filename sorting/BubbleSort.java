package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 55, 66, 77, 33, 22, 1, 2, 3, 4, 777, 8888, 6, 5, 0 };
        boolean isSwapped;

        for (int i = 0; i < numbers.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (isSwapped == false) {
                break;
            }
        }

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
