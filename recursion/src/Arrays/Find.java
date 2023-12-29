package Arrays;

import java.util.ArrayList;

public class Find {

    public static void main(String[] args) {

        int[] arr ={1,2,3,2,4,2,3};

//        System.out.println(findAllIndex(arr,3,0));
//        System.out.println(list);

        System.out.println(findAllIndex2(arr,2,0));
//        ArrayList<Integer> ans = findAllIndex(arr,3,0,new ArrayList<>());
//        System.out.println(ans);



    }

//    static boolean find(int[] arr, int target, int index){
//
//        if (index == arr.length){
//            return false;
//        }
//
//        return arr[index] == target || find(arr,target,index+1);
//    }
//
//    static int findIndex(int[] arr, int target, int index){
//
//        if (index == arr.length){
//            return -1;
//        }
//
//        if (arr[index]==target){
//
//            return index;
//        }
//        else {
//            return findIndex(arr,target,index+1);
//        }
//    }
//
//    static ArrayList<Integer> list = new ArrayList<>();
//    static int findAllIndex(int[] arr, int target, int index){
//
//        if (index == arr.length){
//            return -1;
//        }
//
//        if (arr[index]==target){
//            list.add(index);
//        }
//
//        return  findAllIndex(arr,target,index+1);
//    }
//
//
//    //return an arraylist
//
//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
//
//        if (index == arr.length){
//            return list;
//        }
//
//        if (arr[index] == target){
//            list.add(index);
//        }
//
//        return findAllIndex(arr,target,index+1,list);
//    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index ){

        ArrayList<Integer>list=new ArrayList<>();

        if (index == arr.length){
            return list;
        }
//this will contain ans for that specific func call only
        if (arr[index] == target){

            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);//this arraylist is getting created for storing the ans from below calls and add it to return list when emptying the stack

        list.addAll(ansFromBelowCalls); //here we will add elements return from ansfrombelowcalls list to the 78no list so that we can return it
        return list;
    }
}
