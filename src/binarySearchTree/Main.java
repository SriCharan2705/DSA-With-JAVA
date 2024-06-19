package binarySearchTree;

public class Main {
    public static void main(String[]args){
        BinarySearchTree myBST=new BinarySearchTree();
        System.out.println("Root :"+myBST.root);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.rInsert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.BFS());/// 95.BFS

///////////////91.rBST Minimum /////////////////////
        System.out.println("root Min:");
        System.out.println(myBST.minValue(myBST.root));
        System.out.println("root Right Min:");
        System.out.println(myBST.minValue(myBST.root.right));


        System.out.println(myBST.root.left.right.value);//to print the particular node of a tree using its position

        //// using Iteration
//        System.out.println(myBST.contain(27));
//        System.out.println(myBST.contain(143));


        ///////using recursion/////////
        System.out.println("\n myBST contain 27 :");
        System.out.println(myBST.rContains(21));

        System.out.println("\n myBST contain 143");
        System.out.println(myBST.rContains(143));

        System.out.println("root :" +myBST.root.value);
        System.out.println("left :" +myBST.root.left.value);
    }
}
