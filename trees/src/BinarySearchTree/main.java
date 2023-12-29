package BinarySearchTree;

public class main {
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(70);
        binarySearchTree.insertNode(50);
        binarySearchTree.insertNode(90);
        binarySearchTree.insertNode(30);
        binarySearchTree.insertNode(60);
        binarySearchTree.insertNode(80);
   //     binarySearchTree.insertNode(85);
        binarySearchTree.insertNode(100);
        binarySearchTree.insertNode(20);
   //     binarySearchTree.insertNode(40);
        //System.out.println(binarySearchTree.root);
//        binarySearchTree.searchNode(binarySearchTree.root,45);
//        binarySearchTree.deleteBST();

        binarySearchTree.levelOrder();
        System.out.println();
 //       binarySearchTree.deleteNode(binarySearchTree.root,40);
        binarySearchTree.deleteNode(binarySearchTree.root,70);//remove insert node(40)
  //      binarySearchTree.deleteNode(binarySearchTree.root,70);
        binarySearchTree.levelOrder();

    }

}
