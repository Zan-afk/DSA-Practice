package com.Aniket;

public class Findmin {
    public static void main(String[] args) {
        int[] arr = {49,4,346,1225,-7,535,1544};
        System.out.println(findmin(arr));
    }

    public static int findmin(int[] arr){
        int maxans = arr[0];
        int minans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minans){
                minans = arr[i];
            }
            if (arr[i] > maxans){
                maxans = arr[i];
            }

        }
        return minans;
    }

}


