package Methoden;

public class DivideConquerMaximum {

    public static void main(String[] args) {
        int[] arr = {0,3,2,45,1,8,8,4};
        int leftHalf = 0;
        int rightHalf = arr.length-1;
        int maximum = divideAndConquerMaxArray(arr,leftHalf, rightHalf);
        System.out.println("Maximum: " + maximum);

    }

    public static int divideAndConquerMaxArray(int[] arr, int leftHalf, int rightHalf){

        if(leftHalf == rightHalf){
            return arr[leftHalf];
        }

        int midIndex = (leftHalf + rightHalf)/2;
        int findMaxLeft = 0;
        int findMaxRight = 0;
        findMaxLeft = divideAndConquerMaxArray(arr, leftHalf, midIndex);
        findMaxRight = divideAndConquerMaxArray(arr, midIndex + 1, rightHalf);

        if (findMaxLeft < findMaxRight){
            return findMaxRight;
        }
        else{
            return findMaxLeft;
        }
    }

}
