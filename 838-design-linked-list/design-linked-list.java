class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    Node head;
    int size;

    public MyLinkedList() {}

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node t = head;
        while (index-- > 0) t = t.next;
        return t.val;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (head == null) head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) { addAtHead(val); return; }
        Node t = head;
        while (--index > 0) t = t.next;
        Node n = new Node(val);
        n.next = t.next;
        t.next = n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) head = head.next;
        else {
            Node t = head;
            while (--index > 0) t = t.next;
            t.next = t.next.next;
        }
        size--;
    }
}