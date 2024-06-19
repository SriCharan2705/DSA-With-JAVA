package LinkedList;

public class Main {
    public static void main(String[] args) {

        ////////////////////  22.creating actual linked list and giving the elements using the method class   ////////////////////

        LinkedList myLinkedList=new LinkedList(4);

        //////////////////// 23.adding a element to a list from the tail end  ////////////////////

        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(20);
        myLinkedList.PrintList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.partition(7);
        myLinkedList.PrintList();
        myLinkedList.getHead();
        myLinkedList.getTail();


//        System.out.println("Mid value :"+myLinkedList.Middle().valueofnode);
//        System.out.println("kth value from the end :"+myLinkedList.k(3).valueofnode);



        ////////////////////   25.removing the elements of a list from the tail end //removing the last element  ////////////////////

        //when length=2
//        System.out.println(myLinkedList.removeLast().valueofnode);
//        //when length=1
//        System.out.println(myLinkedList.removeLast().valueofnode);
//        //when length=0
//        System.out.println(myLinkedList.removeLast());



        ////////////////////   26. adding the element to a list at the head   ////////////////////

//        myLinkedList.prepend(25);
//        System.out.println("LinkedList after adding/prepend (25) :");
//        myLinkedList.PrintList();


        ////////////////////  27. removing the first element or head element of a list   ////////////////////

          ////when the list contain 3 elements
//        System.out.println(myLinkedList.removeFirst().valueofnode);

//        ////when the list contain 2 element
//        System.out.println(myLinkedList.removeFirst().valueofnode);

//        ////when the list contain 1 elements
//        System.out.println(myLinkedList.removeFirst().valueofnode);

//        ////when the list contain 0 elements
//        System.out.println(myLinkedList.removeFirst());


        ////////////////////  28.Printing the element in the list using index number (get the element using index) ///////////////////

//        System.out.println("The element in the given index is : "+myLinkedList.get(0).valueofnode);



        //////////////////// 29.setting / editing an existing element in a list using indexing  ////////////////////

//        myLinkedList.set(2,10);
//        System.out.println("after set operation");
//        myLinkedList.PrintList();


        ////////////////////   30.inserting the element in between the list using index number     ////////////////////

        // myLinkedList.insert(2,15);



        ////////////////////  31.removing the element of the list using the index number   ////////////////////

       // myLinkedList.remove(1);
        //myLinkedList.PrintList();

        ////////////////////  32. Reversing the direction of the list where head becomes tail and tail becomes head  ////////////////////

        //myLinkedList.reverse();
        //myLinkedList.PrintList();

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        }
    }