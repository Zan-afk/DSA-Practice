import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }


    private class Node{

        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }


    private Node root;

    //insert element below func is to insert root first in tree

    public void populate(Scanner scanner){

        System.out.println("Enter the root Node: " );
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node){

        System.out.println("do you want to enter left of node "+ node.value);
        boolean left = scanner.nextBoolean();


        if (left){
            System.out.println("enter value of left of node "+ node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter right of node "+ node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("enter value of right of node "+ node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }


    public void display(){
        display(this.root," ");
    }

    private void display(Node node, String indent){

        if (node==null){
            return;
        }
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }


    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){
        if (node==null){
            return;
        }

        prettyDisplay(node.right, level+1);

        if (level!=0){
            for (int i = 0; i < level; i++) {
                System.out.print("| \t\t");
            }
            System.out.println("|------->"+node.value);
        }
        else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left,level+1);
    }


    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node node){
        if (node== null){
            return;
        }

        System.out.println(node.value +" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(Node node){
        if (node== null){
            return;
        }


        inOrder(node.left);
        System.out.println(node.value +" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(Node node){
        if (node== null){
            return;
        }


        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value +" ");
    }






























}
