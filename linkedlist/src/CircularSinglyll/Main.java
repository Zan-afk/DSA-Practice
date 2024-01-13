package CircularSinglyll;

public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList CSLL = new CircularSinglyLinkedList();
        CSLL.createCSLL(5);
        CSLL.insertCssl(10,0);
        CSLL.insertCssl(15,1);
        CSLL.insertCssl(20,8);
        CSLL.insertCssl(18,3);
        System.out.println(CSLL.head.value);
        System.out.println(CSLL.head.next.value);
        CSLL.traverseCSLL();
        CSLL.searchCSSLL(19);
        CSLL.deleteNodeCSLL(0);
        CSLL.deleteEntireCSSL();
        CSLL.traverseCSLL();
    }
}
