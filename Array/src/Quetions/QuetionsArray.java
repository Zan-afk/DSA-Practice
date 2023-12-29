package Quetions;

import java.util.ArrayList;
import java.util.Arrays;

public class QuetionsArray {

    public static void main(String[] args) {
        int arr[] = {8, -1, 6, 1, 9, 3, 2, -1, 4, -1};


        reorganiseArray(arr,10);
        System.out.println(Arrays.toString(arr));


    }
    public static int max(int[]Arr){
        int maxval= Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] > maxval){
                maxval= Arr[i];
            }
        }
        return maxval;
    }
    static void reverse (int[] arry){
        int start = 0;
        int end = arry.length - 1;
        while (start < end){
            swap(arry,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] Arr,int index1, int index2){
        int temp = Arr[index1];
        Arr[index1] = Arr[index2];
        Arr[index2] = temp;
    }

    static void leaders(int[] arr){


        for (int i = 0; i < arr.length; i++) {

            int j = 0;
            for ( j = i+1; j < arr.length ; j++) {
                if (arr[i] < arr[j]){
                    break;
                }
            }
            if (j == arr.length-1){

                System.out.print(arr[i]);
            }
        }

    }

    static void leaders2(int[] arr){


        int max = arr[arr.length-1];
        System.out.println(max);
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }

    }
    static int appearOnceInArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count == 1){
                return arr[i];
            }
        }
        return -1;
    }

    static int secondLargeElement(int[] arr){


        int high = arr[0];
        int low = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > high){
                high = arr[i];
            }
            if (arr[i] < low){
                low = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]> low && arr[i] < high){
                low = arr[i];
            }
        }

        return low;
    }

    static int secondLargeElement2(int[] arr){


        int first = 0;
        int sec = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first){
                sec = first;
                first = arr[i];
            }
//            if (arr[i] > sec && arr[i] < first){
//                sec = arr[i];
//            }
            if (arr[i] > sec && arr[i] != first){
                sec = arr[i];
            }
        }

        return sec;
    }


    static int[] MaxMinArrangeArr(int[] arr){
        int ptr1 = 0;
        int ptr2 = 0;

        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr.length-ptr1; j++) {

                int temp = arr[ptr2];
                arr[ptr2] = arr[arr.length-1];
                arr[arr.length-1]= temp;
                ptr2++;
            }


            ptr1 += 2;
            ptr2 = ptr1;

        }
        if (ptr1 == arr.length-1){
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[arr.length-2];
            arr[arr.length-2] = temp;
        }

        return arr;

    }

    static void rearrange(int[] arr, int n)
    {
        // Auxiliary array to hold modified array
        int temp[] = arr.clone();

        // Indexes of smallest and largest elements
        // from remaining array.
        int small = 0, large = n - 1;

        // To indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
    }

    static void distinctNum(int[] arr){
        int ptr1=0;
        int ptr2 =1;
        int count =0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] != 0){
                System.out.println("no: "+arr[i]);}


            for (int j = ptr2; j < arr.length ; j++) {

                if (arr[j] == arr[i]){
                    arr[j]=0;
                }
                ptr2++;

            }

            ptr1++;
            ptr2 = ptr1+1;
        }
    }

    static void distinctNum2(int[] arr){
//        int ptr1=0;
//        int ptr2 =1;
//        int count =0;
        for (int i = 0; i < arr.length ; i++) {


            int j;
            for ( j = 0; j < i ; j++) {

                if (arr[j] == arr[i]){
                    break;
                }

            }
            if (i == j){
                System.out.println(arr[i]);
            }


        }
    }

    static ArrayList<Integer> makeDistinctDigits(int[] arr){

        ArrayList<Integer>arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int no = arr[i];

            while (no>0){

                int rem = no%10;


                if (!arrayList.contains(rem)){
                    arrayList.add(rem);

                }

                arrayList.add(rem);
                no =no/10;
            }
        }
        return arrayList;
    }

    static void segregateEvenAndOdd(int[] arr){

        int ptr = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[ptr];
                arr[ptr] = temp;
                ptr++;
            }

        }
    }

    static void rotateArray(int[] arr, int no){

        while (no > 0){

            for (int i = 0; i < arr.length-1; i++) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            no--;
        }
    }

    static void pairOfSum(int[]arr, int sum){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) { //i+1 is cause we dont want to check same elements

                if (arr[i]+arr[j]>sum){
                    break;
                }
                if (i == j){
                    continue;
                }
                if (arr[i]+arr[j]==sum){
                    System.out.println("the pair is {"+i+","+j+"}");
                    return;
                }
            }
        }
    }

    public static int isPairSum(int A[], int N, int X)
    {
        // represents first pointer
        int i = 0;

        // represents second pointer
        int j = N - 1;

        while (i < j) {

            // If we find a pair
            if (A[i] + A[j] == X)
                return 1;

                // If sum of elements at current
                // pointers is less, we move towards
                // higher values by doing i++
            else if (A[i] + A[j] < X)
                i++;

                // If sum of elements at current
                // pointers is more, we move towards
                // lower values by doing j--
            else
                j--;
        }
        return 0;
    }

    static void reorganiseArray(int[] arr, int no){

        for (int i = 0; i < no-1; i++) {

            if (arr[i] == i){
                continue;
            }
            for (int j = 0; j < no-1 ; j++) {
                if (arr[j] == i){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }

        }

        for (int i = 0; i < no-1; i++) {
            if (arr[i]!= i){
                arr[i]=-1;
            }
        }
    }

}

