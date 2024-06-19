package hashtable;

import java.util.ArrayList;
////////////////60 creating hashtable///////////
public class HashTable {
    private int size =7;    //size of address space
    private Node [] dataMap;  //Node[] is an array of a pointers of dataMap

    class Node {
        String key;  //key of the hashtable
        int value; // value of node
        Node next; //next node

        Node (String key ,int value){  //constructor of the class Node
            this.key=key;
            this.value=value;
        }
    }

    public HashTable(){
        dataMap =new Node[size];
    }

    /////////////61. HT.Hash Method /////////////
    private int hash (String key){
        int hash=0;
        char[] keyChars=key.toCharArray();//this converts input string 'key' into any array of characters
        //called 'keychars',this allows the code to iterate through letter and calculate hashcode
        for (int i=0;i<keyChars.length;i++){
            int asciivalue =keyChars[i];// Inside the loop, it gets the ASCII value of the current character in the string and stores it in the asciiValue variable.
            // In Java, characters are represented as integer values according to their ASCII values.
            hash=(hash+asciivalue * 23)% dataMap.length;
        }
        return hash;
    }

    ////////////// 62.HT:set /////////////////
    public void set (String key,int value){
        int index=hash(key);
        Node newNode=new Node(key,value);
        if (dataMap[index]==null){
            dataMap[index]=newNode;
        }else{
            Node temp=dataMap[index];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    /////////////// 63.HT:Get ////////////////
    public int get (String key){
        int index=hash(key);
        Node temp=dataMap[index];
        while(temp !=null){
            if (temp.key==key) return temp.value;
            temp=temp.next;
        }
        return 0;
    }

    /////////////// 64.keys ///////////////////////
    public ArrayList keys(){
        ArrayList <String> allkeys=new ArrayList<>();
        for (int i=0;i<dataMap.length;i++){
            Node temp=dataMap[i];
            while(temp!=null){
                allkeys.add(temp.key);
                temp=temp.next;
            }
        }
        return allkeys;
    }
    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i+ ":");
            Node temp=dataMap[i];
            while (temp !=null){
                System.out.println("  {"+temp.key+ "="+temp.value+ " }");
                temp=temp.next;
            }
        }
    }
}
