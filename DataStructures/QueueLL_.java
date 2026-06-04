package DataStructures;

public class QueueLL_ {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        Queue() {
            front = rear = null;
        }

        void enque(int data) {
            Node nn = new Node(data);

            if (front == null) {
                front = rear = nn;
            } else {
                rear.next = nn;
                rear = nn;
            }
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int deque() {
            if (front == null) return -1;

            Node t = front;
            front = front.next;
            t.next = null;

            return t.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);

        q.display();

        System.out.println("Dequed  value : " + q.deque());

        q.display();
    }

}
