package queue;
//////////////// 47.Constructor //////////////////////
public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {  //class used to create a node
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Queue(int value){  //constructor of Queue to create a Queue using node
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    ////////////// 48.Enqueue , adding the Node at the Last of a Queue ////////////////////
    public void enqueue(int value){
        Node newNode=new Node(value);
        if(length==0){
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    /////////////////// 49. Dequeue , removing the Node from the first  of a Queue.//////////////////
    public Node dequeue(){
        Node temp=first;
        if(length==0)return null;
        if(length==1) {
            first=null;
            last=null;
        }else{
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    //////////////////////////////////////////////////////////////////////////////////
    public void printQueue(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getFirst(){
        System.out.println("first :"+first.value);
    }
    public void getLast() {
        System.out.println("Last :" + last.value);
    }
    public void getlength(){
        System.out.println("Length :"+length);
    }
}
