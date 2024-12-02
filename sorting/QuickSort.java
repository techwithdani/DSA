package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {88, 77, 66, 55, 44, 33, 22, 11, -20, -1, -4, -5, 87, 1, 2, 0, 99};

        quickSort(numbers, 0, numbers.length - 1);
        printArray(numbers);
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);

            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    public static int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        i++;

        swap(data, i, end);
        return i;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
