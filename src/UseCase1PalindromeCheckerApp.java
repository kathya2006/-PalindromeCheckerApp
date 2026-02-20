public class UseCase1PalindromeCheckerApp {
        public static void main(String[] args) {

            // Hardcoded string (String Literal)
            String word = "madam";

            System.out.println("Palindrome Checker App - UC2");
            System.out.println("Checking word: " + word);

            // Reverse the string
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            // Conditional check using if-else
            if (word.equals(reversed)) {
                System.out.println("Result: The word is a Palindrome.");
            } else {
                System.out.println("Result: The word is NOT a Palindrome.");
            }

            System.out.println("Program Ended.");
        }
    }

