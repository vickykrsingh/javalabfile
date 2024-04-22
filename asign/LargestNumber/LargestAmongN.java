public class LargestAmongN {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 7, 4};
        int largest = findLargest(numbers);
        System.out.println("Largest number is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}
