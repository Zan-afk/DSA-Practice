package QueueLL;

public class SinglyLinkedList {


        public Node head;
        public Node tail;
        public int size;

        public Node createSinglyLinkedList (int nodeValue){

            head = new Node();
            Node node = new Node();
            node.next = null;
            node.value = nodeValue;

            head =node;
            tail=node;

            size=1;

            return head;
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
                tail.next =node; //here we are accessing privous last node of ll and set their refrence null to new last node
                tail=node;
            }else {
                Node tempNode = head; //here we take simply temp node for processing
                int index =0;
                while (index < location-1){
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
            } else if (location ==0) {
                head =head.next;
                size--;
                if (size == 0){
                    tail =null;
                }
            } else if (location >= size) {
                Node tempnode = head;
                for (int i = 0; i < size-1; i++) {  //size -1 to find node which is before last node
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
            head=  null;
            tail= null;
            System.out.println("entire list delete successfully");
        }
    }


