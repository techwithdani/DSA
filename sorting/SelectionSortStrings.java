package sorting;

public class SelectionSortStrings {
    public static void main(String[] args) {
        String[] names = { "Messi", "Tyson", "Ronaldo", "Ali", "Dani" };

        for (int i = 0; i < names.length - 1; i++) {
            int key = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[key].compareTo(names[j]) > 0) {
                    key = j;
                }
            }
            String temp = names[key];
            names[key] = names[i];
            names[i] = temp;
        }

        printArray(names);
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
