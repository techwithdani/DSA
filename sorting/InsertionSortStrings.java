package sorting;

public class InsertionSortStrings {
    public static void main(String[] args) {
        String[] names = {"Messi", "Tyson", "Ronaldo", "Ali", "Dani", "Eshu"};

        for (int i = 1; i < names.length; i++) {
            String key = names[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(names[j]) < 0) {
                names[j + 1] = names[j];
                j--;
            }

            names[j + 1] = key;
        }

        printArray(names);
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
