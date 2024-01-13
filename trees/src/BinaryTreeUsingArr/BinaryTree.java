package BinaryTreeUsingArr;

public class BinaryTree {

//here we are creating tree using array and not gonna use 0th index of array for our simple calculations i.e for

    String arr[];
    int lastUsedIndex; //this var keeps track of last element in array

    public BinaryTree(int size){

        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank BT of size "+size+" has been created");
    }

    //is full

    boolean isFull(){
        if (arr.length-1 == lastUsedIndex){
            return true;
        }
        else {
            return false;
        }
    }

    void insert(String value){
        if (!isFull()){
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("the value "+value+" has been inserted");
        }
        else {
            System.out.println("binary tree is full");
        }
    }

    //preorder traversal (root->left subtree->right subtree)

    public void preorder(int index){
        if (index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preorder(index * 2); //index*2 we are accessing left node of root
        preorder(index * 2+1);//index*2+1 we are accessing right child/node of root
    }

    //inorder traversal

    public void inorder(int index){
        if (index > lastUsedIndex){
            return;
        }

        inorder(index * 2);
        System.out.print(arr[index]+ " ");
        inorder(index * 2+1);

    }

    //postorder traversal

    public void postorder(int index){
        if (index > lastUsedIndex){
            return;
        }

        postorder(index *2);
        postorder(index * 2+1);
        System.out.print(arr[index]+ " ");

    }

    //level order traversal

    public void levelOrder(){
        for (int i = 1; i <= lastUsedIndex ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //search method

    public int search(String value){
        for (int i = 1; i <= lastUsedIndex ; i++) {

            if (arr[i] == value){
                System.out.println(value +" value is found at location: "+i);
                return i;
            }
        }
        System.out.println("the value does not exist in BT");
        return -1;
    }

    //delete node

    public void deleteNode(String value){
        int location = search(value);
        if (location == -1){
            return;
        }
        else {
            arr[location] = arr[lastUsedIndex]; //here we are setting last node value to curr node
            lastUsedIndex--;
            System.out.println("the node successfully deleted");
        }
    }

    //deleteBT

    public void deleteBT(){
        try {
            arr = null;
            System.out.println("the BT has been successfully deleted");
        }
        catch (Exception e){
            System.out.println("there was an error deleting the tree");
        }
    }








}
