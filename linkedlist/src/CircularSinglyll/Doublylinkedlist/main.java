package CircularSinglyll.Doublylinkedlist;

public class main {
    public static void main(String[] args) {

        Doublylinkedlist DLL = new Doublylinkedlist();
        DLL.CreateDDL(5);
        DLL.insertDLL(10,0);
        DLL.insertDLL(15,1);
        DLL.insertDLL(20,8);
        DLL.insertDLL(25,9);

        System.out.println(DLL.head.value);
        DLL.traverseDLL();
        DLL.reverseTraverseDLL();
        DLL.searchNodeDLL(15);
        DLL.deleteNodeDLL(1);
        DLL.traverseDLL();
        DLL.DeleteEntireDLL();
        DLL.traverseDLL();
    }
}
