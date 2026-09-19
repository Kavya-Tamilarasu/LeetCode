class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node dummy;
    int size;

    public MyLinkedList() {
        dummy = new Node(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = dummy.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        Node nn = new Node(val);

        nn.next = dummy.next;
        dummy.next = nn;

        size++;
    }

    public void addAtTail(int val) {
        Node curr = dummy;

        while (curr.next != null) {
            curr = curr.next;
        }

        Node nn = new Node(val);
        curr.next = nn;

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        Node curr = dummy;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node nn = new Node(val);

        nn.next = curr.next;
        curr.next = nn;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        Node curr = dummy;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */