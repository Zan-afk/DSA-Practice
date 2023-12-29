package com.Aniket;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {7,8,9},
                {10,5,26},
                {5,26,45}
        };
        System.out.println(maxWealth(arr));

    }

    public static int maxWealth(int[][] accounts){
        //person = row & account = col
        int ans =Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {

                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

//    public static int maxWealth(int[][] accounts){
//        //person = row & account = col
//        int ans =Integer.MIN_VALUE;
//        for (int[] person :accounts) {
//            int sum = 0;
//            for (int account : person) {
//
//                sum += account;
//            }
//            if(sum > ans){
//                ans = sum;
//            }
//        }
//        return ans;
//    }


}
