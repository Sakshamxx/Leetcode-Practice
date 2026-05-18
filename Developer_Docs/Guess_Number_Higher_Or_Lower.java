package Developer_Docs;

public class Guess_Number_Higher_Or_Lower {

    // Suppose the picked number is 6
    static int pickedNumber = 6;

    // Simulated guess API
    public static int guess(int num) {

        if (num > pickedNumber) {
            return -1;
        }

        else if (num < pickedNumber) {
            return 1;
        }

        else {
            return 0;
        }
    }

    // Binary Search Function
    public static int guessNumber(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            }

            else if (result == 1) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 10;

        int answer = guessNumber(n);

        System.out.println("Picked Number is: " + answer);
    }
}