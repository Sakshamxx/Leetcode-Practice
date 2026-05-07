package Developer_Docs;

public class Reversed_Linked_List {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;

            current = next;

        }

        return prev;

    }

    // Function to print linked list

    public static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " -> ");

            head = head.next;

        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);

        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);

        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");

        printList(head);

        head = reverseList(head);

        System.out.println("Reversed List:");

        printList(head);

    }

}