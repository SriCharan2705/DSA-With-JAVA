package practice;

import practice.List;

public class mainList {
    public static void main (String[]args){
        List myList =new List(50);
        myList.append(30);
        myList.append(3);
        myList.myPrint();
        myList.printLength();

    }
}
