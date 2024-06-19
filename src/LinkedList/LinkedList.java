package LinkedList;

////////////////////  22.creating actual linked list and giving the elements using the method class   ////////////////////
public class LinkedList { //creating a head , tail, length to the node
    private Node Head;   //creating a head to the node,here "Head" can be replaced with any other variable
    private Node Tail;   //creating a tail to the node,here "Tail" can be replaced with any other variable
    private int Length;  //function of length of the list

    class Node {  //instance variable of elements in list is created
        int valueofnode; //values of the list
        Node next;

        Node(int value) {    //constructor of node through which we can give the elements to the list
            this.valueofnode = value;  //assigning the given element in constructor to the list
        }
    }

    public LinkedList(int LLvalue) { //constructor of LinkList which is a main class & giving elements of list
        Node Node1 = new Node(LLvalue);   //creating a new node using method class "Node"
        Head = Node1;//assigning the head value which will be give while creating the linked list
        Tail = Node1;//'''''''''''''tail''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        Length = 1;//fixing the length of the list

    }

    public void PrintList() { //method to print all the elements in the list
        Node a = Head;// "a"is the head of the list
        while (a != null) {//until "a" becomes null we can print the values of the list
            System.out.println(a.valueofnode);
            a = a.next;//and is kept moving forward until null
        }
    }


    //////////////////// 23.adding a element to a list from the tail end  ////////////////////
    public void append(int value) {     //append is used to add element to the list at tail
        Node newNode = new Node(value);// creating a new node to add append it at the tail
        if (Length == 0) {    //if no element is present in the list append element itself is head and tail
            Head = newNode;
            Tail = newNode;
        } else {            //if there are elements in the list,you have to add an element to the list
            Tail.next = newNode;
            Tail = newNode;
        }
        Length++;
    }

    ////////////////////   25.removing the elements of a list from the tail end //removing the last element  ////////////////////
    public Node removeLast() {
        if (Length == 0) return null;
        Node temp = Head;
        Node pre = Tail;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        Tail = pre;
        Tail.next = null;
        Length--;
        if (Length == 0) {
            Head = null;
            Tail = null;
        }
        return temp;
    }

    ////////////////////   26. adding the element to a list at the head   ////////////////////
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (Length == 0) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
        Length++;
    }


    ////////////////////  27. removing the first element or head element of a list   ////////////////////
    public Node removeFirst() {
        if (Length == 0) return null;
        Node temp = Head;
        Head = Head.next;
        temp.next = null;
        Length--;
        if (Length == 0) {
            Tail = null;
        }
        return temp;
    }


    ////////////////////  28.Printing the element in the list using index number (get the element using index) ///////////////////
    public Node get(int index) {
        if (index < 0 || index > Length) {
            return null;
        }
        Node temp = Head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //////////////////// 29.setting / editing an existing element in a list using indexing  ////////////////////
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.valueofnode = value;
            return true;
        }
        return false;
    }

    ////////////////////   30.inserting the element in between the list using index number     ////////////////////
    public boolean insert(int index, int value) {
        if (index < 0 || index > Length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == Length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        Length++;
        return true;
    }


    ////////////////////  31.removing the element of the list using the index number   ////////////////////
    public Node remove(int index) {
        if (index < 0 || index > Length) return null;
        if (index == 0) return removeFirst();
        if (index == Length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        return temp;
    }

    ////////////////////  32. Reversing th e direction of the list where head becomes tail and tail becomes head  ////////////////////
    public void reverse() {
        Node temp = Head;
        Head = Tail;
        Tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < Length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////
    public void getHead() {
        System.out.println("Head : " + Head.valueofnode);
    }

    public void getTail() {
        System.out.println("Tail :" + Tail.valueofnode);
    }

    public void getLength() {
        System.out.println("Length :" + Length);
    }

    /////////////////////////////////////////////////////////////////////

// LEETCODE Exercise
// Exercise 12
// Find Middle Node

    public Node Middle() {
        if (Length == 1) return get(0);
        else {
            Node mid = get(Length / 2);
            return mid;
        }
    }
    //Exercise 13
    // find the kth node from the end

    public Node k(int value) {
        value = Length - value;
        Node kTH = get(value);
        return kTH;
    }

    //Exercise 14
    //partition

    public void partition(int value) {
        if(Head==null) return ;

        Node dummy1=new Node(0);
        Node dummy2=new Node(0);

        Node prev1=dummy1;
        Node prev2=dummy2;
        Node current=Head;

        while(current!=null){
            if(current.valueofnode<value){
                prev1.next=current;
                prev1= current;
            }else {
                prev2.next=current;
                prev2=current;
            }
            current=current.next;
        }
        prev2.next=null;
        prev1.next=dummy2.next;

        Head=dummy1.next;

    }
}








