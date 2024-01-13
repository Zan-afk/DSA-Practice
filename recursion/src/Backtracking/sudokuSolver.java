package Backtracking;

public class sudokuSolver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        System.out.println(solve(board));

        if (solve(board)) {

            display(board);
        }
       else {
            System.out.println("Cannot solve");
        }
    }


    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyPlacesLeft = true;

        //this is how we are replacing r,c from arguments

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyPlacesLeft = false;
                    break; //found one of possible empty space
                }
            }
            //if you found empty element in row then break dont need to check in  col wise
            if (emptyPlacesLeft == false){
                break;
            }
        }

        //base condn
        if (emptyPlacesLeft == true){
            return true;
            //sudoku is solve
        }

        //backtrack now
        for (int number = 1; number <= 9; number++) {

            if (isSafe(board, row, col, number)){
                board[row][col] = number;
                if (solve(board)){
                    //found the ans
//                    display(board);
//                    System.out.println("------------------------------");
                    return true;
                }
                else {
                    //backtrack and change no via outer for loop
                    board[row][col] = 0;
                }
            }
        }

        //if nothing happens sudoku cant solve
        return false;
    }

    private static void display(int[][] board) {

        for (int[] row:board) {
            for (int num:row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe( int[][] board, int row, int col, int num){

        //check the row

        for (int i = 0; i < board.length; i++) {
            //check the no is int the row
            if (board[row][i]==num){
                return false;
            }
        }

        //check the col

        for (int[] nums: board) {

            //check no is int the col
            if (nums[col] == num){
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length)); //this is for the little boxes 3-3-3 or 4-4-4
        int rowStart = row-row%sqrt; //from that particular box it will try to check
        int colStart = col-col%sqrt;

        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
