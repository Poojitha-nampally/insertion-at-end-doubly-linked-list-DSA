class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void InsertatEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.prev = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void Traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.InsertatEnd(3000);
        list.InsertatEnd(2000);
        list.InsertatEnd(1000);
        list.Traversal();
    }
}
