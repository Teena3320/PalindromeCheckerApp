/**
 * =======================================================
 * MAIN CLASS - UseCase2PalindromeApp
 * =======================================================
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with 
 * the original value.
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This introduces transformation-based validation.
 * 
 * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "level";
		int n=input.length();
		StringBuilder result = new StringBuilder(n);
		for (int i = n -1; i>=0; i--) {
			result.append(input.charAt(i));
		}
		System.out.println("Original : "+input);
		System.out.println("Reversed : "+ result.toString());
		System.out.println("Is Palindrome? : "+ input.equals(result.toString()));
	}
}
