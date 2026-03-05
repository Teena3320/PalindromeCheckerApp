/**
 * =======================================================
 * MAIN CLASS - UseCase11PalindromeApp
 * =======================================================
 * 
 * Use Case 11: Object-Oriented Palindrome Service
 * 
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * 
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * 
 * This improves:
 * - Reusability
 * - Readability
 * - Seperation of concerns
 * 
 * @author Developer
 * @version 11.0
 */
public class UseCase11PalindromeCheckerApp {
	public static void main(String[] args) {

		PalindromeService service = new PalindromeService();
		String input =  "racecar";

		boolean result = service.checkPalindrome(input);
		System.out.println("Input: " + input + "\nIs Palindrome? : " + result);
	}
}

class PalindromeService{
	public boolean checkPalindrome(String input) {

		if (input == null) return false;

		String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

		int start = 0;
		int end = normalized.length() - 1;

		while (start < end) {
			if (normalized.charAt(start) != normalized.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}