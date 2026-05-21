package Developer_Docs;

public class Find_The_Difference {

    public static char findTheDifference(String s, String t) {

        int s_sum = 0;
        int t_sum = 0;

        // Sum of characters in s
        for (int i = 0; i < s.length(); i++) {
            s_sum += s.charAt(i);
        }

        // Sum of characters in t
        for (int i = 0; i < t.length(); i++) {
            t_sum += t.charAt(i);
        }

        int result = t_sum - s_sum;

        return (char) result;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char ans = findTheDifference(s, t);

        System.out.println("Added Character: " + ans);
    }
}