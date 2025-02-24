class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;  
        this.next = null;
    }
}

class Singly {
    Node head;

    
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode; 
    }

    
    public void printTheList() {
        Node current = head; 
        while (current != null) {  
            System.out.println(current.data + " "); 
            current = current.next; 
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Singly list = new Singly();
        list.append(10);
        list.append(20);
        list.append(30);

        list.printTheList();  
    }
}
