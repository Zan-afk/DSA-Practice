package BinarySearchTree;
import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {

    BinaryNode root;

    public BinarySearchTree(){
        root = null;
    }

    //insert node in tree (Cant understand algo of insert else if and else condN )

    private BinaryNode insertNode(BinaryNode currNode , int value){


        if (currNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("value is successfully inserted");
            return newNode;
        } else if (value <= currNode.value) {
            currNode.left = insertNode(currNode.left,value);
            return currNode;
        }
        else {
            currNode.right = insertNode(currNode.right , value);
            return currNode;
        }

    }

    void insertNode(int value){
//        insertNode(root,value);
        root = insertNode(root,value);
    }

    //preorder traversal

    public void preorder(BinaryNode node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //inorder traversal
    public void inorder(BinaryNode node){
        if (node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);

    }

    //postorder traversal

    public void postorder(BinaryNode node){
        if (node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }

    //level order traversal

    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value +" ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    //search in bst

    public BinaryNode searchNode(BinaryNode node, int value){
        if (node == null){
            System.out.println("value does not found in BST");
            return null;
        } else if (node.value == value) {
            System.out.println("value: "+value+" found in BST");
            return node;
        }
        else if(value < node.value){
            return searchNode(node.left,value); //here we are eliminating all right sub-trees
        }
        else {
            return searchNode(node.right,value);
        }
    }

    //delete node BST  //cant understand this methods algo
    //consider 3 cases over here 1:the node deleted is leaf node 2:the deleted node has one child 3:the node has 2child(i.e. rootNode)

    //first we find minimum node of root
    public static BinaryNode minimumNode(BinaryNode root){
        if (root.left == null){
            return root;
        }else {
            return minimumNode(root.left);
        }

    }
    //delete method

    public BinaryNode deleteNode(BinaryNode root, int value){
        if (root == null){
            System.out.println("value not found in BST");
            return null;
        }

        if (value < root.value){
            root.left = deleteNode(root.left,value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right,value);
        }
        else {
            if (root.left != null && root.right != null){
                BinaryNode temp = root;
                //find successor of temp
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                //delete that successor node from tree
                root.right = deleteNode(root.right,minNodeForRight.value); //here we are taking root.right = because the delete method actually deleting node which we want (staring the process or staring point root.right)and return the node (root.right itself)

            } else if (root.left != null) {
                //here we are setting the left child of root node (which has to delete) to the root nodes parent child
                //by doing this the node which we want to delete is automatically deleted or eligebel for GC cause no ref is pointing towards this node
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            }
            else {
                root = null;
            }
        }
        return root;
    }



    //delete BST
    public void deleteBST(){
        root = null;
        System.out.println("BST has been deleted successfully");
    }































}
