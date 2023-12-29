package Backtracking;

public class NQueens {

    public static void main(String[] args) {

        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0,0));

    }

    static int queens(boolean[][] board, int row, int queen){



        if (row == board.length) {  //  this means all queens has been placed ||board.length cause after it will come out the last row of board

            display(board);
            System.out.println();
            return 1;

        }

        int count = 0;

        // placing the queen and checking for every row and col

        for (int col = 0; col < board.length; col++) { //when this loop over we get all possible combinations of placing queens and recursion ends

            // place the queen if it is safe

            if (isSafe(board, row, col)){
                board[row][col] =true;

                    count += queens(board, row + 1, queen+1);

                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical row

        for (int i = 0; i < row; i++) {

            if (board[i][col]){
                return false;
            }
        }

        // diagonal left

        int maxLeft = Math.min(row, col); //this is for taking diagonals we take min of cause each conditions varies ||consider4*4 matrix and queen places are (3,0),(3,2),(2,3)
        for (int i = 0; i <= maxLeft ; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);//we have to take min value of row or board.length - col - 1
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }


    private static void display(boolean[][] board) {

        for (boolean[] row :board) {
            for (boolean element:row) {

                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
