package sorting;

public class CountSort {
    public static void main(String[] args) {
        int[] numbers = { 9, 8, 7, 6, 5, 4, 5, 4, 1 };

        int largestNum = numbers[0];

        for (int num : numbers) {
            if (num > largestNum) {
                largestNum = num;
            }
        }

        int[] countArray = new int[largestNum + 1];

        for (int num : numbers) {
            countArray[num]++;
        }

        int index = 0;

        for (int i = 0; i <= largestNum; i++) {
            while (countArray[i] > 0) {
                numbers[index] = i;
                index++;
                countArray[i]--;
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
