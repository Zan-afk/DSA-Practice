package AVLtrees;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;

    AVLTree(){
        root = null;
    }

    //preorder traversal
    public void preOrder(BinaryNode node){
        if (node == null){
            return;
        }
        System.out.println(node.value +" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder traversal
    public void inOrder(BinaryNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value +" ");
        inOrder(node.right);
    }

    //postorder traversal    
    public void postOrder(BinaryNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value +" ");
    }

    //level order traversal
    public void levelOrder(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value+" ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    //search method
    BinaryNode searchNode(BinaryNode node, int value){
        if (node == null){
            System.out.println("value: "+value+" not found in tree");
            return null;
        } else if (node.value == value) {
            System.out.println("value: "+value+" found in tree");
            return node;
        } else if (value < node.value) {
            return searchNode(node.left , value);
        }
        else {
            return searchNode(node.right , value);
        }
    }

    // get height
    public int getHeight(BinaryNode node){
        if (node == null){
            return 0;
        }
        return node.height;
    }

    // rotate right

    private BinaryNode rotateRight(BinaryNode disbalancedNode){
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right; //here we actually setting disbalanced node's left's child.right(basically disbalanced node's grandchild of right) to disbalanced node.left.  
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1+ Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right)); //we are adding 1 because we have to count disbalanced node also
        newRoot.height = 1+ Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }

    //rotate left

    private BinaryNode rotateLeft(BinaryNode disbalancedNode){
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left; //here we actually setting 1 disbalanced node's left child =
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1+ Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right)); //we are adding 1 because we have to count disbalanced node also
        newRoot.height = 1+ Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }

    // get balance node

    public int getBalanced(BinaryNode node){
        if (node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // insert node method

    private BinaryNode insertNode(BinaryNode node, int nodeValue){

        if (node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left , nodeValue);
        }
        else {
            node.right = insertNode(node.right , nodeValue);
        }

        node.height = 1+ Math.max(getHeight(node.left),getHeight(node.right)); //this is for the update of new tree height
        int balance = getBalanced(node);

        if (balance > 1 && nodeValue < node.left.value){ //this conditions always check the node value with its grandparent child i.e node.left or node.right
            return rotateRight(node); //this is ll condN
        }
        if (balance > 1 && nodeValue > node.left.value){
            node.left = rotateLeft(node.left);
            return  rotateRight(node);  //this is lr condN [if we compare balance and if we compare value which we have to insert to disbalance nodes right or left child we are actually getting which cond is this to rotate tree] suppose here balance is +1 means left subtree height is greater than so first consider [cond-left] then we are comapring second condition if node value we have to insert is greater or smaller than node.left to see [cond-left-left] or [cond-left-right].
        }
        if (balance < -1 && nodeValue > node.right.value){
            return rotateLeft(node);  //this is rr condN here balance is-1 so first condition is [cond-right] and if node value is greater than disbalance node.right its[cond-right-right]. 
        }
        if (balance < -1 && nodeValue < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);  //this is rl condN
        }
        return node;

    }

    public void insert(int value){

        root = insertNode(root,value); //here we are writing root=insertNode cause at very first time we code runs root is null so in insert function it will check first if condition that node is null or not if it null then it will initialize that node and return that node then this line will set root= that node. and root is set in that tree after that the if condition in insert (is not going to always runs every time it will run only when it needeed cause root is now not null) every node is trying to fit either left or right of root and at the end insert function recursively return root node only.
    }

    // minimum node method(to find successor)

    public static BinaryNode minimumNode(BinaryNode root){
        if (root.left == null){
            return root;
        }
        return minimumNode(root.left);
    }

    //delete node

    public BinaryNode deleteNode(BinaryNode node , int value){
        if (node == null){
            System.out.println("value not found");
            return node;
        }
        if (value < node.value){
            node.left = deleteNode(node.left , value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right , value);
        }
        else {
            if (node.left != null && node.right != null){
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right , minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node =node.right;
            }
            else {
                node = null;
            }
        }
        int balance = getBalanced(node);
        if (balance >1 && getBalanced(node.left)>= 0){ //here ex.1-0 =1 or 1-1=0 check height for node.left from that node only we can get sec cond which is left or right
            return rotateRight(node); //this is LL condn
        }
        if (balance >1 && getBalanced(node.left)<0){  //here diff between node is actually less than o because we are getting height by elimimating rightsubtree height from left subtree ex.0-1=-1
            node.left = rotateLeft(node.left);
            return rotateRight(node); //this is LR condn
        }
        if (balance <-1 && getBalanced(node.right)<= 0){ //here in rr and ll condition please consider o result by doing this we dont need do consider the what if lr rl condition getting reslt 0 because we are already rotating tree when result o hits on condition ll & rr
            return rotateLeft(node);  //this is RR condn
        }
        if (balance <-1 && getBalanced(node.right)>0){
            node.right = rotateRight(node.right);
            return rotateLeft(node);  //this is RL condn
        }

        return node;
    }
    public void delete(int value){

        root = deleteNode(root,value);
    }

    //delete AVL tree

    public void deleteAVL(){
        root = null;
        System.out.println("AVL tree has been deleted");
    }











}
