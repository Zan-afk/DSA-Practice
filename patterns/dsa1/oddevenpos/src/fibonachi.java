public class fibonachi {


    public static void main(String[] args) {

        int[] n = {0,1,3,5,8,512,451,225,332,145,254,235,15,33,5144,654,355,115,0115,221,22,0211,211};

        int a = 0;
        int b = 1;
        int c= 0;
        for (int i = 0; i <= n.length; i++) {

            System.out.println(n[c]);

             c = a+b;

            a = b;
            b = c;
        }


    }




}
