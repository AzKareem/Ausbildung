package Methoden;

import java.util.Arrays;


public class MergeSort {
    public static void main(String[] args) {

        int[] randomArray = {2, 6, 1, 9, 16, 77, 33, 3};
        mergeSort(randomArray);
        System.out.print(Arrays.toString(randomArray));

    }

    public static void mergeSort(int[] randomArray) {

        int seperatedArrayLength = randomArray.length;

        if (seperatedArrayLength < 2) {
            return;
        }
        int midIndex = seperatedArrayLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[seperatedArrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = randomArray[i];
        }
        for (int i = midIndex; i < seperatedArrayLength; i++) {
            rightHalf[i - midIndex] = randomArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(randomArray, leftHalf, rightHalf);

    }

    public static void merge(int[] randomArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                randomArray[k] = leftHalf[i];
                i++;
            } else {
                randomArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            randomArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            randomArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }


}
