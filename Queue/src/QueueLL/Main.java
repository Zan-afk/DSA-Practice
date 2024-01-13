package QueueLL;

public class Main {
    public static void main(String[] args) {

        QueueLL newQll = new QueueLL();

        newQll.enQueue(5);
        newQll.enQueue(15);
        newQll.enQueue(25);
        newQll.enQueue(35);

        int res = newQll.peek();
        System.out.println(res);

        int res1 = newQll.peek();
        System.out.println(res1);
        newQll.delete();


    }
}
