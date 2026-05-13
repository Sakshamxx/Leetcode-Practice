package Developer_Docs;

public class Valid_Anagram {

    public static boolean isAnagram(String s, String t) {

        // Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array
        int[] count = new int[26];

        // Count characters of first string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        // Subtract characters of second string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            count[ch - 'a']--;
        }

        // Check if all values are 0
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }
}