package heap;

public class main {
    public static void main(String[]args){
        Heap myHeap= new Heap();
        myHeap.insert(22);
        myHeap.insert(12);
        myHeap.insert(33);
        myHeap.insert(25);
        System.out.println(myHeap.getHeap());
        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
    }
}
