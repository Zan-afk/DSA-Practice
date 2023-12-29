package patterns;

import java.util.Arrays;

public class PatternsAndSortings {

    public static void main(String[] args) {

//        triangle2(3,0);
        int[] arr ={10,5,15,4,8,2,20};
        selection(arr,7,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void triangle(int r ,int c){

        if (r==0){
            return;
        }

        if (c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else {
            System.out.println();
            triangle(r-1,0);
        }
    }

    public static void triangle2(int r , int c){
        if (r==0){

            return;
        }
        if (c<r){
            triangle2(r,c+1);
            System.out.print("*");
        }
        else {
            triangle2(r-1,0);
            System.out.println();
        }
    }


    static void bubble(int[] arr, int len, int index){

        if (len == 0){
            return;
        }

        if (index<len){

            if (arr[index]>arr[index+1]){
                //swap elements
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }

            bubble(arr,len,index+1);
        }
        else {
            bubble(arr,len-1,0);
        }
    }

    static void selection(int[]arr, int len, int index, int max){

        if (len==0){
            return;
        }

        if (index<len){
            if (arr[index]>arr[max]){
                selection(arr,len,index+1,index);
            }
            else {
                selection(arr,len,index+1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[len-1];
            arr[len-1] = temp;
            selection(arr,len-1,0,0);
        }
    }




}
