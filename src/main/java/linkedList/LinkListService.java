package linkedList;

import java.util.NoSuchElementException;

class LinkListService {

    /**
     * display each element of the linked list.
     * check if head is not null , print the data in head,\
     * make the next node as the head and display data in the head node.
     * @param head the initial element of the linked list.
     */
    static void printElements(LinkNode head) {
        if (head != null) {
            System.out.println(head.element);
            while (head.next != null) {
                head = head.next;
                System.out.println(head.element);
            }
        }
    }

    static LinkNode insertElementAtHead(LinkNode head, Object obj) {
        if (head == null) {
            return new LinkNode(obj);
        }
        LinkNode node = new LinkNode(obj);
        node.next = head;
        return node;
    }

    static LinkNode insertElementAtTail(LinkNode head, Object obj) {
        if (head == null) {
            return new LinkNode(obj);
        }
        LinkNode actualHead = head;

        while (head.next != null) {
            head = head.next;
        }
        head.next = new LinkNode(obj);
        return actualHead;
    }

    static LinkNode insertElementAtPosition(LinkNode head, Object obj, int position) {
        if (head == null) {
            if (position == 0) {
                return new LinkNode(obj);
            } else {
                throw new IllegalArgumentException("LinkedList is empty and position to insert is not equal to ZERO");
            }
        }

        if (position == 0) {
            LinkNode node = new LinkNode(obj);
            node.next = head;
            return node;
        }
        LinkNode actualHead = head;
        int count = 1;
        while (position != count) {
            if (head.next != null) {
                head = head.next;
                count++;
            } else {
                throw new IllegalArgumentException("position to insert is greater than linkedList size");
            }
        }
        LinkNode newNode = new LinkNode(obj);
        LinkNode temp = head.next;
        head.next = newNode;
        newNode.next = temp;
        return actualHead;
    }

    static LinkNode deleteElementWithValue(LinkNode head, Object obj) {
        if (head == null) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        if (head.element == obj) {
            return head.next;
        }

        LinkNode actual = head;
        while (head.next != null) {
            if (head.next.element == obj) {
                head.next = head.next.next;
                return actual;
            } else {
                head = head.next;
            }
        }
         throw new NoSuchElementException("Object to delete doesn't exist in the linked List");
    }

    static LinkNode deleteElementAtPosition(LinkNode head, int position) {

        if (head == null) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        if (position == 0) {
            return head.next;
        }
        int count = 1;
        LinkNode actual = head;

        while (head.next != null) {
            if (count == position) {
                head.next = head.next.next;
                return actual;
            } else {
                count++;
                head = head.next;
            }
        }

        throw new IndexOutOfBoundsException("position provided doesn't exist in the linked list");
    }

    static LinkNode reverseLinkedList(LinkNode head) {
        LinkNode previous = null;
        LinkNode current = head;
        LinkNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    static void reverseLinkedListPrint(LinkNode head) {
        LinkNode previous = null;
        LinkNode current = head;
        LinkNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        printElements(previous);
    }

    //TODO: implement the actual logic
    static Boolean compareLinkedList(LinkNode head1, LinkNode head2) {
        if (head1 == null || head2 == null) {
            if ((head1 != null && head2 == null) || (head1 == null && head2 != null)) {
                return false;
            } else if (head1 == null && head2 == null) {
                return true;
            }
        }
        return null;
    }
}
