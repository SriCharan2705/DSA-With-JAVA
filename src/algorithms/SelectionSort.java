package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int[]array){
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            for(int j=i+1;j< array.length;j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                    int temp=array[i];
                    array[i]=array[minIndex];
                    array[minIndex]=temp;
                }
            }
        }
    public static void main (String[]args){
        int[]myArray={4,2,6,5,1,3};
        SelectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
