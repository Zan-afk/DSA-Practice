package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    public DoublyNode createCDLL(int nodeValue){

         head =new DoublyNode();
         DoublyNode newNode = new DoublyNode();
         newNode.value = nodeValue;
         newNode.next = newNode;
         newNode.prev = newNode;

         head = newNode;
         tail = newNode;
         size = 1;
         return head;
    }
    
    
    //insertion in CDLL
    
    public void insertInCDLL(int nodeValue , int location){

        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if (head == null){

            createCDLL(nodeValue);
            return;
        } else if (location == 0) {

            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next =newNode;
            head = newNode;
        } else if (location >= size) {

            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }

        else {
            DoublyNode tempnode = head;
            int index =0;
            while (index < location-1){
                tempnode =tempnode.next;
                index++;
            }
            newNode.next = tempnode.next;
            newNode.prev =tempnode;
            tempnode.next = newNode;
            newNode.next.prev = newNode;

        }

        size++;
    }

    //traverse in CDLL

    public void traverseInDLL(){

        if (head != null){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("-->");
                }
                tempNode =tempNode.next;
            }
        }
        else {
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }

    //reverse traverse in CDLL

    public void reverseTraverseInCDLL(){

        if (head != null){
            DoublyNode tempnode = tail;
            for (int i = 0; i < size; i++) {

                System.out.print(tempnode.value);
                if (i != size-1){
                    System.out.print("<--");
                }
                tempnode = tempnode.prev;
            }
        }
        else {
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }


    //Search in DLL

    public boolean searchNodeInDLL(int nodeValue){

        if (head != null){

            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {

                if (tempNode.value == nodeValue){
                    System.out.println("node found at location: "+i);
                    return true;
                }
                tempNode =tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    //Delete in DLL
    //there will be three cases 1 delete at fist node in these there will be 2 conditions ll has only one node or more than one node
    //case 2 delete at any given location
    //case 3 delete at end of ll in these there will be 2 conditions ll has only one node or more than one node


    public void deleteNodeInCDLL(int location){

        if (head == null){
            System.out.println("CDLL does not exist");
            return;
        } else if (location == 0) {
            if (size == 1){
                head.next = null;
                head.prev = null;
                head = tail = null;
                size --;
                return;
            }
            else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size --;
            }
        } else if (location >= size) {

            if (size == 1){
                head.next = null;
                head.prev = null;
                head = tail = null;
                size --;
                return;
            }
            else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size --;
            }
        }
        else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev =tempNode;
            size --;
        }

    }

    //Delete entire CDLL

    public void deleteEntireCDLL(){
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {

            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("CDLL has been deleted");
    }







}
