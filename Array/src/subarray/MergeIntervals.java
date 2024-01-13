package subarray;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {{1,3}, {2,6},{8,10},{15,18}};

        System.out.println(Arrays.toString(merge(intervals)));

    }

    public static int[][] merge(int[][] intervals) {

        //base case
        int n = intervals.length;
        if(n==1){
            return intervals;
        }

        //sort intervals by start time
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);

        //define stack
        Stack<int[]> stack = new Stack<>();

        //add first interval into stack
        stack.add(intervals[0]);

        //merge intervals
        for(int i =1; i<n; i++){
            int[]first = stack.peek();
            int[]sec = intervals[i];

            //check they are overlapping or not
            if(first[1] < sec[0]){
                stack.add(sec);
            }
            else{
                first[1]= Math.max(first[1], sec[1]);
            }
        }

        //return list
        return stack.toArray(new int[stack.size()] [2]);

    }
}
