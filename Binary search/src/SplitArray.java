
// https://leetcode.com/problems/split-array-largest-sum/

//subarray means continuous elements in the array i.e array of index like 0,1,2,3 not 0,5,4,2
//min sum we can get is largest single num in that array i.e 10
//max sum we can get is add all elements of array i.e 32
//so range can be [10,32] hence we can apply bs =10+32/2=21  21can be the largest sum in individual split array
//check1 :-if pieces we made is <= m then we can reduce 21 as end so we can increase pieces
//means if we are getting pieces less than or equal to m which they allow us and we have to increase the pices but cant increase cause of sum of sub array that is 21 so we need to reduce individual arrays sum to increase or split array into more pieces 
//then new s=10 e=21 mid =15
//check 2:- if we do above condn then pieces =3 then again shif to first check by doing this we can reduce search space
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};

    }

    public int splitArray(int[] nums, int m){
        //m is the no of pieces you can divide the array

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  // in the end of the loop this will contain the max item of the array
            end += nums[i];
        }

        // apply binary search

        while (start<end){

            int mid = start+(end-start)/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum =0;
            int pieces = 1;

            for (int num:nums) {

                if (sum +num > mid){

                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num; //here we are adding new subarray cause cond says first subarry is full
                    pieces++; //here we are increasing no of subarray
                }
                else {
                    sum += num;
                }
            }

            if (pieces > m){
                start = mid+1;
            }
            else {
                end = mid; //here we are reducing largest indivisual sum to mid by eliminating all rhs
            }
        }
        return end; //here we can return anything cause start == end ;
    }
}
