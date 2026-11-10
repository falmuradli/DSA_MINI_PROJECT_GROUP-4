public class Node {

    String url;
    Node prev;
    Node next;

    public Node(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
