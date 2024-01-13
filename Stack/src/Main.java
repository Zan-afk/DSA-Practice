public class Main {
    public static void main(String[] args) {

        Stack newstack = new Stack(5);

        newstack.push(5);
        newstack.push(15);
        newstack.push(20);
        newstack.push(25);
        newstack.push(250);
        newstack.push(256);



        int res = newstack.pop();
        System.out.println(res);

        int res1 = newstack.pop();
        System.out.println(res1);

        int res2 = newstack.peek();
        System.out.println(res2);

        newstack.deleteStack();
    }
}