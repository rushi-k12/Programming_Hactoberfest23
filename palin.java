import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        // Check if the characters at the left and right pointers are equal
        // Move the pointers towards the center until they meet
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }
