package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {88, 77, 66, 55, 44, 33, 22, 11, -20, -1, -4, 5, 87, 555, 222, 1, 2, 0, 99};
        int search = 5;

        int result = searchNumber(numbers, search);

        if (result == -1) {
            System.out.print("Number not found");
        } else {
            System.out.print("The number " + search + " was found at index: " + result);
        }
    }

    public static int searchNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
