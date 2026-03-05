/**
 * =======================================================
 * MAIN CLASS - UseCase10PalindromeApp
 * =======================================================
 * 
 * Use Case 10: NOrmalized Palindrome Validation
 * 
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * 
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * 
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * 
 * Example:
 * "A man a plan a canal Panama"
 * 
 * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {
	public static void main(String[] args) {

		String input = "A man a plan a canal Panama";
		String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		
		boolean isPalindrome = true;
		for (int i = 0; i < normalized.length() / 2; i++) {
			if (normalized.charAt(i) != normalized.charAt(normalized.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);
	}
}
