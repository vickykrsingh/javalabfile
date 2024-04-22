public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 7, 4};
        selectionSort(numbers);
        System.out.println("Sorted array using Selection Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
