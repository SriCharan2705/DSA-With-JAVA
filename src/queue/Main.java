package queue;

public class Main {
    public static void main(String[]args){
    Queue newQueue=new Queue(22);
    newQueue.printQueue();
    newQueue.enqueue(45);
    newQueue.printQueue();
    newQueue.dequeue();
    newQueue.printQueue();
    }
}
