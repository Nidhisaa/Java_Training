package DataStructures;

class Node2{
    int data;
    Node2 next;
}
class CircularSinglyLinkedList{
    Node2 head;
    CircularSinglyLinkedList(){
        head = null;
    }

    void insertAtEnd(int data){
        Node2 newNode = new Node2();
        newNode.data  = data;
        newNode.next = null;


        if(head==null){
            head = newNode;
            newNode.next = head;
        }
        else{
            Node2 temp = head;

            while(temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }
    void insertAtBegining(int data){
        Node2 newNode = new Node2();
        newNode.data  = data;
        newNode.next = null;

        Node2 temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        newNode.next = head;
        head = newNode;
        temp.next =head;
    }

    void traversal(){
        Node2 temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!= head);
        System.out.println();
    }

    void deleteAtEnd(){
        Node2 temp = head;
        Node2 previous = null;
        while(temp.next != head){
            previous = temp;
            temp = temp.next;
        }

        previous.next = head;
    }

    void deleteAtBegining(){
        Node2 temp1 = head;
        
        Node2 temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp1.next = null;
        temp.next = head;
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.insertAtEnd(20);
        list.insertAtEnd(10);
        list.insertAtEnd(40);
        list.insertAtEnd(30);
        System.out.println("Original List: ");
        list.traversal();

        list.insertAtBegining(77);
        System.out.println("Insert at Begining: ");
        list.traversal();

        System.out.println("Delete at end: ");
        list.deleteAtEnd();
        list.traversal();

        System.out.println("Delete at begining: ");
        list.deleteAtBegining();
        list.traversal();
    }
}