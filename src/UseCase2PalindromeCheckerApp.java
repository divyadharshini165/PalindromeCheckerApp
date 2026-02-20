/**
 * ==============================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This program checks whether a hardcoded string
 * is a palindrome and displays the result.
 *
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String text = "madam";

        // Reverse logic
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check condition
        boolean isPalindrome = text.equals(reversed);

        // Required Output Format
        System.out.println("Input text : " + text);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}