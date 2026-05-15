package Developer_Docs;

import java.util.Arrays;

public class Counting_Bits {

    // Function to count bits
    public static int[] countBits(int n) {

        int[] ans = new int[n + 1];

        ans[0] = 0;

        for (int i = 1; i <= n; i++) {

            String binary = Integer.toBinaryString(i);

            int oneCount = countOnes(binary);

            ans[i] = oneCount;
        }

        return ans;
    }

    // Function to count number of 1's
    public static int countOnes(String num) {

        int count = 0;

        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 5;

        int[] result = countBits(n);

        System.out.println("Output: " + Arrays.toString(result));
    }
}