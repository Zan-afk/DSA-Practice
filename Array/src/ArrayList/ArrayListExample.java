
package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(55);
        list.add(87);
        list.add(46);
        list.add(64);
        list.add(43);

        list.set(1,100);
        list.remove(2);
        System.out.print(list.contains(46));
        System.out.println(list);
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrlist.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arrlist.get(i));
        }

    }
}
