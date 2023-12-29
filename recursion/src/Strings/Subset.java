package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};

        List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans1 = subsetDuplicate(arr);

        for (List<Integer> list: ans) {

            System.out.print(list);
        }

    }

    static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); //this is because initially outer list will be empty so

        for (int num:arr) { // this loop takes every no of elements in that arr

            int size = outer.size(); //this will have size of outer list which will increase after every iteration

            for (int i = 0; i < size ; i++) { //this for loop iterate over all lists present in the outerlist 

                List<Integer> internal =new ArrayList<>(outer.get(i)); //this list is creating every time with each subset of that no //this outer.get(i) will give the list same as it is present in the outer list of (i)th no and assign it to the internal list by creating it. to making copy of same outer lists for loop iterates all outer list one by one using i var.
                    //arraylist<>(outer.get(i)) will create copy of that no's lists
                internal.add(num);//this will add no(num) in above generated copy of lists.
                outer.add(internal); //for ans now we have to add internal lists to outer list //indivisual list added by this line one by one

            }


        }

        return  outer;
    }

    //when you find duplicate element only add it in the newly created subset of previous step or level but in this duplicates have to be adjucent i.e [1,2,2] not [2,1,2,3,2]/ together linear so first sort the array

    static List<List<Integer>> subsetDuplicate(int[] arr){

        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            start = 0;
            // if current and previous element is same, s = e + 1
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;

            }

            end = outer.size()-1;
            int n = outer.size();
            for (int j = 0; j < n; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }

        }
        return outer;
    }














}
