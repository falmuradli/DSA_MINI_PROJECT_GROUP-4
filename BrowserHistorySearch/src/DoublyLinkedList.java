public class DoublyLinkedList {

    Node head;
    Node tail;
    Node current;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
    }

    public Node addFirstPage(String url) {
        if(head == null) return null;

        Node newNode = new Node(url);
        head = newNode;
        tail = newNode;
        current = newNode;
        size++;

        return newNode;
    }

    public void addPage(String url) {

        Node temp = current.next;

        while (temp != null) {
            size--;
            temp = temp.next;
        }

        current.next = null;
        tail = current;

        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = tail;
        current = newNode;
        tail = newNode;
        size++;

    }

    public String back(int steps) {
        for(int i = 0; i < steps; i++) {
            if(current.prev != null) {
                current = current.prev;
            }
        }

        return current.url;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if(current.next == null) {
                break;
            }
            current = current.next;
        }

        return current.url;
    }

    public String currentPage() {
        if(current == null) {
            return "No active page";
        }

        return current.url;
    }
}
