package Developer_Docs;

public class Linked_List_Cycle {
 public static boolean hasCycle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          

            fast = fast.next.next;     

            if (slow == fast) {

                return true;           

            }

        }

        return false; 

    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 2 (cycle)

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);

        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);

        // Creating cycle

        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);

        System.out.println("Cycle exists: " + result);

    }

}