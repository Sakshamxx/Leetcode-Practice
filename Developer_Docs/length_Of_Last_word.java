package Developer_Docs;

public class length_Of_Last_word {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of Last Word: " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String word[] = s.split(" ");
        String lastWord = word[word.length - 1];
        return lastWord.length();
    }
}
