package MultidiamensionalArray;

import java.util.Arrays;

public class Multidiamensional {

    public static void main(String[] args) {

        /*
         1 2 3
         4 5 6
         7 8 9
         */
        //int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        Scanner inp = new Scanner(System.in);
//        int [][] array = new int[3][3];
//
//        for (int row = 0; row<array.length;row++){
//
//            for (int col = 0; col<array[row].length; col++){
//                array[row][col] = inp.nextInt();
//            }
//        }

//        for (int row = 0; row<array.length;row++){
//
//            for (int col = 0; col<array[row].length; col++){
//                System.out.print(array[row][col]);
//            }
//            System.out.println();
//        }

        //   for (int row = 0; row<array.length;row++){
        //     System.out.println(Arrays.toString(array[row]));
        //    }

//        for(int[] no: array){
//            System.out.println(Arrays.toString(no));
//        }

        int[][] arry = {
                {1, 2, 3},
                {8, 9},
                {10, 15, 20, 40}
        };

//        for (int row = 0; row < arry.length; row++){
//
//            for (int col = 0; col < arry[row].length; col++){
//
//                System.out.print(arry[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int[] no: arry){
//            System.out.println(Arrays.toString(no));
//        }

        for (int row = 0; row < arry.length; row++) {
            System.out.println(Arrays.toString(arry[row]));
        }
    }
}
