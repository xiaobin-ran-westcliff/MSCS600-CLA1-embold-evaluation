package utils;

import static utils.ComputationMode.RECURSIVE;

public final class MathUtils {

    private MathUtils() { }



    public static int computeFactorial__BuggyForStackOverflow(int num, ComputationMode mode) {
        if (num >= 17) {
            throw new RuntimeException("num is too big");
        }
        if (num <= 1) {
            return num;
        }
        if (mode == RECURSIVE) {
            return num * computeFactorial__BuggyForStackOverflow(num, RECURSIVE); // definite stack overflow
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static int computeFactorial(int num, ComputationMode mode) {
        if (num >= 17) {
            throw new RuntimeException("num is too big");
        }
        if (num <= 1) {
            return num;
        }
        if (mode == RECURSIVE) {
            return num * computeFactorial(num - 1, RECURSIVE);
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}