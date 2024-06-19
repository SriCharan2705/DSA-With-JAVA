package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
 import java.util.Queue;

////////////////////// 53. Binary Search Tree ,Constructor //////////////////////////////////
public class BinarySearchTree {
    Node root;  //root node shouldn't be private
    class Node{
        int value;
        Node left; //to access left side node of the BST
        Node right;// to access right side node of the BST
        Node(int value){
            this.value=value;
        } // constructor for Node
    }
    ////////////////////55.BST Insert ,inserting  a Node.//////////////////////
    public boolean insert(int value){
        Node newNode=new Node(value);  // creating a new node which is to be inserted in BST
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true){
            if(newNode.value==temp.value)return false;
            if(newNode.value<temp.value){
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }else{
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }
    /////////////////57.contains, using Iteration method ////////////////////////////
    public boolean contain(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
    //////////////////**** Section 24, Recursive Binary Search  ******/////////////////

    /////////////////////86. rBST:Contains, using Recursion method /////////////////
    private boolean rContains(Node currentNode,int value){
        if(currentNode==null)return false;

        if(currentNode.value==value)return true;

        if(value<currentNode.value){
            return rContains(currentNode.left,value);
        } else{
            return rContains(currentNode.right,value);
        }
    }
    public boolean rContains(int value){
        return rContains(root,value);
    }
////////////87. rBST:Insert /////////////////
    private Node rInsert(Node currentNode,int value){
        if(currentNode==null)return new Node(value);

        if(value<currentNode.value){
           currentNode.left=rInsert(currentNode.left,value);
        }else{
            currentNode.right=rInsert(currentNode.right,value);
        }
        return currentNode;
    }
    public void rInsert(int value){
        if (root==null) root= new Node(value);
        rInsert(root,value);
    }

    //////////////91.rBST Minimum Value, Helper method/////////////

    public int minValue(Node currentNode){
        while(currentNode.left!=null){
            currentNode=currentNode.left;
        }
        return currentNode.value;
    }

    ////////////////92.rBST:Delete Node ///////////////////////////

    private Node deleteNode(Node currentNode,int value){
        if (currentNode==null)return null;

        if(value<currentNode.value){
            currentNode.left=deleteNode(currentNode.left,value);
        } else if (value>currentNode.value) {
            currentNode.right=deleteNode(currentNode.right,value);
        }else {
            if(currentNode.left==null && currentNode.right==null){
                return null;
            } else if (currentNode.left==null) {
                currentNode=currentNode.right;
            } else if (currentNode.right==null) {
                currentNode=currentNode.left;
            }else{
                int subTreeMin=minValue(currentNode.right);
                currentNode.value=subTreeMin;
                currentNode.right=deleteNode(currentNode.right,subTreeMin);
            }
        }
        return currentNode;
    }


    //////////////////Section 26: Tree Traversal ////////////////////

    //95. Breadth First Search

    public ArrayList<Integer>BFS(){
        Node currentNode=root;
        Queue<Node>queue=new LinkedList<>();

        ArrayList<Integer>result=new ArrayList<>();
        queue.add(currentNode);

        while(queue.size()!=0){
            currentNode=queue.remove();
            result.add(currentNode.value);

            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
        return result;
    }

}






