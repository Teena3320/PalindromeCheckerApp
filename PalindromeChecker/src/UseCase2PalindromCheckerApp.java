/**
 * =======================================================
 * MAIN CLASS - UseCase2PalindromeApp
 * =======================================================
 * 
 * Use Case 2: Hardcoded Palindrome Validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * 
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * 
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * 
 * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromCheckerApp {
	public static void main (String[] args) {
		String input ="madam";
		boolean isPalindrome=true;
		for(int i=0; i<input.length()/2; i++) {
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				isPalindrome=false;
			}
		}
		System.out.println("Input text: "+input);
		System.out.println("Is it a Palindrome? : "+isPalindrome);
	}
}
