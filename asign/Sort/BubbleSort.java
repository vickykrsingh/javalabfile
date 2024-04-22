public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 7, 4};
        bubbleSort(numbers);
        System.out.println("Sorted array using Bubble Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
