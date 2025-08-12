package LinkedL;

public class LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst (int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast (int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print () {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-" + ">");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void add(int idx,int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(head == null ){
            System.out.print("LinkedL.LL is empty");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        Node temp = head;
        int val = tail.data;
        int i=0;
        while (i<size-1){
            temp = temp.next;
            i++;
        }
        return val;
    }

    public static void main(String[] Args) {
        LL ll = new LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        System.out.println();
        System.out.print(ll.size);
        System.out.println();

    }
}
