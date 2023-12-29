package LLproblems.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        LinkedList ll1 = new LinkedList();
        ll1.insertNode(7);
        ll1.insertNode(1);
        ll1.insertNode(6);
        ll1.traversalLL();

        LinkedList ll2 = new LinkedList();
        ll2.insertNode(5);
        ll2.insertNode(9);
        ll2.insertNode(2);
        ll2.traversalLL();

        //Quetions first = new Quetions();
       // first.deleteDups(ll);

        //Quetions two = new Quetions();
        // Node n = first.nthToLast(ll,4);
       // System.out.println(n.value);

        //Quetions three = new Quetions();
       // ll1.traversalLL();
      // first.partition(ll1,15);
     //   ll1.traversalLL();

//        Quetions four = new Quetions();
//        LinkedList result = four.sumOfLists(ll1,ll2);
//        result.traversalLL();

        Quetions five = new Quetions();

//        five.addsameNode(ll1,ll2,155);
//        five.addsameNode(ll1,ll2,156);
//        five.addsameNode(ll1,ll2,157);
        five.addsameNode(ll1,ll2,158);
        five.addsameNode(ll1,ll2,159);
        ll1.traversalLL();
        ll2.traversalLL();

        Node intersection = five.intersectionOfLLs(ll1,ll2);

        System.out.println(intersection.value);
    }
}