package Developer_Docs;

public class Detect_Capital {

    public static boolean detectCapitalUse(String word) {

        if (allCaps(word) || allLower(word) || titleCase(word)) {
            return true;
        }

        return false;
    }

    // Check if all letters are uppercase
    private static boolean allCaps(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return word.length() == count;
    }

    // Check if all letters are lowercase
    private static boolean allLower(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                count++;
            }
        }

        return word.length() == count;
    }

    // Check Title Case
    private static boolean titleCase(String word) {

        char ch = word.charAt(0);

        String subStr = word.substring(1);

        if (Character.isUpperCase(ch) && allLower(subStr)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String word = "Google";

        boolean result = detectCapitalUse(word);

        System.out.println("Valid Capital Usage: " + result);
    }
}