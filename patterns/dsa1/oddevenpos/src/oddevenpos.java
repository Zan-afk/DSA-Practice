import java.util.Arrays;

public class oddevenpos {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < n.length; i++) {

            if (i % 2 == 0 && n[i] % 2 == 1) {


                System.out.println(n[i]);
            }
        }
    }
}

