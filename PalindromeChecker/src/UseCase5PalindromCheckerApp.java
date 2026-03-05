/**
 * =======================================================
 * MAIN CLASS - UseCase5PalindromeApp
 * =======================================================
 * 
 * Use Case 5: Stack based Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * 
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * 
 * This maps stack behavior to reversal logic.
 * 
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class UseCase5PalindromCheckerApp {
	public static void main(String[] args) {
		String input = "noon";
		Stack <Character> stack = new Stack <>();
		for(char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversed = new StringBuilder(input.length());
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		boolean isPalindrome = true;
		int i =0;
		for (char c : input.toCharArray()) {
			if(c!= reversed.charAt(i++)) {
				isPalindrome=false;
			}
		}
		
		System.out.println("Input: " + input);
        //System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome );
	}
}
