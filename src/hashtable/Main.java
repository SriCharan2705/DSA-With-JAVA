package hashtable;

public class Main {
    public static void main(String args[]){
        HashTable myHashTable =new HashTable();
        myHashTable.set("car",22);
        myHashTable.set("sri",18);
        myHashTable.set("charan",55);
        myHashTable.set("virat",143);

        myHashTable.printTable();


        System.out.println(myHashTable.get("sri"));

        System.out.println(myHashTable.keys());
    }
}
