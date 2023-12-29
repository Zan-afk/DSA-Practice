public class Questions {
    //order agnostic binary search is to find wheather array is sorted in accending oe decending order
    //celling is the smallest element in a array greater or = target
    //floor of the no is greatest no smaller or = target
    //peak index mountain array known as biotonic array

    public static void main(String[] args) {

    }

    static int celling(int[] arr ,int target){

         //but what if the target is greater than the greatest no in array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

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
        return start; // here we are returning start cause after ending loop it will return smallest no after target
    }

    static int floor(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }

    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    static char smallestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length]; //this will give array of index 0 or we can do if s==n return 0;
    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/

    static public int peakIndexInMountainInArray(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }

        return start;//oor return end as both are same after loop breaks

    }








}


