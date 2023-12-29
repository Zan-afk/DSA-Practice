package BasicTree;

import java.util.ArrayList;

public class TreeNode {

    String data;
    ArrayList<TreeNode> children; //here we are saving every node children in their respective arraylist

    public TreeNode(String data){
        this.data=data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node){

        this.children.add(node);
    }

    public String print(int level){
        String result;
        result = "  ".repeat(level)+data+"\n";
        for (TreeNode node: this.children) {

            result += node.print(level+1);
        }
        return result;
    }





}
