public class SinglyLinkedList {

    public Node head; //head is just a ref variable
    public Node tail;
    public int size;

    public Node createSinglyLinkedList (int nodeValue){

        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;

        head =node;
        tail =node;

        size=1;

        return head; //here we are returning the value of head which is node
    }


    //insert method for singly linked list

    public void insertLinkedList(int nodeValue , int location ){
        Node node =new Node();
        node.value = nodeValue;

        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next =head;
            head =node;
        } else if (location >= size) {
            node.next =null;
            tail.next =node; //here we are accessing previous last node of ll and set their refrence to new last node
            tail=node; //we are setting value of tail as latest node we want to add in the last of list
        }else {
            Node tempNode = head; //here we take simply temp node for processing
            int index =0; //here index start from 0 please note how the loop works
            while (index < location-1){ //its index or pointer staying at element present in location-2 and after that tempnode is staying at location-1
                tempNode = tempNode.next;  //these temp node set to be as a node after which we have to include our node
                index++;
            }
            Node nextNode = tempNode.next; //here we take next node (new node) to accessing the memory location of node which comes after the inserting of our node
            tempNode.next =node; //here we set the node location i.e our node which we have to insert to the temp node we created
            node.next = nextNode; //here we set our inserting node next property to the node which would come after our inserting node
            //it can be also as
            // node.next = tempnode.next;
            //tempnode.next =node;
        }
        size++;

    }

    //SinglyLinked list traversal

    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("SLL does not exist");

        }
        else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }


    //search for a node

    boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.print("found the node at location "+ i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("node not found ");
        return false;
    }


    // deleting node from list


    public void deletionOfNode (int location){

        if (head == null){
            System.out.println("the sll does not exist");
            return;
        } else if (location == 0) {
            head =head.next;
            size--;
            if (size == 0){
                tail =null; //here we are setting tail ref to null because there is one element which was deleted
            }
        } else if (location >= size) {
            Node tempnode = head;
            for (int i = 0; i < size-1; i++) {  //i < size -1 to find node which is before last node for loop runs till the node size-2 and for last round of for loop it will execute tempnode =tempnode.next; this statement and we are ultimately reaching to node which was before the last node
                tempnode =tempnode.next;
            }
            if (tempnode == head){ //if these true means ll have only one node
                tail =head =null;
                size--;
                return;
            }
            tempnode.next =null;
            tail = tempnode;
            size--;
        }
        else {
            Node tempnode = head;
            for (int i = 0; i < location-1; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next; //here we setting the link between temp node and node which comes afer the node we have to delete
            size--;
        }
    }


    // deleting entire sl list

    public void deleteEntireSll (){
        head= null;
        tail= null;
        System.out.println("entire list delete successfully");
    }
}
