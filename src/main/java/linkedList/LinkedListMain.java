package linkedList;


public class LinkedListMain {

    public static void main(String args[]) throws Exception {

        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(2);
        head.next.next = new LinkNode(3);
        head.next.next.next = new LinkNode(4);
        head.next.next.next.next = new LinkNode(5);
        head.next.next.next.next.next = new LinkNode(6);
        head.next.next.next.next.next.next = new LinkNode(7);

        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.insertElementAtHead(head, 120);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.insertElementAtTail(head, 121);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.insertElementAtPosition(head, 44, 4);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.deleteElementWithValue(head, 5);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.deleteElementAtPosition(head, 4);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        head = LinkListService.reverseLinkedList(head);
        LinkListService.printElements(head);

        System.out.println("----------------------------");
        LinkListService.reverseLinkedListPrint(head);

        System.out.println(LinkListService.compareLinkedList(null, null));
        System.out.println(LinkListService.compareLinkedList(null, head));
        System.out.println(LinkListService.compareLinkedList(head, null));

    }
}
