package DataStructures.LinkedList;

public class DeletionDLL_ {
    

    static class DNoded{
    int data;
    DNoded next;
    DNoded prev;
}

static class DLLdelete{
    DNoded head;

    DLLdelete(){
        head = null; 
    }


    void insertAtEnd(int val){
        DNoded newNode = new DNoded();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;

        if(head == null){
            head = newNode;
        }else{
            DNoded temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteAtEnd(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        DNoded temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        if(temp.prev == null){
            head = null;
        }else{
            temp.prev.next = null;
            temp.prev = null;
        }
    }

    void deleteAtBegining(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        DNoded temp = head;
        head = head.next;

        if(head != null){
            head.prev = null;
        }

        temp.next = null;
    }

    void deleteAtPosition(int pos){
        if(head == null || pos <= 0){
            System.out.println("Invalid position");
            return;
        }

        DNoded temp = head;
        for(int i=1;i<pos && temp != null;i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid position");
            return;
        }

        if(temp.prev != null){
            temp.prev.next = temp.next;
        }else{
            head = temp.next;
        }

        if(temp.next != null){
            temp.next.prev = temp.prev;
        }

        temp.next = null;
        temp.prev = null;
    } 

    void forwardTraversal(){
        DNoded temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class DeletionDLL {
    public static void main(String[] args) {
        DLLdelete d = new DLLdelete();
        d.insertAtEnd(20);
        d.insertAtEnd(15);
        d.insertAtEnd(45);
        d.insertAtEnd(50);
        d.insertAtEnd(10);
        d.insertAtEnd(12);
        d.insertAtEnd(89);

        System.out.println("Original List is: ");
        d.forwardTraversal();

        System.out.println("Delete at end: ");
        d.deleteAtEnd();
        d.forwardTraversal();

        System.out.println("Delete at begining: ");
        d.deleteAtBegining();
        d.forwardTraversal();

        System.out.println("Delete at Position 3: ");
        d.deleteAtPosition(3);
        d.forwardTraversal();
    }
    
}
}
