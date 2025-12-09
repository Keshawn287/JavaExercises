import java.util.Scanner;

public class EvenOrOdd {

    public static String evenOrOdd(int number) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an integer, return "even" if the
        // number is even, or "odd" if the number
        // is odd.
        //
        // Use % 2 to determine even/odd.
        // ----------------------------------------

        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        // Do not change the code in the main method

        System.out.println("4 is " + evenOrOdd(4)); // even
        System.out.println("7 is " + evenOrOdd(7)); // odd
        System.out.println("0 is " + evenOrOdd(0)); // even
        System.out.println("-6 is " + evenOrOdd(-6)); // even
        System.out.println("-3 is " + evenOrOdd(-3)); // odd

        //another way to check is to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + evenOrOdd(num));

        // // Alternative one-liner using ternary operator
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        // String evenOdd = (num % 2 == 0) ? "even" : "odd";
        // System.out.println(num + " is " + evenOdd);
    }
}
