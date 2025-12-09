public class MaxOfTwoIntegers {

    public static int maximum(int a, int b) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given two integers, return the one that
        // is greater. If both numbers are equal,
        // return either one.
        // ----------------------------------------

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //below is an alternative one-liner using the ternary operator
    public static int maximumUsingTernaryOperators(int a, int b) {
        return (a > b) ? a : b;
    }

    //below is another alternative using Math.max method
    public static int maximumUsingMathMax(int a, int b) {
        return Math.max(a, b);
    }

    //below is another alternative without using else
    public static int maximumWithoutElse(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 20 is " + maximum(10, 20));

        System.out.println("Max of -5 and -2 is " + maximumUsingTernaryOperators(-5, -2));
        // the math.max method is best practice for real world code
        System.out.println("Max of 7 and 99 is " + maximumUsingMathMax(7, 99));

        System.out.println("Max of 200 and 99 is " + maximumWithoutElse(200, 99));
    }
}
