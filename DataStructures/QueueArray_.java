package DataStructures;

class QueueArray{
    int front, rear;
    int []queue;
    
    QueueArray(int size){
        queue = new int[size];
        front = rear = -1;
    }
    void enqueue(int data){
        if(rear == queue.length - 1){
            System.out.println("Queue overflow");
        }
        else{
            if(front == -1){
                front = 0;
            }
            
            queue[++rear] = data;
        }
    }
    
    
    int Dequeue(){
        if(front == -1 || rear < front){
            return -1;
        }
        else{
            int deleted = queue[front];
            front--;
            return deleted;
        }
    }
    
    void peek(){
        System.out.println("Peek element : " + queue[front]);
    }
    
    void display(){
        for(int i = front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
}

public class QueueArray_ {
    public static void main (String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        
        System.out.println("Deleted value : " + q.Dequeue());
        
        q.peek();
        q.display();
    }
}

