//// https://leetcode.com/problems/search-in-rotated-sorted-array/

//reapeat this quetion when you get time
//rotated bs
//pivot is largest no in array
//pivot = from where your asc array starts
//pivot going to find where mid > mid+1

public class RBS {

    public static void main(String[] args) {

        int[] arr ={1,2,8,9,15,30};
        System.out.println(search(arr,9));
    }



    // this will not work in duplicate values

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            //4 cases to find pivot

            if (mid < end && arr[mid] > arr[mid + 1]) {  //this is test case arr[mid]>arr[mid+1] and this is edge case mid<end cause what if arr[mid] is last element of array then arr[mid]>arr[mid+1] give array outof bound so mid should be less than end hence mid < end	

                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }


    static int search(int[] nums, int target){


        int pivot = findPivot(nums);
        // if you did not find a pivot, it means the array is not rotated so do normal BS

        if (pivot==-1){
            // just do normal binary search

            return binarySearch(nums,target,0,nums.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays and we have to find target which can be lies in either pivot rhs or lhs or pivot

        if (nums[pivot]==target){
            return pivot;
        }

        if (target>=nums[0]){ //if this is case then we dont need to check the array after the pivot becase it is smaller 
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1); //this case work where {if (target>=nums[0]){ //if this is case then we dont need to check the array after the pivot becase it is smaller} is reverse
        

    }

    static int binarySearch(int[] arr, int target,int start,int end){
//        int start = 0;
//        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


//this pivot works in duplicate values

    static int findPivotInDuplicates(int[] arr){
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates

            if (arr[mid]== arr[start] && arr[mid]== arr[end]){

                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot

                if (arr[start]>arr[start+1]){ //start<end && arr[start]>arr[start+1] didn't understand this edge case
                    return start;
                }
                start++;

                // check whether end is pivot

                if (arr[end]<arr[end-1]){  //end>start && arr[end]<arr[end-1] didn't understand this edge case
                    return end-1;
                }

                end--;
            }

            // left side is sorted, so pivot should be in right

            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]) {
                start =mid+1;
            }
            else {
                end = mid-1;
            }
        }
            return -1;

    }



}
