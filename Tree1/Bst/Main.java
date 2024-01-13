package Bst;

public class Main {

    public static void main(String[] args) {


        BST bsttree =new BST();

        int[] nums = {5,2,7,1,4,6,9,8,3,10};

        bsttree.populate(nums);
        bsttree.display();

    }
}
