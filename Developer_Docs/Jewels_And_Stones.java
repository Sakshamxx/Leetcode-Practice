package Developer_Docs;

import java.util.HashSet;
import java.util.Set;

public class Jewels_And_Stones {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        Set<Character> set = new HashSet<>();

        // Store jewels in HashSet
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        // Count matching stones
        for (char ch : stones.toCharArray()) {

            if (set.contains(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels: " + result);
    }
}