package Easy;

import java.util.Scanner;

public class FactorialOfNo {

    public static void main(String[] args) {

        int ans = fact(5);
        System.out.println(ans);
    }

 //   factorial of no
    static int fact(int n){
        if (n <=1){
            return 1;
        }

        return n * fact(n-1);
    }

    //sum of no

    static int sum(int n){
        if (n <=1){
            return 1;
        }

        return n + sum(n-1);
    }



}
