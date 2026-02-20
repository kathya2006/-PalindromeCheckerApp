import java.util.Stack;
    public class UseCase1PalindromeCheckerApp {
        public static void main(String[] args) {

            // Original String
            String original = "madam";

            // Create Stack
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < original.length(); i++) {
                stack.push(original.charAt(i));
            }

            boolean isPalindrome = true;

            // Pop characters and compare
            for (int i = 0; i < original.length(); i++) {

                char poppedChar = stack.pop();

                if (original.charAt(i) != poppedChar) {
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