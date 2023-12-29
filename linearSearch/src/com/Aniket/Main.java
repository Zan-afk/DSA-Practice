package com.Aniket;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,23,45,50,75,46,252,14,355,86};
        System.out.println( linearSearchTrueFalse(arr,355));
    }

//    public static int linearSearch(int[] arr , int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int value = arr[i];
//            if (value==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static int linearSearchElement(int[] arr , int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int element:arr) {
//            if (element == target){
//                return element;
//            }
//        }
//        return -1;
//    }

    public static boolean linearSearchTrueFalse(int[] arr , int target){
        if(arr.length == 0){
            return false;
        }
        for (int element:arr) {
            if (element == target){
                return true;
            }
        }
        return false;
    }



}
