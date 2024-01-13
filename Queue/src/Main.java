public class Main {
    public static void main(String[] args) {


        QueueArray newQueue = new QueueArray(5);

        newQueue.enQueue(5);
        newQueue.enQueue(15);
        newQueue.enQueue(25);
        newQueue.enQueue(35);
        newQueue.enQueue(45);

        int result = newQueue.peek();
        System.out.println(result);

        int result1 = newQueue.peek();
        System.out.println(result1);

        newQueue.deleteQueue();

    }
}