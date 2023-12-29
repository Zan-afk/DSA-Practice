package functiondef;

public class main {

    public static void main(String[] args) {
        addname1();
    }


    static void addname(){

        int x = 10;
        int y = 20;
        int z = x+y;

        System.out.println(z);

    }

    static void addname(int a,int b) {


        int z = a+b;

        System.out.println(z);

    }

    static int addname1(int c,int d) {


        int z = c+d;

        return z;

    }

    static int addname1() {

        int x = 80;
        int y = 20;
        int z = x+y;


        return z;

    }



}
