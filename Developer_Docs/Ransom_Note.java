package Developer_Docs;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        // Store frequency of characters from magazine
        for (int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int count = 0;

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if (map.containsKey(ch) && map.get(ch) > 0) {

                count++;

                map.put(ch, map.get(ch) - 1);

            } else {
                break;
            }
        }

        if (count == ransomNote.length()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Ransom Note:" + result);
    }
}