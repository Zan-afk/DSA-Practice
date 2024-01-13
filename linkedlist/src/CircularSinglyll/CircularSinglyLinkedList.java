package CircularSinglyll;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    //creation of csll
    public Node createCSLL (int nodevalue){

        head = new Node();
        Node node = new Node();
        node.value =nodevalue;
        node.next = node;
        head =node;
        tail =node;
        size =1;
        return head;

    }

    //insertion in Csll

    public void insertCssl(int nodevalue , int location){
        Node node = new Node();
        node.value = nodevalue;
        if (head == null){
            createCSLL(nodevalue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next =head; //here we are accessing last nodes next ref to head
        } else if (location >= size) {
            tail.next = node; //here tail.next is last nodes next ref and that will update to new node
            tail = node;
            tail.next =head;
        }
        else {
            Node tempnode = head;
            int index =0;
            while (index < location-1){
                tempnode = tempnode.next;
                index++;
            }
            node.next = tempnode.next;
            tempnode.next  = node;
        }
        size++;
    }

    //traversal in csll
    public void traverseCSLL(){

        if (head != null){
            Node tempnode = head;
            for (int i = 0; i < size; i++) {

                System.out.print(tempnode.value);
                if (i != size-1){
                    System.out.print("-->");
                }
                tempnode = tempnode.next;
            }
            System.out.println();
        }
        else {
            System.out.println("CSLL does not exist");
        }
    }

    // search in CSLL

    public boolean searchCSSLL(int nodevalue){
        if (head != null){
            Node tempnode = head;
            for (int i = 0; i < size; i++) {

                if (tempnode.value == nodevalue){
                    System.out.println("node found at location "+ i);
                    return true;
                }
                tempnode = tempnode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    //delete in CSSL
    //delete first node case1 only one node| case2 more than one node
    //delete last node case1 only one node| case2 more than one node

    public void deleteNodeCSLL(int location){
        if(head == null){
            System.out.println("CSLL does not exist");
            return;
        } else if (location == 0) {
            //more than one element
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0){
                head = null;
                head.next =null;
                tail = null;
            }
        } else if (location >= size) {
            Node tempnode = head;
            for (int i = 0; i < size-1; i++) {
                tempnode =tempnode.next;
            } //after finishing this loop tep node holds the location which is located before the last node
            if (tempnode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempnode.next =head;
            tail =tempnode;
            size--;
        }
        else {
            Node tempnode = head;
            for (int i = 0; i < location-1; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
            size--;
        }
    }

    //delete entire CSLL

    public void deleteEntireCSSL(){
        if (head == null){
            System.out.println("CSLL does not exist");
        }
        else {
            head = null;
            tail.next = null; //here we are accessing last node next ref
            tail = null;
            System.out.println("CSLL deleted successfully");
        }
    }



}
