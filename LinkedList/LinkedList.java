package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // get first node of list
    public Node getFirst(){
        return this.head;
    }

    // get last node of list
    public Node getLast(){
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;  
    }

    // add node at first
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    // add node at last
    public void addLast(int data){
        Node newNode = new Node(data);
        Node lastNode = getLast();
        lastNode.next = newNode;
    }

    // remove first node
    public void removeFirst(){
        this.head = this.head.next;
    }

    // remove last node
    public void removeLast(){
        Node current = head;
        Node prv = null;
        while (current.next != null) {
            prv = current;
            current = current.next;
        }
        prv.next = null;
    }

}
