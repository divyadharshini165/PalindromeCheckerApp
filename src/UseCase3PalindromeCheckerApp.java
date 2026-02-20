/**
 * ==============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program reverses a string using a for loop
 * and checks whether it is a palindrome.
 *
 * @version 1.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input string
        String text = "madam";

        // Reverse string using loop
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = text.equals(reversed);

        // Required Output Format
        System.out.println("Input text : " + text);
        System.out.println("Reversed text : " + reversed);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}