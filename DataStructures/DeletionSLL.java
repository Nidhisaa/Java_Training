package DataStructures;

class Nodes{
    Node next;
}
class DeleteSLL{
    Node head;

    // while creating node head should be null
    DeleteSLL(){
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

    void deleteAtEnd(){      //Deletion at end 
        if(head == null){
            System.out.println("List is Empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
             prev.next = null;
        }
    }

    void deleteAtBegin(){  // Deletion at begining
        if(head == null){
            System.out.println("List is Empty");
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    void deleteAtPosition(int pos){    // Deletion at position
        Node temp = head;
        Node prev = null;
        for(int i=1; i<=pos-1; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    void display(){    //To display the list
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class DeletionSLL {
    public static void main(String[] args) {
        DeleteSLL s1 = new DeleteSLL();

        // Initial values to be inserted in list
        s1.insertAtEnd(10);
        s1.insertAtEnd(22);
        s1.insertAtEnd(50);
        s1.insertAtEnd(75);
        s1.insertAtEnd(65);
        s1.insertAtEnd(47);
        
        System.out.println("List is : ");
        s1.display();

        System.out.println("Delete at End :");
        s1.deleteAtEnd();
        s1.display();

        System.out.println("Delete at Begining");
        s1.deleteAtBegin();
        s1.display();

        System.out.println("Delete at Position");
        s1.deleteAtPosition(3);
        s1.display();        
    }
}