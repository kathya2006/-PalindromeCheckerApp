import java.util.Deque;
import java.util.ArrayDeque;
    public class UseCase1PalindromeCheckerApp {
        public static void main(String[] args) {

            // Original String
            String original = "racecar";

            // Create Deque
            Deque<Character> deque = new ArrayDeque<>();

            // Insert characters into Deque
            for (int i = 0; i < original.length(); i++) {
                deque.addLast(original.charAt(i));
            }

            boolean isPalindrome = true;

            // Compare front and rear elements
            while (deque.size() > 1) {

                char front = deque.removeFirst();   // Remove from front
                char rear = deque.removeLast();     // Remove from rear

                if (front != rear) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            if (isPalindrome) {
                System.out.println("The string \"" + original + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
            }
        }
    }