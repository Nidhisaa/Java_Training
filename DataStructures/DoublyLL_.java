package DataStructures;

public class DoublyLL_ {

  
static class DNode{
    int data;
    DNode next;
    DNode prev;
}

static class DLL{
    DNode head;

    DLL(){
        head = null; 
    }


    void insertAtEnd(int val){
        DNode newNode = new DNode();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;

        if(head == null){
            head = newNode;
        }else{
            DNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void insertAtBegin(int val){
        DNode newNode = new DNode();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;

            head = newNode;
        }
    }

    void insertAtPosition(int val, int pos){
        DNode newNode = new DNode();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;

        if(head == null){
            head = newNode;
        }else{
            DNode temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;

            // this is better version of insert at end which is available in text book
            // newNode.next = temp.next;
            // newNode.next.prev = newNode;
            // newNode.prev = temp;
            // temp.next = newNode;
        }
    }

    void forwardTraversal(){
        DNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void backwardTraversal(){
        DNode temp = head;
    
        // travelled from first node to last node 
        while(temp.next != null){
            temp = temp.next;
        }

        // from last node to first node
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();

    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertAtEnd(20);
        d.insertAtEnd(15);
        d.insertAtEnd(45);
        d.insertAtEnd(50);
        d.insertAtEnd(10);

        System.out.println("Original List is: ");
        d.forwardTraversal();

        System.out.println("Insert at end: ");
        d.insertAtEnd(31);
        d.forwardTraversal();

        System.out.println("Insert at begining: ");
        d.insertAtBegin(75);
        d.forwardTraversal();

        System.out.println("Insert at Position: ");
        d.insertAtPosition(27, 3);
        d.forwardTraversal();

        System.out.println("Backward Traversal: ");
        d.backwardTraversal();

    }
    
}
}
    