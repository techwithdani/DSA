package sorting;

public class MergeSortString {
    public static void main(String[] args) {
        String[] names = {"Messi", "Tyson", "Ronaldo", "Ali", "Dani", "Chris", "Altair"};

        mergeSort(names, 0, names.length - 1);
        printArray(names);
    }

    public static void mergeSort(String[] data, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(String[] data, int start, int mid, int end) {
        String[] temp = new String[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (data[i].compareTo(data[j]) < 0) {
                temp[k] = data[i];
                i++;
            } else {
                temp[k] = data[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = data[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = data[j];
            j++;
            k++;
        }

        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
