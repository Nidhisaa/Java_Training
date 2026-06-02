package DataStructures;

// Structure of the Node
class Node{
    @SuppressWarnings("unused")
    int data;
    Node next;
}

// Singlly linked list
class SLL{
    Node head;

    // while creating node head should be null
    SLL(){
        head = null;
    }

    void insertAtEnd(int val){    //insert at end or last
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    void insertAtBegin(int val){     //insert at begining or first
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        newNode.next = head;
        head = newNode;
    }

    @SuppressWarnings("unused")
    void insertAtPosition(int val, int pos){  // insert at position
        Node newNode = new Node();
        newNode.data = val;
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

}

public class SinglyLL {
    public static void main(String[] args) {
        SLL s1 = new SLL();
        s1.insertAtBegin(0);
        s1.insertAtEnd(50);
        s1.insertAtPosition(70, 2);
    }
    
}