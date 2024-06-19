package DoublyLinkedList;

import LinkedList.LinkedList;

public class DLLmain {
    public static void main(String[]args){
        DoublyLinkedList myDDl=new DoublyLinkedList(5);
        myDDl.append(25);
        myDDl.append(18);
        myDDl.append(12);
        //myDDl.prepend(16);
        myDDl.printNode();

//        System.out.println("Removed Head :"+myDDl.removeHead().value);
//        System.out.println("Removed Tail :"+myDDl.removeLast().value);
//        System.out.println(myDDl.get(2).value);
//        System.out.println(myDDl.set(2,72));
//          myDDl.insert(2,33);
//          myDDl.printNode();
        myDDl.remove(3);
        myDDl.printNode();
//        myDDl.getHead();
//        myDDl.getTail();
//        myDDl.getLength();
    }
}
