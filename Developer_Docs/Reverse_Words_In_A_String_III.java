package Developer_Docs;

public class Reverse_Words_In_A_String_III {

    public static String reverseWords(String s) {

        String words[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= words.length - 2; i++) {

            String temp = reverseEachWord(words[i]);

            sb.append(temp + " ");
        }

        String temp = reverseEachWord(words[words.length - 1]);

        sb.append(temp);

        return sb.toString();
    }

    // Function to reverse each word
    private static String reverseEachWord(String s) {

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            result += s.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "I am Saksham";

        String result = reverseWords(s);

        System.out.println("Reversed Words:");
        System.out.println(result);
    }
}
