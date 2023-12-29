public class QueueArray {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){

        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue is created with size of: "+ size);
    }

    //isFull method

    public boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    //isEmpty method

    public boolean isEmpty(){
        if (beginningOfQueue == -1 ||(beginningOfQueue == arr.length)){
            return true;
        }
        else {
            return false;
        }
    }

    //enQueue

    public void enQueue(int value){

        if (isFull()){
            System.out.println("queue is full!!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("successfully inserted value "+value+" in the queue");
        }
        else {
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("successfully inserted value "+value+" in the queue");
        }
    }

    //deQueue

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;

        }
        else {
            int res = arr[beginningOfQueue];
            beginningOfQueue++;//if there is 4 elements in arr then the at this point topofqueue is 3 and beginningOfQueue also be 3 but we are incresing beginningOfQueue by 1(i.e. 4) after dequeing it from queue
            if (beginningOfQueue > topOfQueue){ //in the last element of queue beginningOfQueue is greter than top of queue
                beginningOfQueue = topOfQueue = -1;
            }
            return res;
        }
    }

    //peek method

    public int peek(){

        if (!isEmpty()){
            return arr[beginningOfQueue];
        }
        else {

            System.out.println("Stack is empty");
            return -1;
        }

    }

    //delete method

    public void deleteQueue(){
        arr = null;
        System.out.println("queue is deleted");
    }



















}
