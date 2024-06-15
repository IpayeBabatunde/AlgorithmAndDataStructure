import javax.swing.plaf.PanelUI;

public class SingleLinkedList {

    // implementation of singly linked list
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    public void printLinkedList () {
        if(head == null) {
            System.out.println("null");
        }
        ListNode current = head;
        while (null != current){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Algorithm to display nodes
    public void display () {
        ListNode current = head;
        while (current != null ) {
            System.out.print(current.data + " ---> ");
            current = current.next;
                    }
        System.out.println("null");
    }

    // Algorithm to find length
    public int length () {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    // Algorithm to insert first node to the head
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Algorithm to insert node
    public void insertNode (int position, int value) {
        // 1 -> 4 -> 5 initial node (insert value 6 in position 2 (6,2))
        // 1 -> 6 -> 4 -> 5 inserted
        ListNode node = new ListNode(value);
        if ( position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count ++;

            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }



    }

    // Algorithm to insert last node to the head
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }

    // Delete the first node
    public ListNode deleteFirst () {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }


    // Algorithm to insert a node in list order
    public ListNode insertInSortedlist (int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;

    }

    // To remove a given key from node
    public void deleteNode (int key) {
        ListNode current = head;
        ListNode temp = null;
        if ( current != null && current.data == key )
        {
            head = current.next;
            return;
        } while (current != null && current.data != key){
            temp = current;
            current = current.next;
        }if (current == null){
            return;
        }
        temp.next = current.next;
    }



    // To print Output
    public static void main(String[] args) {
        SingleLinkedList len = new SingleLinkedList();
        len.insertAtBeginning(17);
        len.insertAtBeginning(11);
        len.insertAtBeginning(8);
        len.insertAtBeginning(3);
        len.insertAtBeginning(1);

        len.printLinkedList();
        len.deleteNode(11);
        len.printLinkedList();

        //insert element

       //len.head = new ListNode(10);
       //ListNode second = new ListNode(20);
       //ListNode third = new ListNode(30);
       //ListNode fourth = new ListNode(40);

        //len.head.next = second;
        //second.next = third;
         //third.next = fourth;

        //len.insertFirst(11);
        //len.insertFirst(8);
        //len.insertFirst(2);
      // len.insertLast(11);
      // len.insertLast(8);
      // len.insertLast(2);
       // len.display();
       // System.out.println(len.deleteFirst().data);
       // System.out.println(len.deleteFirst().data);
        // System.out.println(len.deleteFirst().data);
       // len.display();
        // System.out.println("the value of length - " + len.length());

        //len.insertNode(1, 3); // 3 -> null
        //len.insertNode(2, 5); // 3 -> 5 -> null
        //len.insertNode(1,9); // 2 -> 3 -> 5 -> null
        //len.insertNode(2, 4); // 2 -> 4 -> 3 -> 5 -> null
        //len.insertNode(5, 0); // 2 -> 4 -> 3 -> 5 -> 0 -> null
        //len.display();
    }
}
