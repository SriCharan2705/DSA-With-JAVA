package DoublyLinkedList;

//////////////33. constructor of the doubly linked list ///////////////////
public class DoublyLinkedList {
    private Node head;  //creating a head variable
    private Node tail;  //creating a tail variable;
    private int length;  //creating a length variable;

    class Node{
        int value; //value of node
        Node next; //used to move next in the list
        Node prev; //used to move back in the list
        Node(int value){
            this.value=value;
        }  //method to assign the value to the node
    }

    public DoublyLinkedList(int value){ //creating the node
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }


///////////// 34.append  , inserting a value in the list at the end  ///////////////////
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }

    ////////////////// 35.remove last , removing the last element in list/////////////
    public Node removeLast(){
        if(length==0) return null;
        Node temp=tail;
        if (length==1){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }

    ////////////////// 36.prepend  , inserting a value at the starting of a list /////////////////////
    public void prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    /////////////// 37.remove first, removing the first element of the list  /////////////////////////
    public Node removeHead() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }


    /////////////// 38.get , to print a value of the list using index number////////////////
    public Node get(int index){
        if(index<0||index>=length)return null;
        Node temp=head;
        if(index<length/2){
            for(int i=0;i<index;i++){
                temp=temp.next;}
        }else{
            for(int i=length-1;i>=index;i--){
                temp=temp.prev;
            }
        }
        return temp;
    }

    /////////////// 39.set ,  change a value of a list using index number//////////////////////
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }else return false;
    }

    ////////////////////  40.insert ,  to insert a value in between two values of a list using indexing///////////////
    public boolean insert(int index,int value){
        if(index<0||index>length)return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if(index==length-1){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node before=get(index-1);
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;
    }

    ////////////// 41. remove, removing a value from the list using indexing////////////////
    public Node remove(int index){
        if (index<0||index>=length)return null;
        if(index==0)return removeHead();
        if(index==length-1)return removeLast();

        Node temp=get(index);

        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
    }
    public void printNode(){
        Node temp;
        temp = head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){System.out.println("Head :"+head.value);}
    public void getTail(){System.out.println("Tail :"+tail.value);}
    public void getLength(){System.out.println("Length :"+length);}
}
