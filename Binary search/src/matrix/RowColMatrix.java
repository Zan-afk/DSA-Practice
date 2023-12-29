package matrix;

import java.util.Arrays;

public class RowColMatrix {

    //in this particular matrix i.e row wise and col wise sorted we have upper bound and lower bound ub=first rows last col of matrix and lb= first rows first col element
//by doing this we can compare target with ub and try to reduce col and as well as row
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length && c >= 0){

            if (target == matrix[r][c]){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
