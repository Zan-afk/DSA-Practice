public class pattern1 {
    public static void main(String[] args) {
    pattern14(5);
    }


    static void pattern1(int n){
        for (int row = 0; row <n ; row++) {


            for (int col = 0; col < row+1 ; col++) {
                System.out.print("* ");
            }


            System.out.println("");
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
    */


    static void pattern2(int n){
        for (int row = 0; row < n; row ++){

            for (int col = 0; col < n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */


    static void pattern3(int n){

        for (int row = 1; row <= 5 ; row++) {

            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            
            System.out.println();
        }
    }

    /*
      1
      12
      123
      1234
      12345
     */

    static void pattern4(int n){

        for (int row = 0; row < 2*n; row++) {

            int colno = row >n ? 2*n - row : row;
            for (int col = 0; col < colno ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
    */


        static void pattern6(int n){

        for (int row = 0; row < 5; row++) {

            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (row+1) ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *
   **
  ***
 ****
*****
     */


    static void  pattern7(int n){

        for (int row = 0; row < n; row++) {

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
*****
 ****
  ***
   **
    *
 */

    static void pattern8(int n) {


        for (int row = 0; row < n; row++) {

            for (int s = 0; s < n - row - 1  ; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2*row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }

    /*
     *
    ***
   *****
  *******
     */


    static void pattern9(int n){

        for (int row = 0; row < n; row++) {

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2 * (n - row) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *********
     *******
      *****
       ***
        *
    */


    static void pattern10(int n){

        for (int row = 0; row < 5; row++) {

            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (row+1) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
      *
     * *
    * * *
   * * * *
  * * * * *
    */


    static void pattern11(int n){

        for (int row = 0; row < n; row++) {

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
    * * * * *
     * * * *
      * * *
       * *
        *

     */

    static void pattern12(int n){

        for (int row = 0; row < 2*n-1; row++) {

            int colno = row<n ?  2 * (n - row) - 1 : row-n;

            int space = row<n ? row : 2*n-row ;

            for (int s = 0; s < space ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < colno; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=4 ; col++) {

                if (col<= 4-row || col+4 <= row){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern14(int n){

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (col <= 3-row || col+3 <= row ){
                    System.out.print(" ");
                }
                else  {
                    if (col <= (2*row)+1)
                    System.out.print("*");
                }

                System.out.print("#");
            }

        System.out.println();

        }
    }



















    }
