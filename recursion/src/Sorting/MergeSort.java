package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {8,5,3,7,1,2};
//        arr=mergeSort(arr);
//        System.out.println(Arrays.toString(arr));

        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }



    static int[] mergeSort(int[] arr){


        if (arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        //original − This is the array from which a range is to to be copied.
        //from − This is the initial index of the range to be copied, inclusive. //we can consider from is the index no of array
        //to − This is the final index of the range to be copied, exclusive.  // to is consider as how many elements we actually want i.e subtract from-to
        //ex :- left=arr(0,mid) the first is inclusive(0) and second is exclusive i.e anything there it will go till less than that -1 means (mid -1) ex2:- arr(0,12) it will go till 11 index

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j< second.length){

            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]= second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements

        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;

    }





    static void mergeSortInPlace(int[] arr, int s, int e){

        if (e-s == 1){     //e-s we are taking because thing array splitteed// in small parts then we have to ignore first elements till new arrays start in the same array

            return;
        }

        int mid = (s+e)/2; //(s+e)-s/2

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        
        mergeInPlace(arr, s, mid, e);
        
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {

        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j <e){ // cause s will go till only mid and mid go till only end in only single array (we have to create 2 parts and update it)
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l =0; l<mix.length; l++){

            //[s+l] is for we need to put another elements of array from(s) part i.e original array's element's index[s+0],[s+1],[s+2],[s+3],

            arr[s+l] = mix[l];

        }




    }

}


