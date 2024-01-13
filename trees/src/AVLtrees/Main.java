package AVLtrees;

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(30);
        avlTree.insert(25);
        avlTree.insert(35);
        avlTree.insert(20);
        avlTree.insert(15);
        avlTree.insert(5);
        avlTree.insert(10);
        avlTree.insert(50);
        avlTree.insert(60);
        avlTree.insert(70);
        avlTree.insert(65);
        System.out.println(avlTree.getHeight(avlTree.root.right));
        avlTree.inOrder(avlTree.root);

        

    }


}
