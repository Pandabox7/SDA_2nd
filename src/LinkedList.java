
class Node {
    int value;
    Node next;


    public Node(int value) {
        this.value = value;
        this.next = null;

    }
}

public class LinkedList {
    Node first;

    public void add(int value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = first;
            first = newNode;
        }
    }

    public void print() {
        Node temporaryLink = first;
        while (temporaryLink != null) {
            System.out.println(temporaryLink.value);
            temporaryLink = temporaryLink.next;

        }

    }

    public void delete(int value) {
        if (value == first.value) {
            first = first.next;
            return;


        }
        Node temporaryLink = first.next;
        Node previous = first;


        while (temporaryLink != null) {
            if (temporaryLink.value == value) {

                previous.next = temporaryLink.next;

            }
            previous = temporaryLink;

            temporaryLink = temporaryLink.next;
        }
    }


    public boolean search(int value) {
        Node temporaryLink = first;

        while (temporaryLink != null) {
            if (temporaryLink.value == value) {
                return true;

            }
            temporaryLink = temporaryLink.next;

        }
        return false;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(7);
        list.print();
        list.delete(4);
        list.print();
    }

}




