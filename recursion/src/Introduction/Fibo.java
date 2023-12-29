package Introduction;

public class Fibo {

    public static void main(String[] args) {

        System.out.println(fibo(10));

        int[] arr = {1,2,33,44,55,68,78,80};

        int target = 68;

        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }


    static int fibo(int n){

        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2)  ;//this is not a tail recursion
        //linear recurrence relation and divide conquer recurrence relation
    }

    static int binarySearch(int[] arr, int target, int s, int e){

        if (s>e){
            return -1;
        }

        int m = s+(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (target<arr[m]){
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }

}
