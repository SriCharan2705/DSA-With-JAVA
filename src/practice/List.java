package practice;

import org.w3c.dom.*;
public class List {
    private Nod Head;
    private Nod Tail;
    private int Length;

    class Nod{
        int nodeValues;
        Nod next;
        Nod(int a){
            this.nodeValues=a;
        }
    }

    List(int b){
        Nod myNode=new Nod(b);
        Head=myNode;
        Tail=myNode;
        Length=1;
    }
    public void myPrint(){
        Nod x=Head;
        while(x!= null){
            System.out.println(x.nodeValues);
            x=x.next;
        }
    }
    public void append(int insert){
        Nod addNode=new Nod(insert);
        if (Length==0){
            Head=addNode;
            Tail=addNode;
        }else{
            Tail.next=addNode;
            Tail=addNode;
        }
    }
    public void printLength(){
        System.out.println("Length : "+Length);
    }

}
