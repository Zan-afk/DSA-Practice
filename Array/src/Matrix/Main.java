package Matrix;

import static Matrix.SetZeroes.setZeroes;
import static Matrix.SetZeroes.setZeroes1;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {3,1,2,0,5},
                {3,4,0,2,8},
                {1,3,1,5,9}
        };

//        rotate(arr);
//        rotate2(arr);
//        setZeroes(arr);
//        setZeroes1(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }



}
