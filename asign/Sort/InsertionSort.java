public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 7, 4};
        insertionSort(numbers);
        System.out.println("Sorted array using Insertion Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
