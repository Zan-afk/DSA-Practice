package CircularSinglyll.Doublylinkedlist;

public class Doublylinkedlist {

    public Doublynode head;
    public Doublynode tail;

    public int size;

    public Doublynode CreateDDL( int nodevalue){

        head = new Doublynode();
        Doublynode newnode = new Doublynode();
        newnode.value =nodevalue;
        newnode.next =null;
        newnode.prev = null;
        head = newnode;
        tail = newnode;
        size =1;
        return head;
    }

    //insertion method in DLL

    public void insertDLL(int nodevalue , int location){

        Doublynode newnode = new Doublynode();
        newnode.value = nodevalue;

        if (head == null){
            CreateDDL(nodevalue);
            return;
        } else if (location == 0) {

            newnode.next = head;
            newnode.prev =null;//cause it is not a circular DLL
            head.prev = newnode;
            head =newnode;
        } else if (location >= size) {

            newnode.next = null;
            tail.next = newnode;
            newnode.prev =tail;//here we are creating link between new node and last node of LL
            tail =newnode;
        }
        else {
            Doublynode tempnode = head;
            int index = 0;
            while (index < location-1) {
                tempnode =tempnode.next;
                index++;
            }

            newnode.next =tempnode.next;
            newnode.prev = tempnode;
            tempnode.next =newnode;
            newnode.next.prev = newnode; //here we are accessing a node which comes after inserting our node

        }
        size++;

    }

    //traverse In DLL

    public void traverseDLL(){

        if (head != null){
            Doublynode tempnode = head;
            for (int i = 0; i < size; i++) {

                System.out.print(tempnode.value);
                if (i != size-1){
                    System.out.print("-->");
                }
                tempnode = tempnode.next;
            }
        }
        else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

    //reverse traverse in DLL

    public void reverseTraverseDLL(){


        if (head != null){
            Doublynode tempnode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size-1){
                    System.out.print("<--");
                }
                tempnode =tempnode.prev;
            }

        }
        else {
            System.out.println("DLL does not exist");
        }

        System.out.println("\n");

    }

    // search node in DLL

    public boolean searchNodeDLL(int nodevalue){

        if (head != null){

            Doublynode tempnode = head;
            for (int i = 0; i < size; i++) {
                if (tempnode.value == nodevalue){
                    System.out.println("node found at location"+ i);
                  return true;
                }
                tempnode = tempnode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    //delete node In DLL

    public void deleteNodeDLL(int location){

        if (head == null){
            System.out.println("DLL does not exist");
            return;
        } else if (location == 0) {

            if (size == 1){
                head=null;
                tail=null;
                size--;
                return;
            }
            else {
                head = head.next;
                head.prev = null;//its not circular list
                size--;
            }
        } else if (location >= size) {

            if (size == 1){
                head=null;
                tail=null;
                size--;
                return;
            }
            else {
                Doublynode tempNode = tail.prev;
                tempNode.next = null;
                tail = tempNode;
                size--;
            }

        }
        else {

            Doublynode tempNode = head;
            for (int i = 0; i < location-1; i++) {

                tempNode=tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    //Delete entire DLL

    public void DeleteEntireDLL(){

        Doublynode tempNode = head;
        for (int i = 0; i < size; i++) {

            tempNode.prev =null;
            tempNode = tempNode.next;
        }

        head=null;
        tail=null;

        System.out.println("DLL has been deleted");
    }



}
