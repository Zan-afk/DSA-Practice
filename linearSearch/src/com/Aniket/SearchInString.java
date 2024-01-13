package com.Aniket;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Aniket zanje";
        System.out.println(isChar2(str, 'g'));
        System.out.println((str.toCharArray()));
        System.out.println(noOfVowels(str));
    }


    public static boolean isChar2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char chr : str.toCharArray()) {
            if (chr == target) {
                return true;
            }
        }
        return false;
    }

    public static int noOfVowels(String str) {

        String newstr = str.toLowerCase();
        if (str.length() == 0) {
            return -1;
        }

        int count = 0;
//            for (char alphabet:newstr.toCharArray()
//                 ) {
//                if ( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
//                    count++;
//                }
//
//            }
        char arr[] = newstr.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    count++;
                }
            }
        return count;
        }


//    public static boolean isChar(String str, char target){
//        if (str.length() == 0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
    }

