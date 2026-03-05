/**
 * =======================================================
 * MAIN CLASS - UseCase9PalindromeApp
 * =======================================================
 * 
 * Use Case 9: Recursive Palindrome Checker
 * 
 * Description: 
 * This class validates a palindrome using recursion.
 * 
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * 
 * The recursion stops when:
 * - All characters are matched, or 
 * - A mismatch is found.
 * 
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * 
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {
	private static boolean check(String s, int start, int end) {

		if (start >= end) return true;            
		if (s.charAt(start) != s.charAt(end)) return false;
		return check(s, start + 1, end - 1);
	}
	public static void main(String[] args) {

		String input = "madam";
		String normalized = input;

		boolean isPalindrome = check(normalized, 0, normalized.length() - 1);

		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);

	}
}
