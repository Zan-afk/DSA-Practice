public class odd_even_position {

    public static void main(String[] args) {
        int n[];
        n= new int[]{1, 2, 3};

        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0 && n[i] % 2 == 1)
                System.out.println(n[i]);
        }
    }
}
