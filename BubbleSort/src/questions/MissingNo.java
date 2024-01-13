package questions;
// https://leetcode.com/problems/missing-number/
public class MissingNo {

    public static void main(String[] args) {

    }

    public static int missingNo(int[]arr){

        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i];

            if(arr[i]<arr.length && arr[i]!= arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
        
        //after sorting now search for first missing no 
        for (int index = 0; index < arr.length; index++) {

            if(arr[index]!= index){
                return index;
            }
        }

        //case2 is missing no is the arr of length
        return arr.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
