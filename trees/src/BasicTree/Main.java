package BasicTree;

public class Main {

    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode beer = new TreeNode("beer");
        TreeNode wine = new TreeNode("wine");

        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(beer);
        cold.addChild(wine);
        System.out.println(drinks.print(0));

    }


}
