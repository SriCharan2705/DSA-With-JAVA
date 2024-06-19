package stack;

//////////////// 43.Stack ,Constructor. //////////////////////////
public class Stack {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    /////////////// 44.Push , adding a node to the Top of a Stack. //////////////////////////////
    public void push(int value){
        Node newNode=new Node(value);
        if(height==0){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
        height++;
    }


    ///////////////////// 45.pop, removing a Node from the top of a Stack.///////////////////////////////
    public Node pop(){
        if (height==0)return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getHeight(){
        System.out.println("Height :"+height);
    }
    public void printTop(){
        System.out.println("Top :"+top.value);
    }
}
