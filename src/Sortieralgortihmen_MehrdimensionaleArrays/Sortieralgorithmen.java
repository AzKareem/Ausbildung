package Sortieralgortihmen_MehrdimensionaleArrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Sortieralgorithmen {
    public static void main(String[] args) {

        // Bubble Sort Algo
//
//        int[] bubbleSort = {4, 3, 2, 9, 2, 4};
//
//        int temp;
//
//        for (int i = 0; i < bubbleSort.length; i++) {
//            for (int j = 1; j < bubbleSort.length - i; j++) {      // - i weil die letzten zahlen schon überprüft worden sind =0 optimierter
//                if (bubbleSort[j - 1] > bubbleSort[j]) {
//                    temp = bubbleSort[j - 1];
//                    bubbleSort[j - 1] = bubbleSort[j];
//                    bubbleSort[j] = temp;
//                }
//            }
//        }
//
//            System.out.print(Arrays.toString(bubbleSort));



        // Insertion Sort Algo
//
        int[] insertionSort = {11, 1, 4, 9, 34, 22, 91, 3, 7};

        for (int i = 0; i < insertionSort.length; i++) {
            int temp1 = insertionSort[i];
            int n = i;

            while (n > 0 && temp1 < insertionSort[n - 1]) {
                insertionSort[n] = insertionSort[n - 1];
                n = n - 1;
            }
            insertionSort[n] = temp1;

        }
        System.out.println(Arrays.toString(insertionSort));



        // Selection Sort Algo

//        int[] selectionSort = {43, 2, 9, 1, 8, 81};
//
//
//        for (int i = 0; i < selectionSort.length; i++) {
//            int minPosition = i;
//            int value = selectionSort[minPosition];
//
//            for (int j = i; j < selectionSort.length; j++) {
//                if (selectionSort[j] < value) {
//                    minPosition = j;
//                    value = selectionSort[minPosition];
//                }
//            }
//            if (minPosition != i) {
//                selectionSort[minPosition] = selectionSort[i];
//                selectionSort[i] = value;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(selectionSort));
    }
}