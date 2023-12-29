package Easy;

public class Nto1 {

    public static void main(String[] args) {

//        funreverse(5);
        concept(5);
    }


    static void concept(int n){

        if(n==0){
            return;
        }

        //concept(n--);
        concept(--n);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }


    static void funreverse(int n){
        if(n == 0){
            return;
        }
        funreverse(n-1);
        System.out.println(n);
    }

    static void funboth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }


}
