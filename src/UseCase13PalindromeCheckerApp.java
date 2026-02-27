import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // 1 - Two Pointer Method
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 2 - Stack Method
    public static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3 - Recursive Method
    public static boolean isPalindromeRecursive(String str) {
        return checkRecursive(str, 0, str.length() - 1);
    }

    private static boolean checkRecursive(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return checkRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeTwoPointer(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Performance
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeStack(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Recursive Performance
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("Input String: " + input);
        System.out.println();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time (ns): " + time1);
        System.out.println();

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Execution Time (ns): " + time2);
        System.out.println();

        System.out.println("Recursive Method Result: " + result3);
        System.out.println("Execution Time (ns): " + time3);
    }
}