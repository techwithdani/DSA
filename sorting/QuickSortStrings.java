package sorting;

public class QuickSortStrings {
    public static void main(String[] args) {
        String[] names = {"Messi", "Tyson", "Ronaldo", "Ali", "Dani", "Altair", "Ezio"};

        quickSort(names, 0, names.length - 1);
        printArray(names);
    }

    public static void quickSort(String[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);

            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    public static int partition(String[] data, int start, int end) {
        String pivot = data[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (data[j].compareTo(pivot) < 0) {
                i++;
                swap(data, i, j);
            }
        }
        i++;

        swap(data, i, end);
        return i;
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
