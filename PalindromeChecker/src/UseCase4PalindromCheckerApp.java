/**
 * =======================================================
 * MAIN CLASS - UseCase4PalindromeApp
 * =======================================================
 * 
 *  Description:
 *  This class validates a palindrome by converting 
 *  the string into a character array and comparing
 *  characters using the two-pointer technique.
 *  
 *  At this stage, the application:
 *  - Converts string to char array
 *  - Uses start and end pointers
 *  - Compares characters efficiently
 *  - Displays the result
 *  
 *  This reduces extra memory usage.
 *  
 *  @author Developer
 *  @version 4.0
 */
public class UseCase4PalindromCheckerApp {
	public static void main(String[] args) {
		String input = "radar";
		char[] chars = input.toCharArray();
		int start =0;
		int end = chars.length - 1;
		boolean isPalindrome = true;
		while(start<end) {
			if(chars[start++]!=chars[end--]) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Input : "+ input);
		System.out.println("Is Palindrome? : "+ isPalindrome);
	}
}
