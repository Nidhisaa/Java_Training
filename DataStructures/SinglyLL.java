package DataStructures;

// Structure of the Node
class Node{
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

    void insertAtPosition(int val, int pos){  // insert at position
        Node newNode = new Node();
        newNode.data = val;
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void insertAtMiddle(int val){  // insert at middle
        Node newNode = new Node();
        newNode.data = val;
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            int n = countNodes();
            for(int i=1;i<n/2;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }


    private int countNodes() {
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class SinglyLL {
    public static void main(String[] args) {
        SLL s1 = new SLL();

        // Initial values
        s1.insertAtEnd(20);
        s1.insertAtEnd(40);
        s1.insertAtEnd(50);

        System.out.print("Original List: ");
        s1.display();

        // Insert at beginning
        s1.insertAtBegin(10);
        System.out.print("Insert at Begining: ");
        s1.display();

        // Insert at end
        s1.insertAtEnd(60);
        System.out.print("Insert at End: ");
        s1.display();

        // Insert 30 at position 3
        s1.insertAtPosition(30, 3);
        System.out.print("Insert at Position: ");
        s1.display();
        // Insert at middle
        s1.insertAtMiddle(25);
        System.out.print("Insert at Middle: ");
        s1.display();

        System.out.print("After Insertions: ");
        s1.display();
    }
    
}