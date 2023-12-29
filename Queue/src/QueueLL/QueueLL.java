package QueueLL;

public class QueueLL {
    SinglyLinkedList list;

    public QueueLL(){
        list = new SinglyLinkedList();
        System.out.println("queue is created");
    }

    //isEmpty method

    public boolean isEmpty(){
        if(list.head == null){
            return true;

        }
        else {
            return false;
        }
    }

    //enQueue

    public void enQueue(int value){
        list.insertLinkedList(value, list.size);
        System.out.println("inserted value "+ value + " in the queue");
    }


    //deQueue

    public int deQueue(){
        int value = -1;
        if (isEmpty()){
            System.out.println("the Queue is empty");
        }
        else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }


    //peek method

    public int peek(){
        if (isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            return list.head.value;
        }
    }

    //delete method

    public void delete(){
        list.head = null;
        list.tail = null;
        System.out.println("the queue is deleted");
    }





}
