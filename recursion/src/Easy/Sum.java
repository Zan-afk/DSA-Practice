package Easy;

public class Sum {
    public static void main(String[] args) {
        int ans = prod(505);
        System.out.println(ans);
    }


    static int sum (int n){

        if(n == 0){
            return 0;
        }

        return (n%10)+ sum(n/10);
    }

    static int prod(int n){

        if (n%10 == n){
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
