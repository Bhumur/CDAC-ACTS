package ads;

public class LinkedList {

	private Node head;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        newNode.next = head;
        head = newNode;
    }

    public String search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean delete(int key) {
        Node current = head, prev = null;
        while (current != null) {
            if (current.data == key) {
                if (prev == null) head = current.next;
                else prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.data + ", " + current.value + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

