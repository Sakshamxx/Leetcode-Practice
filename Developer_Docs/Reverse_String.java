package Developer_Docs;

import java.util.Arrays;

public class Reverse_String {

    public static void reverseString(char[] s) {

        int st = 0;
        int end = s.length - 1;

        while (st < end) {

            char ch = s[st];
            s[st] = s[end];
            s[end] = ch;

            st++;
            end--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before Reverse:");
        System.out.println(Arrays.toString(s));

        reverseString(s);

        System.out.println("After Reverse:");
        System.out.println(Arrays.toString(s));
    }
}