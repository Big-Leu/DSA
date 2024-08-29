import java.util.*;
public class code2 {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }
    void reserverList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        code2 list = new code2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.reserverList();
        System.out.println();
        list.printList();
    }
}
