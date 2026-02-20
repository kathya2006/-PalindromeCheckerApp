import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

    public class UseCase1PalindromeCheckerApp {
        public static void main(String[] args) {

            // Original String
            String original = "level";

            // Create Stack (LIFO)
            Stack<Character> stack = new Stack<>();

            // Create Queue (FIFO)
            Queue<Character> queue = new LinkedList<>();

            // Insert characters into both Stack and Queue
            for (int i = 0; i < original.length(); i++) {
                char ch = original.charAt(i);
                stack.push(ch);      // LIFO
                queue.add(ch);       // FIFO (Enqueue)
            }

            boolean isPalindrome = true;

            // Compare dequeue (queue) with pop (stack)
            while (!stack.isEmpty()) {

                char fromStack = stack.pop();     // LIFO
                char fromQueue = queue.remove();  // FIFO (Dequeue)

                if (fromStack != fromQueue) {
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