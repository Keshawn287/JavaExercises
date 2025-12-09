public class SumsArray {

    public static int sumArray(int[] numbers) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // total sum of all the numbers in the array.
        //
        // If the array is empty, return 0.
        // ----------------------------------------

        // Return 0 if the array is null or empty
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int total = 0;

        // Loop through the array and add each number to total
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    public static int sumArrayUsingEnhancedForLoop(int[] numbers) {
        // Alternative implementation using enhanced for loop
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    public static int sumArrayUsingStreams(int[] numbers) {
        // Alternative implementation using Java Streams
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        return java.util.Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        // Do not change the code in the main method

        System.out.println(sumArray(new int[] { 1, 2, 3 })); // 6
        System.out.println(sumArray(new int[] { 10, -5, 5 })); // 10
        System.out.println(sumArray(new int[] {})); // 0
        System.out.println(sumArrayUsingEnhancedForLoop(new int[] { 100 })); // 100
        System.out.println(sumArrayUsingStreams(new int[] { 0, 0, 0 })); // 0
    }
}
