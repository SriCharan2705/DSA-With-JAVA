package algorithms;

import java.util.Arrays;
///112. merge
public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] combine = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combine[index] = array1[i];
                index++;
                i++;
            } else {
                combine[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combine[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combine[index] = array2[j];
            index++;
            j++;
        }
        return combine;
    }


    //113. Merge Sort
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);
    }


    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2};
        int[] sortedArray = mergeSort(originalArray);
        System.out.println("\n origianl Aarray :" + Arrays.toString(originalArray));
        System.out.println("\n sorted Array :" + Arrays.toString(sortedArray));
    }
}
