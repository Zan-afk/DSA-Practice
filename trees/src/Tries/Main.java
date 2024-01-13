package Tries;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Trie trie = new Trie();
//        trie.insert("ANIKET");
//        trie.insert("ANI");
//        trie.search("ANI");

       int[] arr ={2,3,5,2,4,3,4};

//       leaders(arr);
//        leaders2(arr);
        System.out.println(appearOnceInArray(arr));
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



}
