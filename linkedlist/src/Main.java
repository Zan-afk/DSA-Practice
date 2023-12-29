public class Main {
    public static void main(String[] args) {
        //first step for create linked list create 3 classes [main,node,singlylinkedlist]

        SinglyLinkedList sll =new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);
        sll.insertLinkedList(8,0);
        sll.insertLinkedList(10,3);
        sll.insertLinkedList(115,9);
      //  sll.insertLinkedList(11,2);
        sll.insertLinkedList(100,7);
        sll.insertLinkedList(12,4);
        sll.insertLinkedList(122,0);
        sll.insertLinkedList(11,2);

        sll.deletionOfNode(7);
       // System.out.println(sll.head.next.next.value);
        sll.traverseSinglyLinkedList();
       // sll.searchNode(12);
//        sll.deletionOfNode(5);
//        sll.deleteEntireSll();
//        sll.traverseSinglyLinkedList();
    }


}