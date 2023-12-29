package CircularDoublyLinkedList;

public class main {

    public static void main(String[] args) {
        CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();

        CDLL.createCDLL(5);
        System.out.println(CDLL.head.value);
        CDLL.insertInCDLL(10,0);
        CDLL.insertInCDLL(15,1);
        CDLL.insertInCDLL(20,5);
        CDLL.insertInCDLL(25,8);
        CDLL.traverseInDLL();
        CDLL.reverseTraverseInCDLL();
        CDLL.searchNodeInDLL(25);
        CDLL.deleteEntireCDLL();
        CDLL.traverseInDLL();



    }
}
