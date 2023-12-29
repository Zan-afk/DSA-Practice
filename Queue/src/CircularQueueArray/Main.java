package CircularQueueArray;

public class Main {
    public static void main(String[] args) {
        CircularQueueArray newCQ = new CircularQueueArray(5);

        newCQ.enqueue(10);
        newCQ.enqueue(20);
        newCQ.enqueue(30);
        newCQ.enqueue(40);
        newCQ.enqueue(50);

        int res=newCQ.peek();
        System.out.println(res);

        int res1=newCQ.peek();
        System.out.println(res1);
        newCQ.enqueue(60);
        newCQ.deletequeue();

    }
}
