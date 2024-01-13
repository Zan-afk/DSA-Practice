package com.Aniket;

public class EvenDigitCountInNo {
    public static void main(String[] args) {

        int[] nums = {12,854,5544,52,546,311,24,36,33,1,45,152,55};
        int num= 12345;
        System.out.println(findnumber(nums));
    }

    public static int findnumber(int[] nums){
        int count = 0;
        for (int no:nums) {
            if (even(no)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int nums){
        int noOfDigits = digit(nums);
       /* if (noOfDigits % 2 == 0){
            return true;
            }
        return false;*/
        return noOfDigits %2 == 0;
    }
    static int digit(int num){
        if (num < 0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
