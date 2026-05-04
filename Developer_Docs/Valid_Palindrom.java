package Developer_Docs;

public class Valid_Palindrom {

    // Helper function
    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        String result = sb.toString().toLowerCase();
        return checkPalindrome(result);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}