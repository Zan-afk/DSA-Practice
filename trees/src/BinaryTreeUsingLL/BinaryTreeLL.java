package BinaryTreeUsingLL;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLL {

     BinaryNode root;

     public BinaryTreeLL(){

         this.root = null;
     }

     //preorder traversal

    void preorder(BinaryNode node){

         if (node == null){ //this is base cond where it will check node.left is null and node.right is null then it will return
             return;
         }
        System.out.print(node.value + " ");
         preorder(node.left);
         preorder(node.right);
    }


    //inorder traversal

    void inorder(BinaryNode node){

         if (node == null){
             return;
         }
         inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);

    }

    //postorder traversal

    void postorder(BinaryNode node){
         if (node == null){
             return;
         }
         postorder(node.left);
         postorder(node.right);
        System.out.print(node.value + " ");
    }

    //levelorder traversal

    public void levelorder(){

         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);

         while (!queue.isEmpty()){
             BinaryNode presentNode = queue.remove();
             System.out.print(presentNode.value + " ");

             if (presentNode.left != null){
                 queue.add(presentNode.left);
             }

             if (presentNode.right != null){
                 queue.add(presentNode.right);
             }

         }


//        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
//        queue.add(root);
//
//        while (!queue.isEmpty()){
//            BinaryNode presentNode = queue.remove();
//            System.out.print(presentNode.value +" ");
//            if (presentNode.left != null){
//                queue.add(presentNode.left);
//            }
//            if (presentNode.right != null){
//                queue.add(presentNode.right);
//            }
//        }
    }



    //search node in tree

    public void search(String value){
         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);

           while (!queue.isEmpty()){

             BinaryNode presentNode = queue.remove();
             if (presentNode.value == value){
                 System.out.println("the value "+value+" is found in tree");
                 return;
             }
             else {
                 if (presentNode.left != null ) {

                     queue.add(presentNode.left);
                 }


                if (presentNode.right != null ) {
                    queue.add(presentNode.right);
                }


             }
           }

           System.out.println("the value "+value+" is not found in tree");
         }

    //insert node in tree

        public void insertnode(String value){   //here we are inserting a node only to the leaf nodes using levelorder

             BinaryNode newnode = new BinaryNode();
             newnode.value = value;

             if (root == null){

                    root = newnode;
                     System.out.println("Inserted new node at root");
                     return;
             }

             Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
             queue.add(root);

             while (!queue.isEmpty()){

                 BinaryNode presentNode = queue.remove();
                 if(presentNode.left == null){
                     presentNode.left = newnode;
                     System.out.println("successfully inserted");
                     break;
                 }
                 else if(presentNode.right == null){
                     presentNode.right = newnode;
                     System.out.println("successfully inserted");
                     break;
                 }
                 else {
                     queue.add(presentNode.left);
                     queue.add(presentNode.right);
                 }

             }




        }

        //get deepest node

     public BinaryNode getDeepestNode(){

         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);
         BinaryNode presentNode = null;

         while (!queue.isEmpty()){
             presentNode = queue.remove();
             if (presentNode.left != null){
                 queue.add(presentNode.left);
             }
             if (presentNode.right != null){
                 queue.add(presentNode.right);
             }
         }
         return presentNode;
     }

     //Delete deepest node

        public void deleteDeepestNode(){
         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);
         BinaryNode previousNode , currNode = null;

         while (!queue.isEmpty()){

             previousNode = currNode;
             currNode = queue.remove();

             if (currNode.left == null){
                 previousNode.right = null;  //consider we are at nodeN5(i.e N5.left == null N5.right == null) then we have to set nodeN4.right child to null because we are deleting deepest node
                 return;
             } else if (currNode.right == null) {
                 currNode.left = null;
                 return;
             }

                 queue.add(currNode.left);
                 queue.add(currNode.right);

         }
        }

        //Delete given node

        void deleteNode(String value){

         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);
            while (!queue.isEmpty()){
                BinaryNode presentNode = queue.remove();
                if (presentNode.value == value){
                    presentNode.value = getDeepestNode().value; //here we are accessing the value of last leaf/node in the tree and set that value to the node which we have to delete
                    deleteDeepestNode();//here we are simply deleted last node in the tree because of duplication of values
                    System.out.println("the node is deleted");
                    return;
                }
                else {

                    if (presentNode.left != null){
                        queue.add(presentNode.left);
                    }
                    if (presentNode.right != null){
                        queue.add(presentNode.right);
                    }
                }
            }
            System.out.println("the node does not exist in BT");
        }

        //delete binary tree

        void deleteBinaryTree(){
         root = null;
            System.out.println("Binary Tree has been deleted");
        }









    }




