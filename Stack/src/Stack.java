public class Stack {
    int arr [];
    int topOfStack;

    public Stack (int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with size of: "+ size);
    }

    //isEmpty method

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        else {
            return false;
        }
    }

    //isFull method

    public boolean isFull(){
        if (topOfStack == arr.length-1){
            System.out.println("stack is full");
            return true;
        }
        else {
            return false;
        }
    }

    //push method

    public void push(int value){

        if (isFull()){
            System.out.println("stack is full!!");
        }
        else {
            arr[topOfStack +1] = value;
            topOfStack++;
            System.out.println("the value is successfully inserted");
        }
    }


    //pop method

    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            int topstack = arr[topOfStack];
            topOfStack--;
            return topstack;
        }
    }

    //peek method


    public int peek(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }

    //delete method

    public void deleteStack(){
        arr = null;
        System.out.println("stack is successfully deleted");
    }


}
