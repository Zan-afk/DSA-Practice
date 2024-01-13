package Bst;

public class BST {

    public class Node{

        private int value;
        private Node right;
        private Node left;
        private int height;

        public Node(int value){
            this.value = value;
        }

    }


    public BST(){} //this is default constructor
    private Node root;

    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }

    boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        root = insert(value, root); //this root= is cause after the func calls popping out from the below method insert in the stack at the end it will not change the value of root at the end of the calls so we just assign the return value of root to root=

    }

    private Node insert(int value, Node node){

        if (node==null){
            node = new Node(value);
            return node; //here we are returning node (after it setting null to its value) which we want to insert in the tree at specific location
        }

        if (value < node.value){ //suppose we are checking with root node
            node.left = insert(value,node.left);//this insert func returns the value of node from 42 line and assign it to node.left means the node actually we want to inser it.after if cond it will go to line55 after this check line no 55
        }

        if (value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left), height(node.right));

        return node;//here we are returning node which was pass in the argument so value of other elements in tree remains same only inserting nodes value will be change in if cond.
    }


    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }

        int mid = (start+end)/2;

        this.insert(nums[mid]);

        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }


    //below func checks tree is balance or not
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    //display method
    public void display(){
        display(this.root,"root node: ");
    }

    private void display(Node node, String details){
        if (node==null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left,"left child of "+ node.value+" : ");
        display(node.right,"right child of "+ node.value+" : ");
    }



















}
