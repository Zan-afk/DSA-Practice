import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){

        boolean isSwapped;
        //run the steps n-1 times

        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            // for each step, max item will come at the last respective index

            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped= true;

                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!isSwapped){
                break;  // !false = true or isswapped == false
            }
        }
    }


    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            // find the max item in the remaining array and swap with correct index
            //we have to sort this array till final elements i.e arr.lenghth in the array because after each pass max value getting sorted at last of index and we checked till last index -1. but what if last index-1 is smallest no in array so we have to swap this elemennt with arr[0]; thats why we are running this loop till arr.lenghth-1.
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }

    static int getMax(int[] arr,int start,int end){
        int max = start;

        for (int i = start; i <= end ; i++) {

            if (arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static void insertionSort(int[] arr){       // in insertion sort array are getting sorted in parts first it will sort 0-1 index then 0-2,0-3,0-4 and so on. elements present in pass are getting inserted at correct position of its lhs.it is stable algo and no of swaps reduce as compared to bubble sort

        for (int i = 0; i < arr.length-1; i++) { //it same as i <= arr.length -2

            for (int j = i+1; j >0 ; j--) {

                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

//when no gives you from range 1toN or 0to n use cyclic sort
    static void cyclicSort(int[] arr){

        int i = 0;
        while (i < arr.length){

            int correctIndex = arr[i]-1;  //this is checking correct index for element suppose 3 the correct index of 3 is 2 suppose arr[0]=3 then correctindex =2 (if array from o till n then remove arr[i]-1 and write arr[i]

            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }
























}
