package StackusingLL;

public class Main {
    public static void main(String[] args) {

        Stack newStack = new Stack();
        newStack.push(5);
        newStack.push(15);
        newStack.push(25);
        newStack.push(35);

        boolean res = newStack.isEmpty();
        System.out.println(res);

        int res1 = newStack.peek();
        System.out.println(res1);

        int res2 = newStack.pop();
        System.out.println(res2);

        newStack.deleteStack();
    }
}
