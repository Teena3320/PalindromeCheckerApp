/**
 * =======================================================
 * MAIN CLASS - UseCase12PalindromeApp
 * =======================================================
 * 
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * 
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 * 
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 * 
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 * 
 * The goal is to teach extensible algorithm design.
 * 
 * @author Developer
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "level";

		PalindromeStrategy strategy = new StackStrategy();

		boolean result = strategy.check(input);
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? : " + result);
	}
}

interface PalindromeStrategy{
	boolean check(String input);
}

class StackStrategy implements PalindromeStrategy{

	@Override
	public boolean check(String input) {
		if (input == null) return false;

		String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

		java.util.Stack<Character> stack = new java.util.Stack<>();

		for (char c : normalized.toCharArray()) {
			stack.push(c);
		}

		for (char c : normalized.toCharArray()) {
			if (stack.pop() != c) {
				return false;
			}
		}

		return true;
	}
}