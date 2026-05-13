package Developer_Docs;
import java.util.ArrayList;
import java.util.List;

class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Palindrome_Linked_list{

    public static boolean isPalindrome(ListNode head) {

        if (head == null) { 
            return true;
        }

        List<Integer> list = new ArrayList<>();

        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            if (!list.get(left).equals(list.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        printList(head);

        boolean ans = isPalindrome(head);

        System.out.println("Is Palindrome: " + ans);
    }
}