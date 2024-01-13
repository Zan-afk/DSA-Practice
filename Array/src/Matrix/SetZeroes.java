package Matrix;

public class SetZeroes {

    public static void setZeroes(int[][] matrix) {

        //first find 0 then try to make every col and row of that to -1 except 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j]==0){
                    //making row -1

                    markrow(i ,matrix);

                    //making col -1
                    markcol(j ,matrix);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    static void markrow(int i , int[][] matrix){

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }

    static void markcol(int j , int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }

    public static void setZeroes1(int[][] matrix) {

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                if (matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
