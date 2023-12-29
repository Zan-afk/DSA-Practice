package LLproblems.src;

import java.util.ArrayList;
import java.util.HashSet;

// delete duplicate elements from ll
public class Quetions {

//    void deleteDups(LinkedList ll) {
//        HashSet<Integer> hs = new HashSet();
//        Node current = ll.head;
//        Node prev = null; //here var prev is connecting links between ll if it not dupli. it cooncting to next node and if it value dpli.then it connects to next node
//        while (current != null) {
//            int curval = current.value;
//            if (hs.contains(curval)) {
//                prev.next = current.next; //here we are creating links between nodes which not dupl. for prev.
//                ll.size--;
//            } else {
//                hs.add(curval);
//                prev = current;
//            }
//            current = current.next; //here we have to update current node to its next node for checking
//        }
//    }

    void deleteDups(LinkedList ll) {
        ArrayList<Integer> ar =new ArrayList<Integer>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (ar.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                ar.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    // return a node nth to last

    Node nthToLast(LinkedList ll , int n){

        Node pt1 = ll.head;
        Node pt2 = ll.head;

        for (int i = 0; i < n; i++) {
            if (pt2 == null){
                return null;
            }
            pt2 = pt2.next;
        }

        while (pt2 != null){

            pt1 = pt1.next;
            pt2 = pt2.next;
        }
        return pt1;

    }

    //partition of ll on value of x

    LinkedList partition (LinkedList ll , int x){

        Node currNode = ll.head;
        ll.tail = currNode;

        while (currNode != null ){

            Node next = currNode.next;//here we are saving the value or memory of cuurnode.next to next node.

            if (currNode.value < x){ //here we only adding node which value is less than x

                currNode.next = ll.head;//here we adding node at beggining because it is less thanx
                ll.head = currNode;
            }
            else {
                ll.tail.next = currNode;
                ll.tail = currNode;
            }
            currNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    //sum of 2 linked list which have reverse no.

    LinkedList sumOfLists(LinkedList ll1, LinkedList ll2){
        Node A = ll1.head;
        Node B = ll2.head;
        int carry = 0;

        LinkedList resultll = new LinkedList();

        while (A != null || B != null){
            int result = carry;

            if (A != null){
                result += A.value;
                A = A.next;
            }
            if (B != null){
                result += B.value;
                B = B.next;
            }

            resultll.insertNode(result %10);
            carry = result/10;
        }
        return resultll ;
    }


    // question find intersection of lists

    //find kth element in loger ll

    Node getKthNode(Node head , int k){
        Node curr = head;
        while (k > 0 && curr != null){

            curr = curr.next;
            k--;
        }
        return curr;
    }

    //find intersection

    Node intersectionOfLLs(LinkedList lista, LinkedList listb){
        if (lista.head == null || listb.head == null){
            return null;
        }
        if (lista.tail != listb.tail){
            return null;
        }

        Node shorter = new Node();
        Node longer = new Node();

        if (lista.size > listb.size){
            longer = lista.head;
            shorter = listb.head;

        }else {
            longer = listb.head;
            shorter = lista.head;
        }

        longer = getKthNode(longer , Math.abs(lista.size - listb.size));

        while (longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }

    //add same node in ll

    void addsameNode(LinkedList a , LinkedList b , int nodeValue){

        Node newNode = new Node();
        newNode.value = nodeValue;
        a.tail.next = newNode;
        a.tail = newNode;
        b.tail.next = newNode;
        b.tail = newNode;
    }

}
