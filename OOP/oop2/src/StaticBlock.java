public class StaticBlock {

    static int a= 4;
    static int b;

    static { //this block runs only once when it loaded

        System.out.println("i am in static block");
        b = a*5;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
    }


}
