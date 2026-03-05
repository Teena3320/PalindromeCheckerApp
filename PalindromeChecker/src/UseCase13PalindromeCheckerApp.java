/**
 * =======================================================
 * MAIN CLASS - UseCase13PalindromeApp
 * =======================================================
 * 
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

	 public static void main(String[] args) {
	        String input = "level";

	        long start = System.nanoTime();
	        boolean isPalindrome = isPalindromeNormalized(input);
	        long end = System.nanoTime();

	        System.out.println("Input : " + input);
	        System.out.println("Is Palindrome? : " + isPalindrome);
	        System.out.println("Execution Time : " + (end - start) + " ns");
	    }

	    private static boolean isPalindromeNormalized(String s) {
	        if (s == null) return false;
	        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	        int i = 0, j = t.length() - 1;
	        while (i < j) {
	            if (t.charAt(i) != t.charAt(j)) return false;
	            i++; j--;
	        }
	        return true;
	    }
	}
