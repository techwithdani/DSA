package sorting;

public class CyclicSort {
    public static void main(String[] args) {
        int[] numbers = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        sort(numbers);
        printArray(numbers);
    }

    public static void sort(int[] data) {
        int i = 0;
        int length = data.length;

        while (i < length) {
            int correctIndex = data[i] - 1;
            if (data[i] != data[correctIndex]) {
                swap(data, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
