package sorting;

public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] names = { "Messi", "Tyson", "Ronaldo", "Ali", "Dani" };
        boolean isSwapped;

        for (int i = 0; i < names.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (isSwapped == false) {
                break;
            }
        }

        printArray(names);
    }

    public static void printArray(String[] array) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}
