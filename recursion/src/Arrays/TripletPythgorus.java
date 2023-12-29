package Arrays;

public class TripletPythgorus {

    public static void main(String[] args) {

        pyt(33,56,65);
    }

    static void pyt(int a, int b, int c){

        if (a > b && a > c){
            helper(b,c,a);
        }
        else if (b > a && b > c) {
            helper(a,c,b);
        }
        else {
            helper(a,b,c);
        }

    }

    static void helper(int min,int min2, int max){

        if ((Math.pow(min , 2)+Math.pow(min2 ,2))== Math.pow(max,2) ){
            System.out.println("its triplet");
        }else {
            System.out.println("not");
        }
    }
}
