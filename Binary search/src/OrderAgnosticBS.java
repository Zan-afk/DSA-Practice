
//orderagnostic array means we dont know whether array is sorted by asc order or dec order.we just need to find it
public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while (start<=end){

            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (target>arr[mid]){
                    end =mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}