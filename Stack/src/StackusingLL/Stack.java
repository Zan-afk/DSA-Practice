package StackusingLL;

public class Stack {

    SinglyLinkedList linkedList;

    public Stack(){
        linkedList = new SinglyLinkedList();
    }

    //push method

    public void push(int value){
        linkedList.insertLinkedList(value,0);
        System.out.println("inserted "+value+" in stack");
    }

    //isEmpty method
    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }
        else {
            return false;
        }
    }

    //pop method

    public int pop(){

        int res = -1;
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        else {
            res = linkedList.head.value;

            linkedList.deletionOfNode(0);

        }
        return res;
    }

    //peek method

    public int peek(){

        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return linkedList.head.value;
        }
    }


    //delete method

    public void deleteStack(){
        linkedList.head = null;
        System.out.println("Stack is deleted");
    }

}
