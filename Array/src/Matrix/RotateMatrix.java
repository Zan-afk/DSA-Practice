package Matrix;

import java.util.ArrayList;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {

        int[][]ans = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                ans[j][(matrix.length-1)-i] = matrix[i][j]  ;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= ans[i][j];
            }
        }
    }

    public static void rotate2(int[][] matrix){

        //first we need to transpose matrix row become col col become row

        for (int i = 0; i < matrix.length-1; i++ ) {
            for (int j = i+1; j < matrix.length; j++) {

                int k = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }

        //after transpose we need to reverse each row
        for (int i = 0; i < matrix.length; i++) {

            int start=0;
            int end=matrix.length-1;
            while (start < end){
                int k = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = k;
                start++;
                end--;
            }

        }

    }



    public ArrayList<String>  rec(String p,String up){
        if (up == null){
            ArrayList <String> list = new ArrayList<>();
             list.add(p);
             return list;
        }

        ArrayList ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i < p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(rec(f+ch+s,up.substring(1)));
        }
        return ans;
    }




























}
