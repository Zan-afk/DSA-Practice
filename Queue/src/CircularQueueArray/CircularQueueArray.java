package CircularQueueArray;

public class CircularQueueArray {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueueArray(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("Circular queue is created with size of: "+ size);
    }


    //isEmpty

    public boolean isEmpty(){
        if (topOfQueue == -1){
            return true;
        }
        else {
            return false;
        }
    }

    //isFull

    public boolean isFull(){

        if (topOfQueue+1 == beginningOfQueue){
            return true;

        } else if (beginningOfQueue == 0 && topOfQueue+1 == size) {
            return true;
        }
        else {
            return false;
        }
    }

    //Enqueue

    public void enqueue(int value){
        if (isFull()){
            System.out.println("the queue is full");
        } else if (isEmpty()) {
            beginningOfQueue =0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("successfully inserted "+value+"in the queue");
        }
        else {
            if (topOfQueue+1 == size){
                topOfQueue = 0;
            }
            else {
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("successfully inserted "+value+"in the queue");
        }
    }
    
    //dequeue
    
    public int dequeue(){
        if (isEmpty()){
            System.out.println("CQ is empty");
            return -1;
        } else {
            int res = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;//here we are setting value of particular index of array after dequeue that index element
            if (beginningOfQueue == topOfQueue){ //review this line in tutorial
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue+1 == size) {
                beginningOfQueue = 0;
            }
            else {
                beginningOfQueue++;
            }
            return res;
        }

    }

    //peek method

    public int peek(){
        if (isEmpty()){
            System.out.println("CQ is empty" );
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }

    //delete queue

    public void deletequeue(){
        arr =null;
        System.out.println("queue is deleted");
    }








}
